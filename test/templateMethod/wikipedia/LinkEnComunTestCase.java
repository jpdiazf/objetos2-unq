package templateMethod.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTestCase {
	LinkEnComun filtro;
	WikipediaPage pageBernal;
	WikipediaPage pageBsAs;
	WikipediaPage pageQuilmes;
	WikipediaPage pageLP;
	
	@BeforeEach
	void setUp() {
		filtro = new LinkEnComun();
		pageQuilmes = mock(WikipediaPage.class);
		pageBernal = mock(WikipediaPage.class);
		pageBsAs = mock(WikipediaPage.class);
		pageLP = mock(WikipediaPage.class);
		
		when(pageBsAs.getLinks()).thenReturn(Arrays.asList(pageQuilmes, pageBernal, pageLP));
		when(pageQuilmes.getLinks()).thenReturn(Arrays.asList(pageBernal));
		when(pageBernal.getLinks()).thenReturn(Arrays.asList(pageQuilmes, pageBsAs));
		when(pageLP.getLinks()).thenReturn(Arrays.asList(pageBsAs));
	}
	
	@Test
	void bsAsTieneLinksEnComunConBernalYQuilmesTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageLP, pageBernal, pageQuilmes);
		List<WikipediaPage> paginas = filtro.getSimilarPages(pageBsAs, paginasFiltro);
		
		assertTrue(paginas.contains((pageQuilmes)));
		assertTrue(paginas.contains((pageBernal)));
		assertFalse(paginas.contains((pageLP)));
	}
	
	@Test
	void LPNoTieneCoincidenciasTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageBsAs, pageQuilmes);
		List<WikipediaPage> paginas = filtro.getSimilarPages(pageLP, paginasFiltro);
		
		assertFalse(paginas.contains((pageQuilmes)));
		assertFalse(paginas.contains((pageBsAs)));
	}
}

package templateMethod.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTestCase {
	MismaLetraInicial filtro;
	WikipediaPage pageBernal;
	WikipediaPage pageBsAs;
	WikipediaPage pageQuilmes;
	WikipediaPage bernal;
	
	@BeforeEach
	void setUp() {
		filtro = new MismaLetraInicial();
		pageQuilmes = mock(WikipediaPage.class);
		pageBernal = mock(WikipediaPage.class);
		pageBsAs = mock(WikipediaPage.class);
		bernal = mock(WikipediaPage.class);
		
		when(pageBsAs.getTitle()).thenReturn("Buenos Aires");
		when(pageQuilmes.getTitle()).thenReturn("Quilmes");
		when(pageBernal.getTitle()).thenReturn("Bernal");
		when(bernal.getTitle()).thenReturn("Bernal");
	}
	
	@Test
	void retornaBernalYBsAsTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageBsAs, pageBernal, pageQuilmes);
		List<WikipediaPage> paginas = filtro.getSimilarPages(bernal, paginasFiltro);
		
		assertFalse(paginas.contains((pageQuilmes)));
		assertTrue(paginas.contains((pageBernal)));
		assertTrue(paginas.contains((pageBsAs)));
	}
	
	@Test
	void noHayNingunaCoincidenciaTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageBsAs, pageBernal, bernal);
		List<WikipediaPage> paginas = filtro.getSimilarPages(pageQuilmes, paginasFiltro);
		
		assertFalse(paginas.contains((pageBsAs)));
		assertFalse(paginas.contains((pageBernal)));
		assertFalse(paginas.contains((bernal)));
	}
}

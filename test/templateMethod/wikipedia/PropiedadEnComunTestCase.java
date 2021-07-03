package templateMethod.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTestCase {
	PropiedadEnComun filtro;
	WikipediaPage pageBernal;
	WikipediaPage pageBsAs;
	WikipediaPage pageQuilmes;
	WikipediaPage pageLP;
	
	@BeforeEach
	void setUp() {
		filtro = new PropiedadEnComun();
		pageQuilmes = mock(WikipediaPage.class);
		pageBernal = mock(WikipediaPage.class);
		pageBsAs = mock(WikipediaPage.class);
		pageLP = mock(WikipediaPage.class);
		
		Map<String, WikipediaPage> infoBoxBsAs = new HashMap<>();
		infoBoxBsAs.put("UNQ", pageBernal);
		infoBoxBsAs.put("UNLP", pageLP);
		
		Map<String, WikipediaPage> infoBoxQuilmes = new HashMap<>();
		infoBoxQuilmes.put("UNQ", pageBernal);
		infoBoxQuilmes.put("UBA", pageBsAs);
		
		Map<String, WikipediaPage> infoBoxBernal = new HashMap<>();
		infoBoxBernal.put("UNLP", pageLP);
		infoBoxBernal.put("UBA", pageBsAs);
		
		Map<String, WikipediaPage> infoBoxLP = new HashMap<>();
		infoBoxLP.put("UBA", pageBsAs);
		
		when(pageBsAs.getInfobox()).thenReturn(infoBoxBsAs);
		when(pageQuilmes.getInfobox()).thenReturn(infoBoxQuilmes);
		when(pageBernal.getInfobox()).thenReturn(infoBoxBernal);
		when(pageLP.getInfobox()).thenReturn(infoBoxLP);
	}
	
	@Test
	void bsAsTienePropiedadEnComunConBernalYQuilmesTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageLP, pageBernal, pageQuilmes);
		List<WikipediaPage> paginas = filtro.getSimilarPages(pageBsAs, paginasFiltro);
		
		assertTrue(paginas.contains((pageQuilmes)));
		assertTrue(paginas.contains((pageBernal)));
		assertFalse(paginas.contains((pageLP)));
	}
	
	@Test
	void LPCoincideConQuilmesCoincidenciasTest() {
		List<WikipediaPage> paginasFiltro = Arrays.asList(pageBsAs, pageQuilmes);
		List<WikipediaPage> paginas = filtro.getSimilarPages(pageLP, paginasFiltro);
		
		assertTrue(paginas.contains((pageQuilmes)));
		assertFalse(paginas.contains((pageBsAs)));
	}
}

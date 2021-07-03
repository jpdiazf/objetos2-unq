package practicaObserver.practicaDeportiva;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppDeportesTestCase {
	AppDeportes appDeportes;
	Partido partido;
	IListener listener;
	IListener otroListener;
	
	@BeforeEach
	void setUp() {
		appDeportes = new AppDeportes();
		partido = mock(Partido.class);
		listener = mock(IListener.class);
		otroListener = mock(IListener.class);
	}
	
	@Test
	void testSeCargaUnPartidoALaAppDeDeportes() {
		Boolean expectedValue;
		appDeportes.cargar(partido);
		
		expectedValue = appDeportes.getPartidos().contains(partido);
		assertTrue(expectedValue);
	}
	
	@Test
	void testUnListenerSeSuscribeAlSistema() {
		List<String> deportes = new ArrayList<String>(Arrays.asList("Tenis", "Fútbol"));
		List<String> otrosDeportes = new ArrayList<String>(Arrays.asList("Tenis", "Fútbol"));
		List<String> deportistas = new ArrayList<String>(Arrays.asList("Fan Zhendong", "Ma Long"));
		
		Integer expectedValue;
		
		appDeportes.subscribe(listener, deportes, new ArrayList<String>());
		appDeportes.subscribe(otroListener, otrosDeportes, deportistas);
		
		expectedValue = appDeportes.getArchivos().size();
		assertEquals(2, expectedValue);
	}

}

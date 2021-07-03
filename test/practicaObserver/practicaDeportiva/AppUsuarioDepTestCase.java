package practicaObserver.practicaDeportiva;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppUsuarioDepTestCase {
	AppDeportes appDeportes;
	Partido partidoPref;
	AppUsuarioDep appUsuarioDep;
	
	@BeforeEach
	void setUp() {
		appDeportes = mock(AppDeportes.class);
		partidoPref = mock(Partido.class);
		appUsuarioDep = new AppUsuarioDep(appDeportes);
	}
	
	@Test
	void testUnaAppSeSuscribeALaAppDeDeportes() {
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("Ajedrez", "Básquet"));
		List<String> contrincantesPref = new ArrayList<String>();
		
		appUsuarioDep.subscribe(deportesPref, new ArrayList<String>());
		
		verify(appDeportes, times(1)).subscribe(appUsuarioDep, deportesPref, contrincantesPref);
	}
	
	@Test
	void testUnaAppRecibeUnNuevoPartidoDeInteres() {
		appUsuarioDep.update(partidoPref);
		
		Boolean expectedValue = appUsuarioDep.getPartidos().contains(partidoPref);
		
		assertTrue(expectedValue);
	}

}

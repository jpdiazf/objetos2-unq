package practicaObserver.practicaDeportiva;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorDeportesTestCase {
	ServidorDeportes servidorDep;
	AppDeportes appDeportes;
	Partido partidoPref;
	
	@BeforeEach
	void setUp() {
		appDeportes = mock(AppDeportes.class);
		partidoPref = mock(Partido.class);
		servidorDep = new ServidorDeportes(appDeportes);
	}
	
	@Test
	void testUnServidorSeSuscribeALaAppDeDeportes() {
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("Ajedrez", "Básquet"));
		List<String> contrincantesPref = new ArrayList<String>();
		
		servidorDep.subscribe(deportesPref, new ArrayList<String>());
		
		verify(appDeportes, times(1)).subscribe(servidorDep, deportesPref, contrincantesPref);
	}
	
	@Test
	void testUnServidorRecibeUnNuevoPartidoDeInteres() {
		servidorDep.update(partidoPref);
		
		Boolean expectedValue = servidorDep.getPartidos().contains(partidoPref);
		
		assertTrue(expectedValue);
	}	
}

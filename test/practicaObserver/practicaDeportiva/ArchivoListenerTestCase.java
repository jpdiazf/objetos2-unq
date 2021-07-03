package practicaObserver.practicaDeportiva;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoListenerTestCase {
	ArchivoListener archivo;
	Partido partido;
	IListener listener;
	
	@BeforeEach
	void setUp() {
		partido = mock(Partido.class);
		listener = mock(IListener.class);
	}
	
	@Test
	void testNotificaAUnUsuarioPorPreferenciaDeDeporte() {
		List<String> contrincantes = new ArrayList<String>(Arrays.asList("Diego Alegre", "Joaquín Oñate"));
		
		when(partido.getDeporte()).thenReturn("Esgrima");
		when(partido.getContrincantes()).thenReturn(contrincantes);
		
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("Esgrima", "Natación"));
		List<String> contrincantesPref = new ArrayList<String>(Arrays.asList("Phelps"));
		archivo = new ArchivoListener(listener, deportesPref, contrincantesPref);
		
		archivo.notify(partido);
		
		verify(listener, times(1)).update(partido);
	}
	
	@Test
	void testNotificaAUnUsuarioPorPreferenciaDeContrincante() {
		List<String> contrincantes = new ArrayList<String>(Arrays.asList("Messi", "Gotze"));
		
		when(partido.getDeporte()).thenReturn("Fútbol");
		when(partido.getContrincantes()).thenReturn(contrincantes);
		
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("", ""));
		List<String> contrincantesPref = new ArrayList<String>(Arrays.asList("Messi"));
		archivo = new ArchivoListener(listener, deportesPref, contrincantesPref);
		
		archivo.notify(partido);
		
		verify(listener, times(1)).update(partido);
	}
	
	@Test
	void testNotificaAUnUsuarioPorPreferenciaDeAmbasCategorias() {
		List<String> contrincantes = new ArrayList<String>(Arrays.asList("Messi", "Gotze"));
		
		when(partido.getDeporte()).thenReturn("Fútbol");
		when(partido.getContrincantes()).thenReturn(contrincantes);
		
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("Fútbol"));
		List<String> contrincantesPref = new ArrayList<String>(Arrays.asList("Messi", "Gotze"));
		archivo = new ArchivoListener(listener, deportesPref, contrincantesPref);
		
		archivo.notify(partido);
		
		verify(listener, times(1)).update(partido);
	}
	
	@Test
	void testNoNotificaAlUsuarioPorqueNoHayCoincidencias() {
		List<String> contrincantes = new ArrayList<String>(Arrays.asList("Messi", "Gotze"));
		
		when(partido.getDeporte()).thenReturn("Fútbol");
		when(partido.getContrincantes()).thenReturn(contrincantes);
		
		List<String> deportesPref = new ArrayList<String>(Arrays.asList("", ""));
		List<String> contrincantesPref = new ArrayList<String>(Arrays.asList("Iniesta"));
		archivo = new ArchivoListener(listener, deportesPref, contrincantesPref);
		
		archivo.notify(partido);
		
		verify(listener, times(1)).update(partido);
	}
}

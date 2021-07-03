package practicaObserver.concursos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorQATestCase {
	ServidorQA servidorQA;
	JugadorQA jugador;
	JugadorQA jugador1;
	JugadorQA jugador2;
	JugadorQA jugador3;
	JugadorQA jugador4;
	JugadorQA jugador5;
	
	@BeforeEach
	void setUp() {
		servidorQA = new ServidorQA();
		jugador = mock(JugadorQA.class);
		jugador1 = mock(JugadorQA.class);
		jugador2 = mock(JugadorQA.class);
		jugador3 = mock(JugadorQA.class);
		jugador4 = mock(JugadorQA.class);
		jugador5 = mock(JugadorQA.class);
	}
	
	@Test
	void testSeAgregaUnJugadorSinComenzarElJuego() {
		servidorQA.agregarJugador(jugador);
		
		Boolean testedValue = servidorQA.getJugadores().contains(jugador);
		
		assertTrue(testedValue);
	}
	
	@Test
	void testSeAgreganCincoJugadoresYSeComienzaElJuego() {
		servidorQA.agregarJugador(jugador);
		servidorQA.agregarJugador(jugador1);
		servidorQA.agregarJugador(jugador2);
		servidorQA.agregarJugador(jugador3);
		servidorQA.agregarJugador(jugador4);
		
		Integer testedValue = servidorQA.getJugadores().size();
		
		assertEquals(0, testedValue);
	}

}

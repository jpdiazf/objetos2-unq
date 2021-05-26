package practica6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTesCase3 {
	PokerStatus3 pokerStatus;	
	Carta unoP;
	Carta dosP;
	Carta tresP;
	Carta cuatroP;
	Carta cincoP;
	Carta unoC;
	Carta unoT;
	Carta unoD;
	
	@BeforeEach
	public void setUp() throws Exception {
		pokerStatus = new PokerStatus3();
		unoP = mock(Carta.class);
		dosP = mock(Carta.class);
		tresP = mock(Carta.class);
		cuatroP = mock(Carta.class);
		cincoP = mock(Carta.class);
		unoC = mock(Carta.class);
		unoT = mock(Carta.class);
		unoD = mock(Carta.class);
		
		when(unoP.getNumero()).thenReturn(1);
		when(unoP.getPalo()).thenReturn("Picas");
		
		when(dosP.getNumero()).thenReturn(2);
		when(dosP.getPalo()).thenReturn("Picas");
		
		when(tresP.getNumero()).thenReturn(3);
		when(tresP.getPalo()).thenReturn("Picas");
		
		when(cuatroP.getNumero()).thenReturn(4);
		when(cuatroP.getPalo()).thenReturn("Picas");
		
		when(cincoP.getNumero()).thenReturn(5);
		when(cincoP.getPalo()).thenReturn("Picas");
		
		when(unoC.getNumero()).thenReturn(1);
		when(unoC.getPalo()).thenReturn("Corazones");
		
		when(unoT.getNumero()).thenReturn(1);
		when(unoT.getPalo()).thenReturn("Treboles");
		
		when(unoD.getNumero()).thenReturn(1);
		when(unoD.getPalo()).thenReturn("Diamantes");
	}
	
	@Test
	void testRecibeCincoCartasYNoHayNada() {
		// Set up
		when(unoP.getNumero()).thenReturn(1);
		when(unoP.getPalo()).thenReturn("Picas");
		
		// Exercise
		String jugada = pokerStatus.verificar(unoP, dosP, unoC, tresP, cuatroP);
		
		// Verify
		assertEquals("Nada", jugada);
	}
	
	@Test
	void testRecibeCincoCartasYHayTrio() {
		// Exercise
		String jugada = pokerStatus.verificar(unoP, dosP, unoC, unoT, cuatroP);
		
		// Verify
		assertEquals("Trio", jugada);
	}
	
	@Test
	void testRecibeCincoCartasYHayPoker() {
		// Exercise
		String jugada = pokerStatus.verificar(unoP, unoP, unoC, unoT, cuatroP);
		
		// Verify
		assertEquals("Poker", jugada);
	}
	
	@Test
	void testRecibeCincoCartasYHayColor() {
		// Exercise
		String jugada = pokerStatus.verificar(unoP, dosP, cincoP, tresP, cuatroP);
		
		// Verify
		assertEquals("Color", jugada);
	}
}

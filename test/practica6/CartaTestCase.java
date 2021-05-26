package practica6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {
	Carta tresC;
	Carta tresP;
	Carta dosT;
	Carta unoP;
	Carta dosC;
	Carta unoT;
	
	@BeforeEach
	public void setUp() throws Exception {
		tresC = new Carta(3, "Corazones");
		dosT = new Carta(2, "Treboles");
		unoP = new Carta(1, "Picas");
		tresP = new Carta(3, "Picas");
		unoT = new Carta(1, "Treboles");
	}
	
	@Test
	void testCartaDeCorazonesBienConstruida() throws Exception {
		dosC = new Carta(2, "Corazones");
		
		assertEquals(dosC, dosC);
	}
	
	@Test
	void testCartaDePicasBienConstruida() throws Exception {
		dosC = new Carta(2, "Picas");
		
		assertEquals(dosC, dosC);
	}
	
	@Test
	void testCartaDeDiamantesBienConstruida() throws Exception {
		dosC = new Carta(2, "Diamantes");
		
		assertEquals(dosC, dosC);
	}
	
	@Test
	void testCartaDeTrebolesBienConstruida() throws Exception {
		dosC = new Carta(2, "Treboles");
		
		assertEquals(dosC, dosC);
	}
	
	@Test
	void testCartaMalConstruidaTiraExcepcion() throws Exception {
		assertThrows(Exception.class , () -> dosC = new Carta(2, "Corazoness"),
				"Debería tirar excepción porque 'Corazoness' no es un palo válido");
	}
	
	@Test
	void testUnTresEsMayorQueUnDos() {
		Boolean resultado = tresC.esMayorQue(dosT);
		
		assertTrue(resultado);
	}
	
	@Test
	void testUnTresNoEsMayorQueOtroTres() {
		Boolean resultado = tresC.esMayorQue(tresP);
		
		assertFalse(resultado);
	}
	
	@Test
	void testUnAsEsMayorQueOtraCartaQueNoSeaUnAs() {		
		Boolean resultado = unoP.esMayorQue(dosT);
		
		assertTrue(resultado);
	}
	
	@Test
	void testUnAsNoEsMayorQueOtroAs() {		
		Boolean resultado = unoP.esMayorQue(unoT);
		
		assertFalse(resultado);
	}
	
	@Test
	void testDosCartasTienenElMismoPalo() {		
		Boolean resultado = unoP.mismoPaloQue(tresP);
		
		assertTrue(resultado);
	}
	
	@Test
	void testDosCartasTienenDistintoPalo() {		
		Boolean resultado = unoP.mismoPaloQue(tresC);
		
		assertFalse(resultado);
	}
}

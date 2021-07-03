package stateStrategy.encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReemplazoPorNumerosTestCase {
	Encriptacion encriptador;
	
	@BeforeEach
	void setUp() {
		encriptador = new ReemplazoPorNumeros();
	}
	
	@Test
	void encriptacionTest() {
		String texto = "Hola";
		String expected = "8,15,12,1";
		String actual = encriptador.encriptar(texto);
		
		assertEquals(expected, actual);
	}

//	@Test
//	void desencriptacionTest() {
//		String texto = "Hule";
//		String expected = "Hola";
//		String actual = encriptador.desencriptar(texto);
//		
//		assertEquals(expected, actual);
//	}
}

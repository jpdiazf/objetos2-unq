package stateStrategy.encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptacionCambioVocales {
	Encriptacion encriptador;
	
	@BeforeEach
	void setUp() {
		encriptador = new ReemplazoPorVocales();
	}
	
	@Test
	void encriptacionTest() {
		String texto = "Hola";
		String expected = "Hule";
		String actual = encriptador.encriptar(texto);
		
		assertEquals(expected, actual);
	}

	@Test
	void desencriptacionTest() {
		String texto = "Hule";
		String expected = "Hola";
		String actual = encriptador.desencriptar(texto);
		
		assertEquals(expected, actual);
	}
}

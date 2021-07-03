package stateStrategy.encriptacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTestCase {
	EncriptadorNaive encriptador;
	Encriptacion reemplazoDeVocales;
	Encriptacion reemplazoPorNumeros;
	
	@BeforeEach
	void setUp() {
		reemplazoDeVocales = mock(Encriptacion.class);
		reemplazoPorNumeros = mock(Encriptacion.class);
		
		encriptador = new EncriptadorNaive(reemplazoDeVocales);
	}
	
	@Test
	void constructorTest() {
		assertEquals(reemplazoDeVocales, encriptador.getStrategy());
		encriptador.setStrategy(reemplazoPorNumeros);
		assertEquals(reemplazoPorNumeros, encriptador.getStrategy());
	}

	@Test
	void encriptacionReemplazoDeVocalesTest() {
		encriptador.setStrategy(reemplazoDeVocales);
		String texto = "Hola";
		when(reemplazoDeVocales.encriptar(texto)).thenReturn("Hule");
		
		String expected = "Hule";
		String actual = encriptador.encriptar(texto);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void desencriptacionReemplazoDeVocalesTest() {
		encriptador.setStrategy(reemplazoDeVocales);
		String texto = "Hule";
		when(reemplazoDeVocales.desencriptar(texto)).thenReturn("Hola");
		
		String expected = "Hola";
		String actual = encriptador.desencriptar(texto);
		
		assertEquals(expected, actual);
	}
}



















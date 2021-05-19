package practica3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona carlos;
	private Persona guillermina;
	
	@BeforeEach
	public void setUp() {
		carlos = new Persona("Carlos", LocalDate.of(1990, 5, 15));
		guillermina = new Persona("Guillermina", LocalDate.of(1990, 5, 25));
	}
	
	@Test
	void edadTest() {
		assertEquals(31, carlos.getEdad());
		assertEquals(30, guillermina.getEdad());
	}
	
	@Test
	void esMayorTest() {
		assertTrue(guillermina.menorQue(carlos));
	}
}
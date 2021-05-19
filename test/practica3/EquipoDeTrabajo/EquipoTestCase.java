package practica3.EquipoDeTrabajo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoTestCase {
	private EquipoDeTrabajo equipo;
	private Persona juan = new Persona("Juan", "Zeroimagination", 20);
	private Persona paula = new Persona("Paula", "Zeroimagination", 21);
	private Persona vane = new Persona("Vane", "Zeroimagination", 22);
	private Persona pablo = new Persona("Pablo", "Zeroimagination", 23);
	private Persona lucia = new Persona("Lucia", "Zeroimagination", 24);
	
	
	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("Five");
		equipo.agregar(juan);
		equipo.agregar(paula);
		equipo.agregar(vane);
		equipo.agregar(pablo);
		equipo.agregar(lucia);
	}
	
	@Test
	void equipoNombreTest() {
		assertEquals("Five", equipo.getNombre());
	}

	@Test
	void equipoPromedioEdadTest() {
		assertEquals(22, equipo.getPromedioEdad());
	}
}

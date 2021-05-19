package practica3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	private Multioperador multioperador; 
	private List<Integer> arreglo;
	
	@BeforeEach
	public void setUp() {
		multioperador = new Multioperador();
		arreglo = new ArrayList<Integer>();
		
		arreglo.add(1);
		arreglo.add(2);
		arreglo.add(3);
		arreglo.add(4);
		arreglo.add(5);
	}
	
	@Test
	public void sumaTest() {
		assertEquals(15, multioperador.getSuma(arreglo));
	}

	@Test
	public void restaTest() {
		assertEquals(-15, multioperador.getResta(arreglo));
	}
	
	@Test
	public void multiplicacionTest() {
		assertEquals(120, multioperador.getMultiplicacion(arreglo));
	}
}
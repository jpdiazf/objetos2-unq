package practica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectanguloCentrado;
	private Rectangulo rectanguloDescentrado;
	
	@BeforeEach
	void setUp() {
		rectanguloCentrado = new Rectangulo(-3, 4);
		rectanguloDescentrado = new Rectangulo(10, 10, 7, -5);
	}
	
	@Test
	void rectanguloCentradoTest() {
		assertEquals(3, rectanguloCentrado.getLengthLadoHorizontal());
		assertEquals(4, rectanguloCentrado.getLengthLadoVertical());
		assertTrue(rectanguloCentrado.centrado());
	}
	
	@Test
	void rectanguloDescentradoTest() {
		assertEquals(7, rectanguloDescentrado.getLengthLadoHorizontal());
		assertEquals(5, rectanguloDescentrado.getLengthLadoVertical());
		assertTrue(!rectanguloDescentrado.centrado());
	}
	
	@Test
	void areaRectanguloTest() {
		assertEquals(12, rectanguloCentrado.getArea());
	}
	
	@Test
	void perimetroRectanguloTest() {
		assertEquals(24, rectanguloDescentrado.getPerimetro());
	}
	
	@Test
	void esHorizontalTest() {
		assertTrue(rectanguloDescentrado.esHorizontal());
		assertFalse(rectanguloCentrado.esHorizontal());
	}
	
	@Test
	void esVerticalTest() {
		assertFalse(rectanguloDescentrado.esVertical());
		assertTrue(rectanguloCentrado.esVertical());
	}
}
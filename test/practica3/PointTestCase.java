package practica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point pointDefault;
	private Point pointSeteado;
	
	@BeforeEach
	public void setUp() {
		pointSeteado = new Point(3, 6);
		pointDefault = new Point();
	}

	@Test
	void valoresDefaultXYTest() {		
		assertEquals(0, pointDefault.getX());
		assertEquals(0, pointDefault.getY());
	}
	
	@Test
	void valoresSeteadosXYTest() {		
		assertEquals(3, pointSeteado.getX());
		assertEquals(6, pointSeteado.getY());
	}
	
	@Test
	void movePointTest() {
		pointSeteado.move(10, -10);
		
		assertEquals(13, pointSeteado.getX());
		assertEquals(-4, pointSeteado.getY());
	}
	
	@Test
	void sumaPointTest() {
		pointDefault.move(5, 5);
		pointSeteado.sumar(pointDefault);
		
		assertEquals(8, pointSeteado.getX());
		assertEquals(11, pointSeteado.getY());
	}
}

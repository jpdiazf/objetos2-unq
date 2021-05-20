package practica4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {
	Producto productoTrad;
	Producto productoCoop;	
	
	@BeforeEach
	void setUp() {
		productoTrad = new ProductoTradicional(100f, 20);
		productoCoop = new ProductoCooperativa(100f, 40);
	}
	
	@Test
	void preciosProductosTest() {
		assertEquals(100, productoTrad.getPrecio());
		assertEquals(90, productoCoop.getPrecio());
	}
	
	@Test
	void decrementarStockTest() {
		productoTrad.decrementarStock();
		productoCoop.decrementarStock();
		productoCoop.decrementarStock();
		
		assertEquals(19, productoTrad.getStock());
		assertEquals(38, productoCoop.getStock());
	}
}

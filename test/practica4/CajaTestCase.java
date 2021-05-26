package practica4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	Caja caja;
	Producto productoTrad;
	Producto productoCoop;
	Cobrable servicio;
	Cobrable impuesto;
	
	@BeforeEach
	void setUp() {
		caja = new Caja();
		productoTrad = new ProductoTradicional(10f, 100);
		productoCoop = new ProductoCooperativa(10f, 150);
		servicio = new Servicio(100f, 5);
		impuesto = new Impuesto(60f);
	}
	
	@Test
	void registrarProductosTest() {
		caja.registrar(productoTrad);
		caja.registrar(productoCoop);
		caja.registrar(productoCoop);
		
		assertEquals(28f, caja.getMonto());
		assertEquals(28f, caja.getMonto());
		
		assertEquals(99, productoTrad.getStock());
		assertEquals(148, productoCoop.getStock());
		
	}
	
	@Test
	void registrarFacturasTest() {
		caja.registrar(servicio);
		caja.registrar(impuesto);
		
		assertEquals(560f, caja.getMonto());
	}
}
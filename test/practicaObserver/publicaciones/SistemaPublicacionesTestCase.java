package practicaObserver.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaPublicacionesTestCase {
	private SistemaPublicaciones sistema;
	private Articulo articulo;
	private Articulo otroArticulo;
	
	@BeforeEach
	void setUp() {
		sistema = new SistemaPublicaciones();
		articulo = mock(Articulo.class);
		otroArticulo = mock(Articulo.class);
	}
	
	@Test
	void testSeCargaUnArticuloAlSistema() {
		sistema.cargar(articulo);
		
		assertTrue(sistema.getArticulos().contains(articulo));
	}
	
//	@Test
//	void testSeCarganVariosArticulosYHayVariosListeners() {
//		sistema.cargar(articulo);
//		sistema.cargar(otroArticulo);
//		subscribe(listener, articulo);
//		subscribe(otroListener, otroArticulo);
//		
//		assertEquals(2, sistema.ar)
//	}
}

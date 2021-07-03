package practicaObserver.publicaciones;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CientificoTestCase {
	SistemaPublicaciones sistema;
	Cientifico cientifico;
	Articulo articuloDePref;
	Articulo articulo;
	
	@BeforeEach
	void setUp() {
		articuloDePref = mock(Articulo.class);
		articulo = mock(Articulo.class);
		sistema = mock(SistemaPublicaciones.class);
		cientifico = new Cientifico(sistema);
	}
	
	@Test
	void testCientificoSeSuscribeAlSistema() {
		cientifico.subscribe(articuloDePref);
		
		verify(sistema, times(1)).subscribe(cientifico, articuloDePref);
	}
	
	@Test
	void testCientificoCargaUnArticuloAlSistema() {
		cientifico.cargar(articulo);
		
		verify(sistema, times(1)).cargar(articulo);
	}
	
	@Test
	void testCientificoRecibeUnUpdateDelSistema() {
		cientifico.update(articulo);
		
		assertTrue(cientifico.getArticulos().contains(articulo));
	}

}

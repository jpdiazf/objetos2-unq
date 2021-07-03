package practicaObserver.publicaciones;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoNotifierTestCase {
	IListener listener;
	Articulo articulo;
	Articulo articuloDePreferencia;
	ArchivoNotifier notifier;
	
	@BeforeEach
	void setUp() {
		listener = mock(IListener.class);
		articulo = mock(Articulo.class);
		articuloDePreferencia = mock(Articulo.class);
		notifier = new ArchivoNotifier(listener, articuloDePreferencia);
	}
	
	@Test
	void testNotificaAlListenerPorqueCoincidenEnTipo() {
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		when(articuloDePreferencia.getTitulo()).thenReturn("");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("CYT");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}
	
	@Test
	void testNotificaAlListenerPorqueCoincidenEnTitulo() {
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}
	
	@Test
	void testNotificaAlListenerPorqueCoincidenEnAutor() {
		List<String> autoresPref = new ArrayList<String>();
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autoresPref.add("Bosso");
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(palabrasClave);
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Ya no soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(autoresPref);
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}

	@Test
	void testNotificaAlListenerPorqueCoincidenEnFiliacion() {
		List<String> filiacionesPref = new ArrayList<String>();
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		filiacionesPref.add("UNLP");
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(palabrasClave);
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Ya no soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(filiacionesPref);
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}
	
	@Test
	void testNotificaAlListenerPorqueCoincidenEnLugarDePublicacion() {
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(palabrasClave);
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Ya no soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("UNQ");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(new ArrayList<String>());
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}
	
	@Test
	void testNotificaAlListenerPorqueCoincidenEnPalabraClave() {
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		List<String> palabrasClavePref = new ArrayList<String>();
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		palabrasClavePref.add("POO");
		
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(palabrasClave);
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Ya no soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("UNQ");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(palabrasClavePref);
		
		notifier.notify(articulo);
		
		verify(listener, times(1)).update(articulo);
	}
	
	@Test
	void testNoNotificaAlListenerPorqueNoCoincidenEnNada() {
		List<String> autores = new ArrayList<String>();
		List<String> filiaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		List<String> palabrasClavePref = new ArrayList<String>();
		autores.add("Bosso");
		autores.add("Montoya");
		filiaciones.add("UNQ");
		filiaciones.add("UNLP");
		palabrasClave.add("POO");
		palabrasClavePref.add("Functional Programming");
		
		
		when(articulo.getTitulo()).thenReturn("Soy científico");
		when(articulo.getAutores()).thenReturn(autores);
		when(articulo.getFiliaciones()).thenReturn(filiaciones);
		when(articulo.getTipo()).thenReturn("CYT");
		when(articulo.getLugarDePublicacion()).thenReturn("UNQ");
		when(articulo.getPalabrasClave()).thenReturn(palabrasClave);
		
		when(articuloDePreferencia.getTitulo()).thenReturn("Ya no soy científico");
		when(articuloDePreferencia.getAutores()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getFiliaciones()).thenReturn(new ArrayList<String>());
		when(articuloDePreferencia.getTipo()).thenReturn("");
		when(articuloDePreferencia.getLugarDePublicacion()).thenReturn("");
		when(articuloDePreferencia.getPalabrasClave()).thenReturn(palabrasClavePref);
		
		notifier.notify(articulo);
		
		verify(listener, never()).update(articulo);
	}
}


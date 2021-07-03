package practicaObserver.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaPublicaciones {
	private List<Articulo> articulos;
	private List<ArchivoNotifier> archivos;
	
	public SistemaPublicaciones() {
		articulos = new ArrayList<Articulo>();
		archivos = new ArrayList<ArchivoNotifier>();
	}
	
	public void cargar(Articulo articulo) {
		articulos.add(articulo);
		this.notify(articulo);
	}
	
	public void subscribe(IListener listener, Articulo articulo) {
		archivos.add(new ArchivoNotifier(listener, articulo));		
	}
	
	public List<Articulo> getArticulos() {
		return this.articulos;
	}
	
	// Privates
	
	private void notify(Articulo articulo) {
		for (ArchivoNotifier archivo : archivos) {
			archivo.notify(articulo);
		}
	}
}

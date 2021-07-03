package practicaObserver.publicaciones;

import java.util.List;

public class ArchivoNotifier {
	private IListener listener;
	private Articulo articulo;
	
	public ArchivoNotifier(IListener listener, Articulo articulo) {
		this.listener = listener;
		this.articulo = articulo;
	}
	
	public void notify(Articulo articulo) {
		if(this.coincidenEnCampos(articulo)) {
			this.listener.update(articulo);
		}
	}
	
	// Privates
	
	private Boolean coincidenEnCampos(Articulo articulo) {
		Boolean coincidenTitulo = this.coincidenTitulo(articulo);
		Boolean coincidenAutor = this.coincidenAutor(articulo);
		Boolean coincidenFiliacion = this.coincidenFiliacion(articulo);
		Boolean coincidenTipo = this.coincidenTipo(articulo);
		Boolean coincidenLugar = this.coincidenLugar(articulo);
		Boolean coincidenPalabraClave = this.coincidenPalabraClave(articulo);
		
		return coincidenFiliacion
			|| coincidenPalabraClave
			|| coincidenAutor
			|| coincidenTitulo
			|| coincidenLugar
			|| coincidenTipo;
	}
	
	private Boolean coincidenTitulo(Articulo articulo) {
		String titulo = this.articulo.getTitulo();
		
		return titulo.equals(articulo.getTitulo());
	}
	
	private Boolean coincidenLugar(Articulo articulo) {
		String lugar = this.articulo.getLugarDePublicacion();
		
		return lugar.equals(articulo.getLugarDePublicacion());
	}
	
	private Boolean coincidenTipo(Articulo articulo) {
		String tipo = this.articulo.getTipo();
		
		return tipo.equals(articulo.getTipo());
	}
	
	private Boolean coincidenAutor(Articulo articulo) {
		List<String> autoresPref = this.articulo.getAutores();
		List<String> autores = articulo.getAutores();
		Boolean res = false;		
		
		for (String autor : autores) {
			res = res || autoresPref.contains(autor);
		}
		
		return res;
	}
	
	private Boolean coincidenFiliacion(Articulo articulo) {
		List<String> filiacionesPref = this.articulo.getFiliaciones();
		List<String> filiaciones = articulo.getFiliaciones();
		Boolean res = false;		
		
		for (String filiacion : filiaciones) {
			res = res || filiacionesPref.contains(filiacion);
		}
		
		return res;
	}
	
	private Boolean coincidenPalabraClave(Articulo articulo) {
		List<String> palabrasClavePref = this.articulo.getFiliaciones();
		List<String> palabrasClave = articulo.getFiliaciones();
		Boolean res = false;		
		
		for (String palabraClave : palabrasClave) {
			res = res || palabrasClavePref.contains(palabraClave);
		}
		
		return res;
	}
}















package practicaObserver.publicaciones;

import java.util.List;

public class Articulo {
	List<String> palabrasClave;
	List<String> filiaciones;
	List<String> autores;
	String titulo;
	String tipo;
	String lugarDePublicacion;
	
	public Articulo(String titulo, String tipo, String lugarDePublicacion, List<String> autores, List<String> filiaciones, List<String> palabrasClave) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.palabrasClave = palabrasClave;
	}
	
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}

	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public List<String> getAutores() {
		return autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}	
}

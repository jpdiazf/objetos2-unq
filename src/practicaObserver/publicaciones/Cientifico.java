package practicaObserver.publicaciones;

import java.util.ArrayList;
import java.util.List;

import org.mockito.ArgumentMatchers;

public class Cientifico implements IListener {
	private SistemaPublicaciones sistema;
	private List<Articulo> articulos;
	
	public Cientifico(SistemaPublicaciones sistema) {
		this.sistema = sistema;
		this.articulos = new ArrayList<Articulo>();
	}

	@Override
	public void update(Articulo articulo) {
		articulos.add(articulo);
	}
	
	public void cargar(Articulo articulo) {
		sistema.cargar(articulo);		
	}
	
	public void subscribe(Articulo articuloPref) {
		sistema.subscribe(this, articuloPref);
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

}

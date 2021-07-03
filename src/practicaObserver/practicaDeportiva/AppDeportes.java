package practicaObserver.practicaDeportiva;

import java.util.ArrayList;
import java.util.List;

public class AppDeportes {
	private List<ArchivoListener> archivoPreferencias = new ArrayList<ArchivoListener>();
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public void cargar(Partido partido) {
		partidos.add(partido);
		this.notify(partido);
	}
	
	public void subscribe(IListener listener, List<String> deportes, List<String> contrincantes) {
		archivoPreferencias.add(new ArchivoListener(listener, deportes, contrincantes));
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public List<ArchivoListener> getArchivos() {
		return archivoPreferencias;
	}
	
	// Privates
	
	private void notify(Partido partido) {
		for (ArchivoListener archivo : archivoPreferencias) {
			archivo.notify(partido);
		}
	}
}

package practicaObserver.practicaDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeportes implements IListener {
	private AppDeportes appDeportes;
	private List<Partido> partidos;
	
	public ServidorDeportes(AppDeportes appDeportes) {
		this.appDeportes = appDeportes;
		this.partidos = new ArrayList<Partido>();
	}

	public void subscribe(List<String> deportes, List<String> contrincantes) {
		appDeportes.subscribe(this, deportes, contrincantes);		
	}
	
	public void update(Partido partido) {
		partidos.add(partido);
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}
}

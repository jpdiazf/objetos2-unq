package practicaObserver.practicaDeportiva;

import java.util.ArrayList;
import java.util.List;

public class AppUsuarioDep implements IListener {
	private List<Partido> partidosPref;
	private AppDeportes appDeportes;
	
	public AppUsuarioDep(AppDeportes appDeportes) {
		this.appDeportes = appDeportes;
		this.partidosPref = new ArrayList<Partido>();
	}

	public void subscribe(List<String> deportesPref, List<String> contrincantes) {
		appDeportes.subscribe(this, deportesPref, contrincantes);
		
	}

	public void update(Partido partidoPref) {
		partidosPref.add(partidoPref);		
	}

	public List<Partido> getPartidos() {
		return partidosPref;
	}

}

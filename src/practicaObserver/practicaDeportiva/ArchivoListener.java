package practicaObserver.practicaDeportiva;

import java.util.List;

public class ArchivoListener {
	private IListener listener;
	private List<String> deportesPref;
	private List<String> contrincantesPref;
	
	public ArchivoListener(IListener listener, List<String> deportes, List<String> contrincantes) {
		this.listener = listener;
		this.deportesPref = deportes;
		this.contrincantesPref = contrincantes;
	}

	public void notify(Partido partido) {
		if(this.cumpleAlgunFiltro(partido)) {
			listener.update(partido);
		}
	}
	
	// Privates
	
	private Boolean cumpleAlgunFiltro(Partido partido) {
		Boolean coincideDeporte = this.coincideDeporte(partido);
		Boolean coincideContrincante = this.coincideContrincante(partido);
		
		return coincideDeporte
			|| coincideContrincante;
	}
	
	private Boolean coincideDeporte(Partido partido) {
		String deporte = partido.getDeporte();
		Boolean res = false;
		
		for (String depPref : deportesPref) {
			res = res || depPref.equals(deporte);
		}
		
		return res;
	}

	private Boolean coincideContrincante(Partido partido) {
		List<String> contrincantes = partido.getContrincantes();
		Boolean res = false;
		
		for (String contPref : contrincantes) {
			res = res || contrincantes.contains(contPref);
		}
		
		return res;
	}
}

















package practicaObserver.concursos;

import java.util.ArrayList;
import java.util.List;

public class ServidorQA {
	List<JugadorQA> jugadoresEsperando = new ArrayList<JugadorQA>();
	List<ConcursoQA> concursosActivos = new ArrayList<ConcursoQA>();

	public List<JugadorQA> getJugadores() {
		return this.jugadoresEsperando;
	}

	public void agregarJugador(JugadorQA jugador) {
		Integer cantidadJugadores;
		
		jugadoresEsperando.add(jugador);
		cantidadJugadores = jugadoresEsperando.size();		
		if(cantidadJugadores == 5) {
			this.comenzarJuego();
			this.renovarJugadores();
		}
	}
	
	// Privates
	
	public void comenzarJuego() {
		concursosActivos.add(new ConcursoQA(jugadoresEsperando));
	}
	
	private void renovarJugadores() {
		jugadoresEsperando.clear();
	}
}

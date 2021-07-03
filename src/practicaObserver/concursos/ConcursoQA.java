package practicaObserver.concursos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcursoQA {
	List<JugadorQA> jugadores;
	List<Pregunta> preguntas;
	
	public ConcursoQA(List<JugadorQA> jugadores) {
		this.jugadores = jugadores;
	}

	public void comenzarJuego() {
		List<String> enunciados = preguntas
			.stream()
			.map(p -> p.getEnunciado())
			.collect(Collectors.toList());
		
		for (JugadorQA jugador : jugadores) {
			jugador.comienzaElJuego(enunciados);
		}	
	}
	
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
}

package practicaObserver.concursos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConcursoQATestCase {
	ConcursoQA concursoQA;
	List<JugadorQA> jugadores;
	List<Pregunta> preguntas;
	
	Pregunta pregunta0;
	Pregunta pregunta1;
	Pregunta pregunta2;
	Pregunta pregunta3;
	Pregunta pregunta4;
	
	@BeforeEach
	void setUp() {
		pregunta0 = mock(Pregunta.class);
		pregunta1 = mock(Pregunta.class);
		pregunta2 = mock(Pregunta.class);
		pregunta3 = mock(Pregunta.class);
		pregunta4 = mock(Pregunta.class);
		
		preguntas = new ArrayList<Pregunta>(Arrays.asList(
			pregunta0,
			pregunta1,
			pregunta2,
			pregunta3,
			pregunta4
		));
		concursoQA = new ConcursoQA(jugadores);
		concursoQA.setPreguntas(preguntas);
	}
	
	@Test
	void testSeComienzaElJuegoYTodosRecibenSuNotificacionYPreguntas() {
		List<String> enunciados = preguntas
				.stream()
				.map(p -> p.getEnunciado())
				.collect(Collectors.toList());
		
		when(pregunta0.getEnunciado()).thenReturn("La respuesta es 0");
		when(pregunta1.getEnunciado()).thenReturn("La respuesta es 1");
		when(pregunta2.getEnunciado()).thenReturn("La respuesta es 2");
		when(pregunta3.getEnunciado()).thenReturn("La respuesta es 3");
		when(pregunta4.getEnunciado()).thenReturn("La respuesta es 4");
		
		concursoQA.comenzarJuego();		
		
		for (JugadorQA jugadorQA : jugadores) {
			verify(jugadorQA, times(1)).comienzaElJuego(enunciados);			
		}
	}

}

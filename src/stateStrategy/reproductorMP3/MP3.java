package stateStrategy.reproductorMP3;

import java.util.ArrayList;
import java.util.List;

public class MP3 {
	private MP3State state; 
	private List<Song> canciones = new ArrayList<Song>();
	private Song cancionSeleccionada;
	
	public MP3() {
		this.state = new StateSeleccionDeCanciones(this);
	}
	
	public void seleccionarCancion(Song song) {
		this.cancionSeleccionada = song;
	}
	
	public Song getCancionSeleccionada() {
		return this.cancionSeleccionada;
	}
	
	public void agregarCancion(Song song) {
		canciones.add(song);
	}
	
	public void play() throws Exception {
		this.state.play();
	}
	
	public void pause() throws Exception {
		this.state.pause();
	}

	public void stop() {
		this.state.stop();
	}
	
	public MP3State getState() {
		return this.state;
	}
	
	public void setState(MP3State state) {
		this.state = state;
	}
}

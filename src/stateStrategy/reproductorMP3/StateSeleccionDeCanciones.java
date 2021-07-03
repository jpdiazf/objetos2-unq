package stateStrategy.reproductorMP3;

public class StateSeleccionDeCanciones extends MP3State {

	public StateSeleccionDeCanciones(MP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play() {
		Song song = this.reproductor.getCancionSeleccionada();
		song.play();
		this.reproductor.setState(new StateReproduciendo(reproductor));
	}

	@Override
	public void pause() throws Exception {
		throw new Exception("No se puede usar pause() mientras se está seleccionando una canción");
	}

	@Override
	public void stop() {
		// No hace nada.
	}
}

package stateStrategy.reproductorMP3;

public class StateReproduciendo extends MP3State {

	public StateReproduciendo(MP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play() throws Exception {
		throw new Exception("No se puede usar play() mientras la cancion se está reproduciendo");		
	}

	@Override
	public void pause() {
		Song song = this.reproductor.getCancionSeleccionada();
		song.pause();
		this.reproductor.setState(new StatePausada(reproductor));		
	}

	@Override
	public void stop() {
		Song song = this.reproductor.getCancionSeleccionada();
		song.stop();
		this.reproductor.setState(new StateSeleccionDeCanciones(reproductor));
	}

}

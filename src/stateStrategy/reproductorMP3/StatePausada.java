package stateStrategy.reproductorMP3;

public class StatePausada extends MP3State {

	public StatePausada(MP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play() throws Exception {
		throw new Exception("No se puede usar play() mientras la cancion está pausada");
	}

	@Override
	public void pause() {
		Song song = this.reproductor.getCancionSeleccionada();
		song.play();
		this.reproductor.setState(new StateReproduciendo(reproductor));
		
	}

	@Override
	public void stop() {
		Song song = this.reproductor.getCancionSeleccionada();
		song.stop();
		this.reproductor.setState(new StateSeleccionDeCanciones(reproductor));
	}

}

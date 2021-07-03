package stateStrategy.reproductorMP3;

public abstract class MP3State {
	MP3 reproductor;
	
	public MP3State(MP3 reproductor) {
		this.reproductor = reproductor;		
	}
	
	public abstract void play() throws Exception;
	public abstract void pause() throws Exception;
	public abstract void stop();
	
}

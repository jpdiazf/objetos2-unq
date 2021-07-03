package stateStrategy.videoJuego;

public class Maquina {
	private StateJuego state;
	private VideoJuego videoJuego;
	
	public Maquina() {
		this.state = new StateApagada(this);
	}
	
	public StateJuego getState() {
		return this.state;
	}

	public void inicio() {
		state.inicio();
	}
	
	public void ingresarFicha() {
		state.ingresarFicha();
	}
	
	public void jugar(int cantidad) {
		this.videoJuego.jugar(cantidad);
	}

	public void setState(StateJuego state) {
		this.state = state;
	}
	
	public void finalizarJuego() {
		this.state.finalizarJuego();
	}
}

package stateStrategy.videoJuego;

public abstract class StateJuego {
	int cantFichas;
	Maquina maquina;
	
	public StateJuego(Maquina maquina) {
		this.maquina = maquina;
	}
	
	public abstract void inicio();
	public abstract void ingresarFicha();
	public abstract void finalizarJuego();

}

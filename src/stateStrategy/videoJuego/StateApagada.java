package stateStrategy.videoJuego;

public class StateApagada extends StateJuego {

	public StateApagada(Maquina maquina) {
		super(maquina);
	}

	@Override
	public void inicio() {
		maquina.setState(new StateEncendida(maquina));
	}

	@Override
	public void ingresarFicha() {
		// No hace nada		
	}

	@Override
	public void finalizarJuego() {
		// No hace nada		
	}
}

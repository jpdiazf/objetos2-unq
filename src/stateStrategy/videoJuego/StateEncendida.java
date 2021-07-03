package stateStrategy.videoJuego;

public class StateEncendida extends StateJuego {

	public StateEncendida(Maquina maquina) {
		super(maquina);
		this.cantFichas = 0;
	}

	@Override
	public void inicio() {
		this.maquina.jugar(cantFichas);
	}

	@Override
	public void ingresarFicha() {
		cantFichas = Math.min(cantFichas + 1, 2);
	}
	
	@Override
	public void finalizarJuego() {
		this.maquina.setState(new StateApagada(maquina));
	}
}

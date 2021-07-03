package stateStrategy.encriptacion;

public class EncriptadorNaive {
	Encriptacion strategy;
	
	public EncriptadorNaive(Encriptacion strategy) {
		this.strategy = strategy;
	}

	public Encriptacion getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Encriptacion strategy) {
		this.strategy = strategy;
	}

	public String encriptar(String texto) {
		return this.strategy.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return this.strategy.desencriptar(texto);
	}
}

package practica6;

public class Carta {
	Integer numero;
	String palo;
	
	public Carta(Integer numero, String palo) throws Exception {
		switch(palo) {
			case "Corazones":
				break;
			case "Picas":
				break;
			case "Treboles":
				break;
			case "Diamantes":
				break;
			default:
				throw new Exception("No es un palo válido");
		}
		
		this.numero = numero;
		this.palo = palo;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	public String getPalo() {
		return this.palo;
	}
	
	public Boolean esMayorQue(Carta otraCarta) {
		Integer thisN = this.numero;
		Integer otherN = otraCarta.getNumero();
		
		return (thisN == 1 && otherN != 1) ||
				thisN > otherN;
	}
	
	public Boolean mismoPaloQue(Carta otraCarta) {
		return this.palo == otraCarta.getPalo();
	}
}




















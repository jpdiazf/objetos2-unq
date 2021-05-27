package practica6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> cartas = new ArrayList<Carta>(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		
		if(this.hayPoker(cartas)) {
			return "Poker";
		} else if(this.hayColor(cartas)) {
			return "Color";
		} else if(this.hayTrio(cartas)) {
			return "Trio";
		}
		
		return "Nada";
	}
	
	public String resultadoMano(Carta carta11, Carta carta12, Carta carta13, Carta carta14, Carta carta15,
								Carta carta21, Carta carta22, Carta carta23, Carta carta24, Carta carta25) {
		Integer numeroDeMano = this.numeroDeManoGanadora(carta11, carta12, carta13, carta14, carta15,
														 carta21, carta22, carta23, carta24, carta25);
		
		if(numeroDeMano != 0) {
			return "Gana la mano " + numeroDeMano;			
		} else {
			return "Empate";
		}
	}
	
	// Privates
	
	private Integer numeroDeManoGanadora(Carta carta11, Carta carta12, Carta carta13, Carta carta14, Carta carta15,
										 Carta carta21, Carta carta22, Carta carta23, Carta carta24, Carta carta25) {
		if(this.ganaAMano(carta11, carta12, carta13, carta14, carta15,
						  carta21, carta22, carta23, carta24, carta25)) {
			return 1;
		} else if(this.ganaAMano(carta11, carta12, carta13, carta14, carta15,
				 				 carta21, carta22, carta23, carta24, carta25)) {
			return 2;
		} else {
			return 0;
		}
	}
	
	private Boolean ganaAMano(Carta carta11, Carta carta12, Carta carta13, Carta carta14, Carta carta15,
			 				  Carta carta21, Carta carta22, Carta carta23, Carta carta24, Carta carta25) {
		
		return null;
	}
	
	private Boolean hayPoker(List<Carta> cartas) {
		List<Object> valores = cartas.stream()
									 .map(carta -> carta.getNumero())
									 .collect(Collectors.toList());

		return this.hayNIguales(4, valores);
	}
	
	private Boolean hayColor(List<Carta> cartas) {
		List<Object> valores = cartas.stream()
									 .map(carta -> carta.getPalo())
									 .collect(Collectors.toList());

		return this.hayNIguales(5, valores);
	}
	
	private Boolean hayTrio(List<Carta> cartas) {
		List<Object> valores = cartas.stream()
									 .map(carta -> carta.getNumero())
									 .collect(Collectors.toList());

		return this.hayNIguales(3, valores);
	}
	
	// Auxiliaries
	
	private Boolean hayNIguales(Integer cantidad, List<Object> valores) {
		Boolean res = false;
		
		for (Object v : valores) {
			res = res || this.apareceNVeces(cantidad, v, valores);
			if(res) break;
		}

		return res;
	}
	
	private Boolean apareceNVeces(Integer amount, Object valor, List<Object> valores) {
		Integer appearences = 0;
		
		for (Object v : valores) {
			if(v.equals(valor)) {
				appearences++;
			}
		}
		
		return appearences >= amount;
	}
}

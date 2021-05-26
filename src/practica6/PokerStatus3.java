package practica6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus3 {
	
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
	
	public Boolean esMayor(Carta carta1, Carta carta2) {
		return carta1.esMayorQue(carta2);
	}
	
	// Privates
	
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

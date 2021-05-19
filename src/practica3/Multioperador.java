package practica3;

import java.util.List;

public class Multioperador {
	public Multioperador() {
		
	}
	
	Integer getSuma(List<Integer> arreglo) {
		Integer resultado = 0;
		
		for (Integer i : arreglo) {
			resultado += i;
		}
		
		return resultado;
	}
	
	Integer getResta(List<Integer> arreglo) {
		Integer resultado = 0;
		
		for (Integer i : arreglo) {
			resultado -= i;
		}
		
		return resultado;
	}
	
	Integer getMultiplicacion(List<Integer> arreglo) {
		Integer resultado = 1;
		
		for (Integer i : arreglo) {
			resultado *= i;
		}
		
		return resultado;
	}
}
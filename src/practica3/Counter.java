package practica3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numbers = new ArrayList<Integer>();
	
	void addNumber(Integer number) {
		numbers.add(number);
	}
	
	Integer getEvenOcurrences() {
		Integer counter = 0;
		
		for (Integer i : numbers) {
			if(i % 2 == 0) {
				counter++;
			}
		}
		
		return counter;
	}
	
	Integer getOddOcurrences() {
		Integer counter = 0;
		
		for (Integer i : numbers) {
			if(i % 2 == 1) {
				counter++;
			}
		}
		
		return counter;
	}
	
	Integer getMultipleOcurrences(Integer multiplo) {
		Integer counter = 0;
		
		for (Integer i : numbers) {
			if(i % multiplo == 0) {
				counter++;
			}
		}
		
		return counter;
	}
}














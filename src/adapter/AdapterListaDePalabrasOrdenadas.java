package adapter;

public class AdapterListaDePalabrasOrdenadas {
	ListaDePalabrasOrdenadas lista;
	
	public void addElement(String palabra) {
		lista.agregarPalabra(palabra);
	}
}

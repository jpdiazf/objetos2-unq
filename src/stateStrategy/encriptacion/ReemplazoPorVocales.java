package stateStrategy.encriptacion;

public class ReemplazoPorVocales extends Encriptacion {

	@Override
	public String encriptar(String texto) {
		String textoEncriptado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			textoEncriptado += this.encriptarChar(c);
		}
		
		return textoEncriptado;
	}

	@Override
	public String desencriptar(String texto) {
		String textoDesencriptado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			textoDesencriptado += this.desencriptarChar(c);
		}
		
		return textoDesencriptado;
	}
	
	private char encriptarChar(char c) {
		switch(c) {
			case 'a': {	
				return 'e';
			} case 'e': {	
				return 'i';
			} case 'i': {	
				return 'o';
			} case 'o': {	
				return 'u';
			} case 'u': {	
				return 'a';
			}
		}
		return c;
	}
	
	private char desencriptarChar(char c) {
		switch(c) {
		case 'a': {	
			return 'u';
		} case 'e': {	
			return 'a';
		} case 'i': {	
			return 'e';
		} case 'o': {	
			return 'i';
		} case 'u': {	
			return 'o';
		}
	}
	return c;
	}
}
	


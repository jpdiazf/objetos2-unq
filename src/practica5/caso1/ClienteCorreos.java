package practica5.caso1;

import java.util.ArrayList;

public class ClienteCorreos {
	ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteCorreos() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	public int contarBorrados() {
		return this.borrados.size();
	}
	
	public int contarInbox() {
		return this.inbox.size();
	}
	
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
	}
		
	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}
}

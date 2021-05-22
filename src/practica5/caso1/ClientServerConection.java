package practica5.caso1;

public class ClientServerConection {
	IServidorConexion servidor;
	String nombreUsuario;
	String passusuario;
	ClienteCorreos clienteCorreos;
	
	public ClientServerConection(IServidorConexion servidor, String usuario, String pass) {
		this.servidor = servidor;
		this.nombreUsuario = usuario;
		this.passusuario = pass;
		this.clienteCorreos = new ClienteCorreos();
		this.conectar();
	}	
	
	public ClienteCorreos getClienteCorreos() {
		return this.clienteCorreos;
	}
	
	public void conectar() {
		this.servidor.conectar(this.nombreUsuario, this.passusuario);
	}
	
	public void recibirNuevos() {
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}	
}
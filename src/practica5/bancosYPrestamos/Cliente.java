package practica5.bancosYPrestamos;

public class Cliente {
	String nombre;
	String apellido;
	String direccion;
	Float sueldoNetoMensual;
	Integer edad;
	Banco banco;
	SolicitudDeCredito solicitud;
	Float saldo;
	
	public Cliente(String nombre, String apellido, Integer edad, String direccion, Float sueldo, Banco banco, Float saldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldo;
		this.edad = edad;
		this.saldo = saldo;
	}
	
	public void recibirCredito(Float monto) {
		this.saldo += monto;	
	}
	
	public Float getSueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public void pagarCuotaMensual() {
		banco.cobrarPago(this.solicitud.getCuotaMensual());
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void solicitarCreditoPersonal(Float monto, Integer plazo) {
		SolicitudDeCredito solicitud = new SolicitudPersonal(this, monto, plazo);
		banco.agregarSolicitud(solicitud);
		this.solicitud = solicitud;
	}
	
	public void solicitarCreditoHipotecario(Float monto, Integer plazo, PropiedadInmobiliaria propiedad) {
		SolicitudDeCredito solicitud = new SolicitudHipotecaria(this, monto, plazo, propiedad);
		banco.agregarSolicitud(solicitud);
		this.solicitud = solicitud;
	}
}
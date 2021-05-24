package practica5.bancosYPrestamos;

public abstract class SolicitudDeCredito {
	Cliente cliente;
	Float monto;
	Integer plazo;
	
	public abstract Boolean esAceptable();
	
	public SolicitudDeCredito(Cliente cliente, Float monto, Integer plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Float getMonto() {
		return monto;
	}
	
	public Float getCuotaMensual() {
		return this.monto / this.plazo;
	}
}

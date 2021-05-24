package practica5.bancosYPrestamos;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente cliente, Float monto, Integer plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public Boolean esAceptable() {
		Float ingresos = this.cliente.getSueldoNetoAnual();
		Float montoCuota = this.getCuotaMensual();
		
		return ingresos > 15000 &&
			   montoCuota < ingresos * 0.7;
	}
}
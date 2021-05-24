package practica5.bancosYPrestamos;

public class SolicitudHipotecaria extends SolicitudDeCredito {
	private PropiedadInmobiliaria propiedadInmobiliaria;
	
	public SolicitudHipotecaria(Cliente cliente, Float monto, Integer plazo, PropiedadInmobiliaria propiedadInmobiliaria) {
		super(cliente, monto, plazo);
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}

	@Override
	public Boolean esAceptable() {
		Float montoCuota = this.getCuotaMensual();
		Float ingresosMensuales = this.cliente.getSueldoNetoAnual();;
		Float valorFiscalPropiedad = propiedadInmobiliaria.getValorFiscal();
		Integer edadFinal = this.getEdadDePago();
		
		return montoCuota < ingresosMensuales * 0.5 &&
			   monto < valorFiscalPropiedad * 0.7 &&
			   edadFinal < 65;
	}
	
	private Integer getEdadDePago() {
		Integer añosDePago = plazo / 12;
		
		return this.cliente.getEdad() + añosDePago;
	}
}

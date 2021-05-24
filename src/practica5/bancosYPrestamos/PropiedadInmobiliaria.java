package practica5.bancosYPrestamos;

public class PropiedadInmobiliaria {
	private String direccion;
	private String descripcion;
	private Float valorFiscal;
	
	public PropiedadInmobiliaria(String direccion, String descripcion, Float valorFiscal) {
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public Float getValorFiscal() {
		return valorFiscal;
	}
}

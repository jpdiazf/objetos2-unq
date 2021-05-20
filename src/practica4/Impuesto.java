package practica4;

public class Impuesto extends Factura {
	Float tasaDeServicio;
	
	public Impuesto(Float tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public Float getPrecio() {
		return tasaDeServicio;
	}
}

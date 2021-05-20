package practica4;

public class Caja {
	private Float monto;
	
	public Caja() {
		this.monto = 0f;
	}
	
	public Float getMonto() {
		return monto;
	}
	
	public void registrar(Cobrable cobrable) {
		monto += cobrable.getPrecio();
		cobrable.registrarPago();
	}
}

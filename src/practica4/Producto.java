package practica4;

public abstract class Producto implements Cobrable {
	private Integer stock;
	Float precioBase;
	
	public abstract Float getPrecio();
	
	public Producto(Float precioBase, Integer stock) {
		this.precioBase = precioBase;
		this.stock = stock;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		stock--;		
	}
	
	public void registrarPago() {
		this.decrementarStock();
	}
}
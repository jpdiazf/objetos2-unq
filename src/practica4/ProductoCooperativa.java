package practica4;

public class ProductoCooperativa extends Producto {
	public ProductoCooperativa(Float precio, Integer stock) {
		super(precio, stock);
	}
	
	@Override
	public Float getPrecio() {
		return precioBase * 0.9f;
	}
}

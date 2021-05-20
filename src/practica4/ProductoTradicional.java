package practica4;

public class ProductoTradicional extends Producto {
	public ProductoTradicional(Float precio, Integer stock) {
		super(precio, stock);
	}

	@Override
	public Float getPrecio() {
		return precioBase;
	}
}

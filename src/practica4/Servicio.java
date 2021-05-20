package practica4;

public class Servicio extends Factura {
	Float costoPorUnidad;
	Integer unidadesConsumidas;
	
	public Servicio(Float costoPorUnidad, Integer unidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	@Override
	public Float getPrecio() {
		return costoPorUnidad * unidadesConsumidas;
	}
}
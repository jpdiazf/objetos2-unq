package templateMethod.empleado;

public class EmpleadoDePlanta extends Empleado {
	
	@Override
	protected double getSueldoNeto() {
		return super.getSueldoNeto() + this.getPagoPorHijos();
	}

	private double getPagoPorHijos() {
		return this.pagoPorHijo() * cantidadDeHijos;
	}

	private double pagoPorHijo() {
		return 150;
	}
	
	@Override
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	@Override
	public int getPagoPorHoras() {
		return 0;
	}

	@Override
	public double getSueldoFijo() {
		return 3000;
	}
}

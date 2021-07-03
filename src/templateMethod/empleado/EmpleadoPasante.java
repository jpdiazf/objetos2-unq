package templateMethod.empleado;

public class EmpleadoPasante extends Empleado {

	@Override
	protected double getSueldoNeto() {
		return super.getSueldoNeto();
	}

	@Override
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	@Override
	public int getPagoPorHoras() {
		return 40;
	}

	@Override
	public double getSueldoFijo() {
		return 0;
	}
}

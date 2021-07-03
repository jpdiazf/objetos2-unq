package templateMethod.empleado;

public class EmpleadoTemporario extends Empleado {
	boolean esCasado;
	
	@Override
	protected double getSueldoNeto() {
		return super.getSueldoNeto() + this.sueldoFamiliar();
	}
	
	private double sueldoFamiliar() {
		if(esCasado || this.tieneHijos()) {
			return 100;
		} else {
			return 0;
		}
	}
	
	private boolean tieneHijos() {
		return cantidadDeHijos > 0;
	}

	@Override
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	@Override
	public int getPagoPorHoras() {
		return 5;
	}

	@Override
	public double getSueldoFijo() {
		return 1000;
	}

}

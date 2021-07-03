package templateMethod.empleado;

public abstract class Empleado {
	protected int horasTrabajadas;
	protected int cantidadDeHijos;
	
	public double getSueldo() {
		return this.getSueldoNeto() / 0.13;
	}
	
	protected double getSueldoNeto() {
		return this.pagoHorasTrabajadas() + this.getSueldoFijo();
	}
		
	public double pagoHorasTrabajadas() {
		return this.getHorasTrabajadas() * this.getPagoPorHoras();
	}
	
	public abstract double getSueldoFijo();
	public abstract int getHorasTrabajadas();
	public abstract int getPagoPorHoras();
}

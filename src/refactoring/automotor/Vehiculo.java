package refactoring.automotor;

import java.time.LocalDate;

public abstract class Vehiculo {
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public abstract boolean debeRealizarVtv(LocalDate fecha);
	
}

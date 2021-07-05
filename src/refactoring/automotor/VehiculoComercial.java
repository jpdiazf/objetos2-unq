package refactoring.automotor;

import java.time.LocalDate;

public class VehiculoComercial extends Vehiculo {

	public VehiculoComercial(LocalDate fechaFabricacion, String ciudadRadicacion) {
		super(fechaFabricacion, ciudadRadicacion);
	}

	@Override
	public boolean debeRealizarVtv(LocalDate fecha) {
		String ciudad = this.ciudadRadicacion();
		
		return fecha.minusYears(1).isAfter(this.getFechaFabricacion()) &&
			   ciudad.equalsIgnoreCase("Buenos Aires");
	}
	
}

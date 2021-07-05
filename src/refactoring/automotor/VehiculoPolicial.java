package refactoring.automotor;

import java.time.LocalDate;

public class VehiculoPolicial extends Vehiculo {

	public VehiculoPolicial(LocalDate fechaFabricacion, String ciudadRadicacion) {
		super(fechaFabricacion, ciudadRadicacion);
	}

	@Override
	public boolean debeRealizarVtv(LocalDate fecha) {
		return false;
	}
	
}

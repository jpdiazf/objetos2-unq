package refactoring.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// s√≥lo realizan vtv los veh√≠culos con m√°s de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		
//		return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
//				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires"));

		return vehiculo.debeRealizarVtv(fecha); // Capaz est· de m·s esta delegaciÛn, aunque me parece una linda soluciÛn.
	}
}

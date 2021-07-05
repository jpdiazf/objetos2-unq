package refactoring.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		
//		return (!esVehiculoPolicial && fecha.minusYears(1).isAfter(fechaFabricacion)
//				&& ciudadRadicacion.equalsIgnoreCase("Buenos Aires"));

		return vehiculo.debeRealizarVtv(fecha); // Capaz est� de m�s esta delegaci�n, aunque me parece una linda soluci�n.
	}
}

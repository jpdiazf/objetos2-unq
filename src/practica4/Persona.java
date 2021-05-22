package practica4;

import java.time.LocalDate;

public class Persona implements Nombrable {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Integer getEdad() {
        return (LocalDate.now().compareTo(fechaDeNacimiento)) / 365;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}

package practica3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	String nombre;
	LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public Integer getEdad() {
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	public Boolean menorQue(Persona persona) {
		return fechaDeNacimiento.compareTo(persona.getFechaDeNacimiento()) > 0;
	}
}

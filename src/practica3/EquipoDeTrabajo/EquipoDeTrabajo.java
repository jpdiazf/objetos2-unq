package practica3.EquipoDeTrabajo;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> equipo = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregar(Persona persona) {
		equipo.add(persona);
	}
	
	public Integer getPromedioEdad() {
		Integer sumaEdades = 0;
		Integer cantidadDeMiebros = equipo.size();	
		for (Persona p : equipo) {
			sumaEdades += p.getEdad();
		}
		
		return sumaEdades / cantidadDeMiebros;
	}
}

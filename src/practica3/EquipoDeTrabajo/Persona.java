package practica3.EquipoDeTrabajo;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Persona(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Integer getEdad() {
		return this.edad;
	}
}

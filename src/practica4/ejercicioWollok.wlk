class Persona {
    var nombre
    var fechaDeNacimiento

    method getEdad() {
        return (fechaDeNacimiento - new Date()) / 365
    }

    method getNombre() {
        return nombre;
    }

    method getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}

class Mascota {
    var nombre
    var raza

    method getNombre() {
        return nombre;
    }

    method raza() {
        return raza;
    }
}

// Parte de instanciado

var ana = new Persona(nombre = "Ana", fechaDeNacimiento = new Date(3, 4, 2000))
var paula = new Persona(nombre = "Paula", fechaDeNacimiento = new Date(27, 3, 1998))
var luli = new Mascota(nombre = "Luli", raza = "Caniche Toy")
var roco = new Mascota(nombre = "Roco", raza = "Perro")

var coleccion = [ana, paula, luli, roco]

coleccion.foreach({ nombrable => console.println(nombrable.getNombre()) })

// 4. No fue necesario distinguir entre Persona y Mascota. Este mecanismo se llama polimorfirmo.
// 5. Sí, se podría asegurar esto mediante una clase abstracta "Nombrable", aunque es lenguajes como Wollok o Java,
//    limitaria la herencia de otras clases ya que no hay herencia múltiple.
//    En Java se podrían utilizar interfaces.
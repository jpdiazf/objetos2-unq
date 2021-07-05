package refactoring.automotor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class RegistroAutomotorTest {
	RegistroAutomotor registroAutomotor;
	Vehiculo vehiculoPolicial;
	Vehiculo vehiculoReciente;
	Vehiculo vehiculoLaPlata;
	Vehiculo vechiculoCumpleVtv;
	
	@Before
	public void setUp() {
		registroAutomotor = new RegistroAutomotor();
		vehiculoPolicial = new VehiculoPolicial(LocalDate.of(2018, 1, 1), "Buenos Aires");
		vehiculoReciente = new VehiculoComercial(LocalDate.of(2018, 1, 1), "BuenosAires");
		vehiculoLaPlata = new VehiculoComercial(LocalDate.of(2018, 1, 1), "La Plata");
		vechiculoCumpleVtv = new VehiculoComercial(LocalDate.of(2018, 1, 1), "Buenos Aires");
	}
	
	@Test
	public void testVehiculoPolicialNoRealizaVtv() {		
		assertFalse("Vehiculos policiales no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoPolicial, LocalDate.of(2019, 10, 10)));
	}
	
	@Test
	public void testVehiculoConPocaAntiguedadNoRealizanVtv() {		
		assertFalse("Vehiculos con antiguedad menor a un anio no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoReciente, LocalDate.of(2018, 11, 10)));
	}
	
	@Test
	public void testVehiculoQueNoRadicaEnBsAsNoRealizaVtv() {		
		assertFalse("Vehiculos no radicados en Buenos Aires no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoLaPlata, LocalDate.of(2019, 10, 10)));
	}
	
	@Test
	public void testVehiculoRealizaVtv() {		
		assertTrue(registroAutomotor.debeRealizarVtv(vechiculoCumpleVtv, LocalDate.of(2019, 10, 10)));
	}
}

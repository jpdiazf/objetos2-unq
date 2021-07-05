package refactoring.cuenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import refactoring.cuenta.CajaAhorro;
import refactoring.cuenta.HistorialMovimientos;
import refactoring.cuenta.Notificador;

public class CajaAhorroTest {
	
	@Test
	public void testCajaAhorro() {
		HistorialMovimientos historialMovimientos = Mockito.mock(HistorialMovimientos.class);
		Notificador notificador = Mockito.mock(Notificador.class);
		
		CajaAhorro cajaAhorro = new CajaAhorro(historialMovimientos, notificador, 100);
		
		cajaAhorro.extraer(90);
		assertEquals(10, cajaAhorro.getSaldo());
		Mockito.verify(historialMovimientos).registrarMovimiento("Extraccion", 90);
		
		cajaAhorro.extraer(10);
		assertEquals(0, cajaAhorro.getSaldo());
		Mockito.verify(historialMovimientos).registrarMovimiento("Extraccion", 10);
		
		cajaAhorro.extraer(1);
		assertEquals(0, cajaAhorro.getSaldo());
		Mockito.verify(historialMovimientos, Mockito.never()).registrarMovimiento("Extraccion", 1);
		
		Mockito.verify(notificador, Mockito.times(2)).notificarNuevoSaldoACliente(cajaAhorro);
	}
}

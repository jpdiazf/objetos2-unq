package practicaComposite.cultivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicaComposite.cultivos.IPartePorcion;
import practicaComposite.cultivos.Porcion;
import practicaComposite.cultivos.Soja;

class PorcionTestCase {
	Porcion porcion;
	Porcion otraPorcion;
	List<IPartePorcion> elementos;
	List<IPartePorcion> otrosElementos;
	IPartePorcion soja1;
	IPartePorcion soja2;
	IPartePorcion soja3;
	IPartePorcion soja4;
	IPartePorcion trigo1;
	IPartePorcion trigo2;
	IPartePorcion trigo3;
	
	@BeforeEach
	void setUp() {
		soja1 = mock(Soja.class);
		soja2 = mock(Soja.class);
		trigo1 = mock(Soja.class);
		trigo2 = mock(Soja.class);
		soja3 = mock(Soja.class);
		soja4 = mock(Soja.class);
		trigo3 = mock(Soja.class);
		
		elementos = new ArrayList<IPartePorcion>();
		elementos.add(soja1);
		elementos.add(soja2);
		elementos.add(trigo1);
		elementos.add(trigo2);
		porcion = new Porcion(elementos);
		
		
		otrosElementos = new ArrayList<IPartePorcion>();
		otrosElementos.add(soja3);
		otrosElementos.add(soja4);
		otrosElementos.add(trigo3);
		otrosElementos.add(porcion);
		otraPorcion = new Porcion(otrosElementos);
	}
	
	@Test
	public void constructorTest(){
		List<IPartePorcion> elementosPorcion = porcion.getElementos();
		
		assertTrue(elementosPorcion.contains(soja1));
		assertTrue(elementosPorcion.contains(soja2));
		assertTrue(elementosPorcion.contains(trigo1));
		assertTrue(elementosPorcion.contains(trigo2));
	}
	
	@Test
	public void gananciaAnualConCuatroElementosPurosTest(){
		int piso = 0;
		when(soja1.getGananciaAnual(piso + 1)).thenReturn(500d);
		when(soja2.getGananciaAnual(piso + 1)).thenReturn(500d);
		when(trigo1.getGananciaAnual(piso + 1)).thenReturn(300d);
		when(trigo2.getGananciaAnual(piso + 1)).thenReturn(300d);
		
		double actual = porcion.getGananciaAnual(piso);
		double expected = 1600d;
		
		assertEquals(expected, actual);
	}
	
	@Test public void gananciaAnualConPorcionesDentroDePorcionesTest() {
		int piso = 0;
		when(soja1.getGananciaAnual(piso + 2)).thenReturn(125d);
		when(soja2.getGananciaAnual(piso + 2)).thenReturn(125d);
		when(soja3.getGananciaAnual(piso + 1)).thenReturn(500d);
		when(soja4.getGananciaAnual(piso + 1)).thenReturn(500d);
		when(trigo1.getGananciaAnual(piso + 2)).thenReturn(75d);
		when(trigo2.getGananciaAnual(piso + 2)).thenReturn(75d);
		when(trigo3.getGananciaAnual(piso + 1)).thenReturn(300d);
		
		double actual = otraPorcion.getGananciaAnual(piso);
		double expected = 1700d;
		
		assertEquals(expected, actual);
	}
}









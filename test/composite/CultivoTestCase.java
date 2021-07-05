package composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTestCase {
	CultivoTrigo cultivoTrigo = new CultivoTrigo();
	CultivoSoja cultivoSoja = new CultivoSoja();
	CultivoMixto cultivoMixto1;
	CultivoMixto cultivoMixto2;
	CultivoMixto cultivoMixto3;
	
	@BeforeEach
	void setUp() {
		cultivoMixto1 = new CultivoMixto();
		cultivoMixto2 = new CultivoMixto();
		cultivoMixto3 = new CultivoMixto();
	}
	
	@Test
	void gananciaAnualHojas() {
		float gananciaSoja = cultivoSoja.gananciaAnualSoja();
		float gananciaTrigo = cultivoTrigo.gananciaAnualTrigo();
		
		assertEquals(500, gananciaSoja);
		assertEquals(300, gananciaTrigo);
	}

	@Test
	void gananciaAnualComposite() {
		cultivoMixto1.agregarCultivo(cultivoSoja);
		cultivoMixto1.agregarCultivo(cultivoSoja);
		cultivoMixto1.agregarCultivo(cultivoTrigo);
		cultivoMixto1.agregarCultivo(cultivoTrigo);
		
		cultivoMixto2.agregarCultivo(cultivoMixto1);
		cultivoMixto2.agregarCultivo(cultivoTrigo);
		
		cultivoMixto3.agregarCultivo(cultivoSoja);
		
		float gananciaSojaCultivoMixto1  = cultivoMixto1.gananciaAnualSoja();
		float gananciaTrigoCultivoMixto1 = cultivoMixto1.gananciaAnualTrigo();
		float gananciaSojaCultivoMixto2  = cultivoMixto2.gananciaAnualSoja();
		float gananciaTrigoCultivoMixto2 = cultivoMixto2.gananciaAnualTrigo();
		float gananciaSojaCultivoMixto3  = cultivoMixto3.gananciaAnualSoja();
		float gananciaTrigoCultivoMixto3 = cultivoMixto3.gananciaAnualTrigo();
		
		assertEquals(250, gananciaSojaCultivoMixto1);
		assertEquals(150, gananciaTrigoCultivoMixto1);
		
		assertEquals(62.5, gananciaSojaCultivoMixto2);
		assertEquals(112.5, gananciaTrigoCultivoMixto2);
		
		assertEquals(125, gananciaSojaCultivoMixto3);
		assertEquals(0, gananciaTrigoCultivoMixto3);
	}	
}
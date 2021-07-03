//package stateStrategy.videoJuego;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class MaquinaTestCase {
//	Maquina maquina;
//	
//	@BeforeEach
//	void setUp() {
//		maquina = new Maquina();
//	}
//	
//	@Test
//	void seEnciendeLaMaquinaTest() {
//		StateJuego apagada = maquina.getState();		
//		maquina.inicio();
//		
//		verify(apagada, times(1)).inicio();
//	}
//
//}

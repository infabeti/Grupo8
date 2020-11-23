package test_controlador;

import org.junit.Test;

import controlador.Funciones_Bienvenida;
import vista.Frame_Bienvenida;

class TestFunciones_Bienvenida {
	
	private boolean resultado;
	
	@Test
	public void testBienvenida() {
		resultado = true;
		Funciones_Bienvenida.pasar_ventana(Frame_Bienvenida.frmBienvenida);
		
		org.junit.Assert.assertEquals(resultado, Funciones_Bienvenida.iniciar_login);
	}

}

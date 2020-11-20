package test_controlador;

import org.junit.Test;

import controlador.Funciones_Bienvenida;

class TestFunciones_Bienvenida {
	
	private boolean resultado;
	
	@Test
	public void testBienvenida() {
		resultado = true;
		Funciones_Bienvenida.pasar_ventana();
		
		org.junit.Assert.assertEquals(resultado, Funciones_Bienvenida.iniciar_login);
	}

}

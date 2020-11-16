package test_controlador;

import org.junit.jupiter.api.Test;

import controlador.Funciones_Bienvenida;

import static org.junit.Assert.*;

class TestFunciones_Bienvenida {
	
	private boolean resultado;
	
	@Test
	public void testBienvenida() {
		resultado = true;
		Funciones_Bienvenida.pasar_a_login();
		
		org.junit.Assert.assertEquals(resultado, Funciones_Bienvenida.iniciar_login);
	}

}

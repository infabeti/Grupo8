package Reto1.Grupo8;

import org.junit.jupiter.api.Test;

import controlador.Funciones_Bienvenida;

import static org.junit.Assert.*;

class TestBienvenida {
	
	private boolean resultado;
	
	@Test
	public void testBienvenida() {
		resultado = true;
		Funciones_Bienvenida.pasar_a_login();
		
		System.out.println("iniciar_login: "+Funciones_Bienvenida.iniciar_login);
		org.junit.Assert.assertEquals(resultado, Funciones_Bienvenida.iniciar_login);
	}

}

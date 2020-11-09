package Reto1.Grupo8;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class TestBienvenida {
	
	private boolean resultado;
	
	@Test
	public void testBienvenida() {
		resultado = true;
		Bienvenida.pasar_a_login();
		
		System.out.println("iniciar_login: "+Bienvenida.iniciar_login);
		org.junit.Assert.assertEquals(resultado, Bienvenida.iniciar_login);
	}

}

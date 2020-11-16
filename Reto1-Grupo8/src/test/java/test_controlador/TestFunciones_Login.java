package test_controlador;

import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.Test;

import controlador.Funciones_Login;
import vista.Frame_Login;

public class TestFunciones_Login {

	private static String usuarioRecogido;
	private static String passwordRecogida;
	boolean resultado_password_correcta, resulado_usuario_existe;
	
	@SuppressWarnings("deprecation")
	@Test		
	public void testValidarCampos() {
		usuarioRecogido = Frame_Login.getJtf_usuario().getText(); 
		passwordRecogida = Frame_Login.getJtf_password().getText();
		String usuario_correcto = "admin";
		String password_correcta = "admin";
		
		Funciones_Login.validarCampos(usuarioRecogido, passwordRecogida);
		
		if(Funciones_Login.isUsuario_existe()) {
			assertEquals(true, Funciones_Login.isUsuario_existe());
			
			if(usuarioRecogido.equals(usuario_correcto) && passwordRecogida.equals(password_correcta))
				assertEquals(true, Funciones_Login.isPassword_correcta());
			
			else
				assertEquals(false, Funciones_Login.isPassword_correcta());
		}
		else {
			assertEquals(false, Funciones_Login.isUsuario_existe());
		}

	}
	
	@Test
	public void testSetPasswordCorrecta() {
		Funciones_Login.setPassword_correcta(true);
		assertEquals(true, Funciones_Login.isPassword_correcta());
	
		
	}
	
	@Test
	public void testSetUsuarioExiste() {
		Funciones_Login.setUsuario_existe(true);
		assertEquals(true, Funciones_Login.isUsuario_existe());
	
		
	}
	
	@Test
	public void testIsPasswordCorrecta() {	
		Funciones_Login.password_correcta = true;
		assertEquals(true, Funciones_Login.isPassword_correcta());
	}

}

package Reto1.Grupo8;

import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.Test;

import funciones.Login;
import ventanas.Frame_Login;

public class TestLogin {

	private static String usuarioRecogido;
	private static String passwordRecogida;
	private static JLabel label_usuario_no_existe;
	private static JLabel label_password_incorrecta;
	private static boolean usuario_existe, password_correcta;
	boolean resultado_password_correcta, resulado_usuario_existe;
	
	@Test
	public void testValidarCampos() {
		usuarioRecogido = "admin"; 	// Emulo lo que recogería el getText para poder testearlo
		passwordRecogida = "admin"; // Emulo lo que recogería el getText para poder testearlo
		label_usuario_no_existe = Frame_Login.getLabel_usuario_no_existe();
		label_password_incorrecta = Frame_Login.getLabel_password_incorrecta();
		resultado_password_correcta = true;
		resulado_usuario_existe = true;
		Login.validarCampos(usuarioRecogido, passwordRecogida);
		org.junit.Assert.assertEquals(resultado_password_correcta, Login.isPassword_correcta());
		org.junit.Assert.assertEquals(resulado_usuario_existe, Login.isUsuario_existe());

	}
	
	@Test
	public void testIsPasswordCorrecta() {
		Login.setPassword_correcta(true);
		assertEquals(true, Login.isUsuario_existe());
	
		
	}

}

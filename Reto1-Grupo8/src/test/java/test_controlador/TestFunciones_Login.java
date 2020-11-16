package test_controlador;

import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.Test;

import controlador.Funciones_Login;
import vista.Frame_Login;

public class TestFunciones_Login {

	private static String usuarioRecogido;
	private static String passwordRecogida;
	private static JLabel label_usuario_no_existe;
	private static JLabel label_password_incorrecta;
	private static boolean usuario_existe, password_correcta;
	boolean resultado_password_correcta, resulado_usuario_existe;
	
	@Test
	public void testValidarCampos() {
		usuarioRecogido = "admin"; 	// Emulo lo que recoger�a el getText para poder testearlo
		passwordRecogida = "admin"; // Emulo lo que recoger�a el getText para poder testearlo
		label_usuario_no_existe = Frame_Login.getLabel_usuario_no_existe();
		label_password_incorrecta = Frame_Login.getLabel_password_incorrecta();
		resultado_password_correcta = true;
		resulado_usuario_existe = true;
		Funciones_Login.validarCampos(usuarioRecogido, passwordRecogida);
		org.junit.Assert.assertEquals(resultado_password_correcta, Funciones_Login.isPassword_correcta());
		org.junit.Assert.assertEquals(resulado_usuario_existe, Funciones_Login.isUsuario_existe());

	}
	
	@Test
	public void testIsPasswordCorrecta() {
		Funciones_Login.setPassword_correcta(true);
		assertEquals(true, Funciones_Login.isUsuario_existe());
	
		
	}

}

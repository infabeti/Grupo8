package Reto1.Grupo8;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

public class TestFrame_Login {

	private String usuarioRecogido, passwordRecogida;
	private ArrayList<User> listaUsers;
	private static JTextField tf,resultadotf;
	private static JPasswordField pf,resultadopf;

	
	@Test
	public void testGetJtf_usuario() {
		tf = Frame_Login.getJtf_usuario();
		resultadotf = Frame_Login.getJtf_usuario();
		assertEquals(tf, resultadotf);
	}
	
	@Test
	public void testGetJtf_password() {
		pf = Frame_Login.getJtf_password();
		resultadopf = Frame_Login.getJtf_password();
		assertEquals(pf, resultadopf);
	}
	
	@Test
	public void testSetJtf_usuario() {
		tf = new JTextField();
		Frame_Login.setJtf_usuario(tf);
		resultadotf = Frame_Login.getJtf_usuario();
		assertEquals(tf, resultadotf);
	}
	
	@Test
	public void testSetJtf_password() {
		pf = new JPasswordField();
		Frame_Login.setJtf_password(pf);
		resultadopf = Frame_Login.getJtf_password();
		assertEquals(tf, resultadotf);
	}
	
	@Test
	public void testGetLabel_usuario_no_existe() {
		JLabel label_user_no_existe = new JLabel();
		Frame_Login.setLabel_usuario_no_existe(label_user_no_existe);
		JLabel resultado = Frame_Login.getLabel_usuario_no_existe();
		assertEquals(label_user_no_existe, resultado);
	}
	
	@Test
	public void testSetLabel_usuario_no_existe() {
		JLabel label = new JLabel();
		Frame_Login.setLabel_usuario_no_existe(label);
		JLabel resultado = Frame_Login.getLabel_usuario_no_existe();
		assertEquals(label, resultado);
	}
}

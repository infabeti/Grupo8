package controlador;

import java.util.ArrayList;

import javax.swing.JLabel;

import modelo.Objeto_User;
import vista.Frame_Generos;
import vista.Frame_Login;

public class Funciones_Login {
	
	private static String usuarioRecogido=Frame_Login.getJtf_usuario().getText();
	private static String passwordRecogida = Frame_Login.getJtf_password().getText();
	private static JLabel label_usuario_no_existe = Frame_Login.getLabel_usuario_no_existe();
	private static JLabel label_password_incorrecta = Frame_Login.getLabel_password_incorrecta();
	public static boolean usuario_existe, password_correcta;
	
	
	
	
	public static boolean isUsuario_existe() {
		return usuario_existe;
	}

	public static void setUsuario_existe(boolean usuario_existe) {
		Funciones_Login.usuario_existe = usuario_existe;
	}




	public static boolean isPassword_correcta() {
		return password_correcta;
	}




	public static void setPassword_correcta(boolean password_correcta) {
		Funciones_Login.password_correcta = password_correcta;
	}




	public static void validarCampos(String usuarioRecogido, String passwordRecogida) {
		
		ArrayList<Objeto_User> listaUsers = Objeto_User.getLista_usuarios();
		for(Objeto_User usuario: listaUsers){
			if(usuario.getUser().equals(usuarioRecogido)) {
				setUsuario_existe(true);
				label_usuario_no_existe.setVisible(false);
				if(usuario.getPassword().equals(passwordRecogida)) {
					setPassword_correcta(true);
					label_password_incorrecta.setVisible(false);
					Frame_Generos generos = new Frame_Generos();
					Frame_Login.getFrame().dispose();
				}
				else {
					setPassword_correcta(false);
					label_password_incorrecta.setVisible(true);

				}
				
				break;
			}
			
		}
		if(!usuario_existe) {
			setUsuario_existe(false);
			label_usuario_no_existe.setVisible(true);
		}
	}

}

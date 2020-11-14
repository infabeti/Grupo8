package controlador;

import javax.swing.Timer;

import vista.Frame_Bienvenida;
import vista.Frame_Login;

public class Funciones_Bienvenida {
	public static Timer tiempo;
	public static boolean iniciar_login, parar_timer ;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void pasar_a_login() {
		System.out.println("el método funciona");
		//temporizador para cambiar de ventana
				tiempo = new Timer(5000,null);
				tiempo.start();
				tiempo.addActionListener(new java.awt.event.ActionListener() {
					
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						iniciar_login = true;

						System.out.println("action performed funciona");
						metodoTimer();
					}
					
				});
	}
	//metodo que indica la accion al acabar el Timer "tiempo", cambiar system.exit(0) por la ventana de login
		protected static void metodoTimer() {

			Frame_Login login = new Frame_Login();
			Frame_Login.setFrame(login);
			login.setVisible(true);
			Frame_Bienvenida.getFrmBienvenida().dispose();
			tiempo.stop();
			parar_timer = false;
		}

}

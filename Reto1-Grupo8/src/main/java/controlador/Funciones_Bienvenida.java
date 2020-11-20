package controlador;

import javax.swing.JFrame;
import javax.swing.Timer;

import vista.Frame_Bienvenida;
import vista.Frame_Final;
import vista.Frame_Login;

public class Funciones_Bienvenida {
	public static Timer tiempo;
	public static boolean iniciar_login, parar_timer ;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void pasar_ventana(JFrame ventana) {
		//temporizador para cambiar de ventana
				tiempo = new Timer(2000,null);
				tiempo.start();
				tiempo.addActionListener(new java.awt.event.ActionListener() {
					
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						iniciar_login = true;

						metodoTimer(ventana);
					}
					
				});
	}
	//metodo que indica la accion al acabar el Timer "tiempo", cambiar system.exit(0) por la ventana de login
		protected static void metodoTimer(JFrame ventana) {
			if(ventana == Frame_Bienvenida.frmBienvenida) {
				Frame_Login login = new Frame_Login();
				Frame_Login.setFrame(login);
				login.setVisible(true);
				Frame_Bienvenida.getFrmBienvenida().dispose();
			}
			else if(ventana == Frame_Final.frame_final) {
				Frame_Final.frame_final.dispose();
				Frame_Bienvenida.frmBienvenida.setVisible(true);
			}
			
			tiempo.stop();
			parar_timer = false;
		}

}

package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import controlador.Funciones_Bienvenida;
import java.awt.Color;

public class Frame_Final {

	public static  JFrame frame_final;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Final window = new Frame_Final();
					window.frame_final.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame_Final() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_final = new JFrame();
		frame_final.getContentPane().setBackground(new Color(255, 140, 0));
		frame_final.setBackground(new Color(255, 255, 255));
		frame_final.setBounds(100, 100, 473, 206);
		frame_final.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_final.getContentPane().setLayout(null);
	
		
		JLabel lblDespedida = new JLabel("\u00A1Gracias por su visita!");
		lblDespedida.setForeground(new Color(255, 255, 255));
		lblDespedida.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDespedida.setBounds(10, 11, 436, 32);
		lblDespedida.setFont(new Font("Arial Black", Font.BOLD, 34));
		frame_final.getContentPane().add(lblDespedida);
		
		JLabel lblEsperemosQueVuelva = new JLabel("Esperemos que vuelva pronto");
		lblEsperemosQueVuelva.setForeground(new Color(255, 255, 255));
		lblEsperemosQueVuelva.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEsperemosQueVuelva.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblEsperemosQueVuelva.setBounds(37, 54, 368, 32);
		frame_final.getContentPane().add(lblEsperemosQueVuelva);
		
		JLabel autor1 = new JLabel("Markel Cuesta Arribas");
		autor1.setForeground(new Color(255, 255, 255));
		autor1.setBounds(74, 128, 176, 14);
		frame_final.getContentPane().add(autor1);
		
		JLabel autor2 = new JLabel("Alberto Garcia Lopez");
		autor2.setForeground(new Color(255, 255, 255));
		autor2.setBounds(230, 128, 146, 14);
		frame_final.getContentPane().add(autor2);
		
		Funciones_Bienvenida.pasar_ventana(frame_final);
	}

}

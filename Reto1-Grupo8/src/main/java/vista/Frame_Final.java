package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Frame_Final {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Final window = new Frame_Final();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 192);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDespedida = new JLabel("Gracias por su visita");
		lblDespedida.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDespedida.setBounds(10, 11, 417, 32);
		lblDespedida.setFont(new Font("Arial Black", Font.BOLD, 34));
		frame.getContentPane().add(lblDespedida);
		
		JLabel lblEsperemosQueVuelva = new JLabel("Esperemos que vuelva pronto");
		lblEsperemosQueVuelva.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEsperemosQueVuelva.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblEsperemosQueVuelva.setBounds(20, 54, 368, 32);
		frame.getContentPane().add(lblEsperemosQueVuelva);
		
		JLabel autor1 = new JLabel("Markel Cuesta Arribas");
		autor1.setBounds(74, 128, 176, 14);
		frame.getContentPane().add(autor1);
		
		JLabel autor2 = new JLabel("Alberto Garcia Lopez");
		autor2.setBounds(230, 128, 146, 14);
		frame.getContentPane().add(autor2);
	}

}

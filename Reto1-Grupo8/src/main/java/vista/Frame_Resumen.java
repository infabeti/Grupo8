package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Frame_Resumen {

	public static JFrame frame_Resumen;
	private JTextField TiempoEmisionSabado;
	private JTextField TiempoEmisionDomingo;
	public static Frame_Final frame_fin = new Frame_Final();
	public static Frame_Bienvenida frame_bienvenida=new Frame_Bienvenida();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Resumen window = new Frame_Resumen();
					window.frame_Resumen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame_Resumen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_Resumen = new JFrame();
		frame_Resumen.setBounds(100, 100, 548, 309);
		frame_Resumen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_Resumen.getContentPane().setLayout(null);
		
		JLabel lblPeliculasSabado = new JLabel("Peliculas sabado");
		lblPeliculasSabado.setBounds(45, 49, 142, 19);
		lblPeliculasSabado.setFont(new Font("Arial", Font.BOLD, 13));
		frame_Resumen.getContentPane().add(lblPeliculasSabado);
		
		JLabel lblPeliculasDomingo = new JLabel("Peliculas Domingo");
		lblPeliculasDomingo.setFont(new Font("Arial", Font.BOLD, 13));
		lblPeliculasDomingo.setBounds(309, 49, 150, 19);
		frame_Resumen.getContentPane().add(lblPeliculasDomingo);
		
		JTextArea peliculasVistasSabado_1 = new JTextArea();
		peliculasVistasSabado_1.setEditable(false);
		peliculasVistasSabado_1.setColumns(10);
		peliculasVistasSabado_1.setBackground(Color.WHITE);
		peliculasVistasSabado_1.setBounds(279, 73, 177, 143);
		frame_Resumen.getContentPane().add(peliculasVistasSabado_1);
		
		JTextArea peliculasVistasDomingo = new JTextArea();
		peliculasVistasDomingo.setEditable(false);
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(32, 73, 177, 143);
		frame_Resumen.getContentPane().add(peliculasVistasDomingo);
		
		JLabel lblResumen = new JLabel("Resumen");
		lblResumen.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblResumen.setBounds(174, 11, 142, 19);
		frame_Resumen.getContentPane().add(lblResumen);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 246, 69, 23);
		frame_Resumen.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame_bienvenida.frmBienvenida.setVisible(true);
				frame_Resumen.setVisible(false);
				
			}
		});
		
		
		JLabel lblTiempoEmisionSabado = new JLabel("Tiempo emision Sabado");
		lblTiempoEmisionSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblTiempoEmisionSabado.setBounds(110, 227, 173, 19);
		frame_Resumen.getContentPane().add(lblTiempoEmisionSabado);
		
		JLabel lblTiempoEmisionDomingo = new JLabel("tiempo emision Domingo");
		lblTiempoEmisionDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblTiempoEmisionDomingo.setBounds(101, 250, 186, 19);
		frame_Resumen.getContentPane().add(lblTiempoEmisionDomingo);
		
		TiempoEmisionSabado = new JTextField();
		TiempoEmisionSabado.setEditable(false);
		TiempoEmisionSabado.setColumns(10);
		TiempoEmisionSabado.setBounds(293, 224, 131, 20);
		frame_Resumen.getContentPane().add(TiempoEmisionSabado);
		
		TiempoEmisionDomingo = new JTextField("");
		TiempoEmisionDomingo.setEditable(false);
		TiempoEmisionDomingo.setColumns(10);
		TiempoEmisionDomingo.setBounds(293, 249, 131, 20);
		frame_Resumen.getContentPane().add(TiempoEmisionDomingo);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(434, 246, 98, 23);
		frame_Resumen.getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				frame_fin.frame_final.setVisible(true);
				frame_Resumen.setVisible(false);
				
				
			}
		});
	}
}

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

import controlador.Funciones_Generos;

public class Frame_Resumen {

	public static JFrame frame_Resumen;
	public static JTextField TiempoEmisionSabado, TiempoEmisionDomingo;
	public static JTextArea peliculasVistasDomingo, peliculasVistasSabado;
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
		lblPeliculasSabado.setBounds(51, 33, 142, 19);
		lblPeliculasSabado.setFont(new Font("Arial", Font.BOLD, 13));
		frame_Resumen.getContentPane().add(lblPeliculasSabado);
		
		JLabel lblPeliculasDomingo = new JLabel("Peliculas Domingo");
		lblPeliculasDomingo.setFont(new Font("Arial", Font.BOLD, 13));
		lblPeliculasDomingo.setBounds(315, 33, 150, 19);
		frame_Resumen.getContentPane().add(lblPeliculasDomingo);
		
		peliculasVistasDomingo = new JTextArea();
		peliculasVistasDomingo.setEditable(false);
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(285, 57, 177, 143);
		frame_Resumen.getContentPane().add(peliculasVistasDomingo);
		
		peliculasVistasSabado = new JTextArea();
		peliculasVistasSabado.setEditable(false);
		peliculasVistasSabado.setColumns(10);
		peliculasVistasSabado.setBackground(Color.WHITE);
		peliculasVistasSabado.setBounds(38, 57, 177, 143);
		frame_Resumen.getContentPane().add(peliculasVistasSabado);
		
		JLabel lblResumen = new JLabel("Resumen");
		lblResumen.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblResumen.setBounds(174, 11, 142, 19);
		frame_Resumen.getContentPane().add(lblResumen);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 246, 90, 23);
		frame_Resumen.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Frame_Confirmar_Salida().frame.setVisible(true);

			}
		});
		
		
		JLabel lblTiempoEmisionSabado = new JLabel("Tiempo emision Sabado");
		lblTiempoEmisionSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblTiempoEmisionSabado.setBounds(110, 227, 173, 19);
		frame_Resumen.getContentPane().add(lblTiempoEmisionSabado);
		
		JLabel lblTiempoEmisionDomingo = new JLabel("Tiempo emision Domingo");
		lblTiempoEmisionDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblTiempoEmisionDomingo.setBounds(101, 250, 186, 19);
		frame_Resumen.getContentPane().add(lblTiempoEmisionDomingo);
		
		TiempoEmisionSabado = new JTextField();
		TiempoEmisionSabado.setEditable(false);
		TiempoEmisionSabado.setColumns(10);
		TiempoEmisionSabado.setBounds(293, 224, 131, 20);
		frame_Resumen.getContentPane().add(TiempoEmisionSabado);
		
		TiempoEmisionDomingo = new JTextField();
		TiempoEmisionDomingo.setEditable(false);
		TiempoEmisionDomingo.setColumns(10);
		TiempoEmisionDomingo.setBounds(293, 249, 131, 20);
		frame_Resumen.getContentPane().add(TiempoEmisionDomingo);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(434, 246, 98, 23);
		frame_Resumen.getContentPane().add(btnContinuar);
		
		JButton btn_volver = new JButton("Volver");
		btn_volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame_Generos.frame_generos.setVisible(true);
				frame_Resumen.dispose();
			}
		});
		btn_volver.setBounds(10, 211, 90, 23);
		frame_Resumen.getContentPane().add(btn_volver);
		btnContinuar.addActionListener(new ActionListener() {
			
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				Funciones_Generos.limpiarLista("sabado");
				Funciones_Generos.limpiarLista("domingo");
				
				Frame_Final frame_fin = new Frame_Final();
				frame_fin.frame_final.setVisible(true);
				frame_Resumen.dispose();
				
				
			}
		});
	}
}

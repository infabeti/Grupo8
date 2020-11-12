package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Frame_Generos {

	public static JFrame frame_generos;
	public static JTextArea peliculasVistasSabado;
	public static JTextField tiempoSabado;
	public static JTextField tiempoDomingo;
	public static JTextArea peliculasVistasDomingo;
	public static final int TIEMPO_TOTAL_SABADO=28800; 	//te cambio el nombre porque las constantes se suelen poner en may�scula, luego para verlo es �til :)
	public static final int TIEMPO_TOTAL_DOMINGO=21600; //te cambio el nombre porque las constantes se suelen poner en may�scula, luego para verlo es �til :)
	public static Frame_Peliculas drama;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Generos window = new Frame_Generos();
					window.frame_generos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Frame_Generos() {
		initialize();
	}

	
	private void initialize() {
		frame_generos = new JFrame();
		frame_generos.setVisible(true);
		frame_generos.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame_generos.setBounds(100, 100, 655, 301);
		frame_generos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_generos.getContentPane().setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 227, 69, 23);
		frame_generos.getContentPane().add(btnSalir);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				drama = new Frame_Peliculas("Drama");
				drama.setVisible(true);
				frame_generos.setVisible(false);;
			}
		});
		btnDrama.setBounds(10, 67, 119, 23);
		btnDrama.setToolTipText("");
		frame_generos.getContentPane().add(btnDrama);
		
		JButton btnComedia = new JButton("Comedia");
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnComedia.setBounds(10, 101, 119, 23);
		frame_generos.getContentPane().add(btnComedia);
		
		JButton btnTerror = new JButton("Terror");
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTerror.setBounds(10, 135, 119, 23);
		frame_generos.getContentPane().add(btnTerror);
		
		JButton btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCienciaFiccion.setBounds(10, 169, 119, 23);
		frame_generos.getContentPane().add(btnCienciaFiccion);
		
		JLabel mensajeGeneros = new JLabel("Seleccione el genero ");
		mensajeGeneros.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeGeneros.setBounds(199, 11, 263, 29);
		frame_generos.getContentPane().add(mensajeGeneros);
		
		JLabel mensajeTiempoSabado = new JLabel("Tiempo restante sabado:");
		mensajeTiempoSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoSabado.setBounds(264, 203, 173, 19);
		frame_generos.getContentPane().add(mensajeTiempoSabado);
		
		JLabel mensajeTiempoDomingo = new JLabel("Tiempo restante domingo:");
		mensajeTiempoDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoDomingo.setBounds(255, 226, 186, 19);
		frame_generos.getContentPane().add(mensajeTiempoDomingo);
		
		peliculasVistasSabado = new JTextArea();
		peliculasVistasSabado.setEditable(false);
		peliculasVistasSabado.setBackground(Color.WHITE);
		peliculasVistasSabado.setBounds(166, 68, 216, 124);
		frame_generos.getContentPane().add(peliculasVistasSabado);
		peliculasVistasSabado.setColumns(10);
		
		JLabel mensajePeliculasSabado = new JLabel("Peliculas vistas sabado");
		mensajePeliculasSabado.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasSabado.setBounds(183, 44, 185, 23);
		frame_generos.getContentPane().add(mensajePeliculasSabado);
		
		tiempoSabado = new JTextField();
		tiempoSabado.setText("8 horas, 0 minutos.");
		tiempoSabado.setEditable(false);
		tiempoSabado.setBounds(477, 203, 131, 20);
		frame_generos.getContentPane().add(tiempoSabado);
		tiempoSabado.setColumns(10);
		
		tiempoDomingo = new JTextField();
		tiempoDomingo.setEditable(false);
		tiempoDomingo.setColumns(10);
		tiempoDomingo.setBounds(477, 228, 131, 20);
		frame_generos.getContentPane().add(tiempoDomingo);
		
		peliculasVistasDomingo = new JTextArea();
		peliculasVistasDomingo.setEditable(false);
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(400, 68, 216, 124);
		frame_generos.getContentPane().add(peliculasVistasDomingo);
		
		JLabel mensajePeliculasDomingo = new JLabel("Peliculas vistas domingo");
		mensajePeliculasDomingo.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasDomingo.setBounds(411, 45, 204, 23);
		frame_generos.getContentPane().add(mensajePeliculasDomingo);
	}
	
	
}

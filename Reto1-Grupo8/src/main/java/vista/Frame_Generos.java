package vista;

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

import controlador.Funciones_Generos;
import controlador.Funciones_Pelicula;
import controlador.Funciones_Resumen;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.border.LineBorder;

public class Frame_Generos {

	public static JFrame frame_generos;
	public static JTextArea peliculasVistasSabado;
	public static JTextField tiempoSabado;
	public static JTextField tiempoDomingo;
	public static JTextArea peliculasVistasDomingo;
	public static Frame_Peliculas frame_pelis_drama;
	public static Frame_Peliculas frame_pelis_comedia;
	public static Frame_Peliculas frame_pelis_scifi;
	public static Frame_Peliculas frame_pelis_terror;
	public static Frame_Peliculas frame_pelis;
	public static JLabel lb_genero_repetido;
	public static JLabel lb_seleccione_otro_genero;
	
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
		frame_generos.getContentPane().setBackground(new Color(255, 255, 255));
		frame_generos.setBounds(100, 100, 655, 301);
		frame_generos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_generos.getContentPane().setLayout(null);
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(0, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Frame_Confirmar_Salida().frame.setVisible(true);
			}
		});
		btnSalir.setBounds(10, 228, 69, 23);
		frame_generos.getContentPane().add(btnSalir);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.setForeground(new Color(255, 255, 255));
		btnDrama.setBackground(new Color(255, 140, 0));
		btnDrama.setBorderPainted(false);
		btnDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_pelis_drama = new Frame_Peliculas("Drama");
				frame_pelis_drama.setVisible(true);
				frame_generos.setVisible(false);
			}
		});
		btnDrama.setBounds(10, 67, 119, 23);
		btnDrama.setToolTipText("");
		frame_generos.getContentPane().add(btnDrama);
		//2 ideas, pasar el tiempo como parámetro de la ventana e incluirlo en la creación de la misma por género
		//hacer una variable global 
		JButton btnComedia = new JButton("Comedia");
		btnComedia.setForeground(new Color(255, 248, 220));
		btnComedia.setBackground(new Color(255, 140, 0));
		btnComedia.setBorderPainted(false);
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_pelis_comedia = new Frame_Peliculas("Comedia");
				frame_pelis_comedia.setVisible(true);
				frame_generos.setVisible(false);
			}
		});
		btnComedia.setBounds(10, 101, 119, 23);
		frame_generos.getContentPane().add(btnComedia);
		
		JButton btnTerror = new JButton("Terror");
		btnTerror.setForeground(new Color(255, 255, 255));
		btnTerror.setBackground(new Color(255, 140, 0));
		btnTerror.setBorderPainted(false);
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_pelis_terror = new Frame_Peliculas("Terror");
				frame_pelis_terror.setVisible(true);
				frame_generos.setVisible(false);
			}
		});
		btnTerror.setBounds(10, 135, 119, 23);
		frame_generos.getContentPane().add(btnTerror);
		
		JButton btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setForeground(new Color(255, 255, 255));
		btnCienciaFiccion.setBackground(new Color(255, 140, 0));
		btnCienciaFiccion.setBorderPainted(false);
		btnCienciaFiccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_pelis_scifi = new Frame_Peliculas("Sci-Fi");
				frame_pelis_scifi.setVisible(true);
				frame_generos.setVisible(false);
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
		mensajeTiempoSabado.setBounds(136, 203, 173, 19);
		frame_generos.getContentPane().add(mensajeTiempoSabado);
		
		JLabel mensajeTiempoDomingo = new JLabel("Tiempo restante domingo:");
		mensajeTiempoDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoDomingo.setBounds(127, 226, 186, 19);
		frame_generos.getContentPane().add(mensajeTiempoDomingo);
		
		peliculasVistasSabado = new JTextArea();
		peliculasVistasSabado.setEditable(false);
		peliculasVistasSabado.setBackground(Color.WHITE);
		peliculasVistasSabado.setBounds(166, 68, 216, 81);
		frame_generos.getContentPane().add(peliculasVistasSabado);
		peliculasVistasSabado.setColumns(10);
		
		JLabel mensajePeliculasSabado = new JLabel("Peliculas vistas sabado");
		mensajePeliculasSabado.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasSabado.setBounds(183, 44, 185, 23);
		frame_generos.getContentPane().add(mensajePeliculasSabado);
		
		tiempoSabado = new JTextField();
		tiempoSabado.setForeground(new Color(255, 255, 255));
		tiempoSabado.setCaretColor(new Color(255, 255, 255));
		tiempoSabado.setBackground(new Color(255, 140, 0));
		tiempoSabado.setText(Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_SABADO));
		tiempoSabado.setEditable(false);
		tiempoSabado.setBounds(349, 203, 131, 20);
		frame_generos.getContentPane().add(tiempoSabado);
		tiempoSabado.setColumns(10);
		
		tiempoDomingo = new JTextField(Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_DOMINGO));
		tiempoDomingo.setForeground(new Color(255, 255, 255));
		tiempoDomingo.setBackground(new Color(255, 140, 0));
		tiempoDomingo.setEditable(false);
		tiempoDomingo.setColumns(10);
		tiempoDomingo.setBounds(349, 228, 131, 20);
		frame_generos.getContentPane().add(tiempoDomingo);
		
		peliculasVistasDomingo = new JTextArea();
		peliculasVistasDomingo.setEditable(false);
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(400, 68, 216, 81);
		frame_generos.getContentPane().add(peliculasVistasDomingo);
		
		JLabel mensajePeliculasDomingo = new JLabel("Peliculas vistas domingo");
		mensajePeliculasDomingo.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasDomingo.setBounds(411, 45, 204, 23);
		frame_generos.getContentPane().add(mensajePeliculasDomingo);
		
		JButton btn_limpiar_sabado = new JButton("Limpiar lista");
		btn_limpiar_sabado.setForeground(new Color(255, 255, 255));
		btn_limpiar_sabado.setBackground(new Color(255, 0, 0));
		btn_limpiar_sabado.setBorderPainted(false);
		btn_limpiar_sabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funciones_Generos.limpiarLista("sabado");
			}
		});
		btn_limpiar_sabado.setBounds(166, 169, 216, 23);
		frame_generos.getContentPane().add(btn_limpiar_sabado);
		
		JButton btn_limpiar_domingo = new JButton("Limpiar lista");
		btn_limpiar_domingo.setBackground(new Color(255, 0, 0));
		btn_limpiar_domingo.setBorderPainted(false);
		btn_limpiar_domingo.setForeground(new Color(255, 255, 255));
		btn_limpiar_domingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funciones_Generos.limpiarLista("domingo");
			}
		});
		btn_limpiar_domingo.setBounds(400, 169, 216, 23);
		frame_generos.getContentPane().add(btn_limpiar_domingo);
		
		lb_genero_repetido = new JLabel("G\u00E9nero repetido,");
		lb_genero_repetido.setVisible(false);
		lb_genero_repetido.setForeground(Color.RED);
		lb_genero_repetido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_genero_repetido.setBounds(10, 11, 141, 23);
		frame_generos.getContentPane().add(lb_genero_repetido);
		
		lb_seleccione_otro_genero = new JLabel("seleccione otro g\u00E9nero*");
		lb_seleccione_otro_genero.setBorder(new LineBorder(new Color(255, 0, 0), 1, true));
		lb_seleccione_otro_genero.setVerticalAlignment(SwingConstants.BOTTOM);
		lb_seleccione_otro_genero.setVerticalTextPosition(SwingConstants.BOTTOM);
		lb_seleccione_otro_genero.setVisible(false);
		lb_seleccione_otro_genero.setForeground(Color.RED);
		lb_seleccione_otro_genero.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb_seleccione_otro_genero.setBounds(10, 11, 141, 44);
		frame_generos.getContentPane().add(lb_seleccione_otro_genero);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setBackground(new Color(255, 140, 0));
		btn_confirmar.setBorderPainted(false);
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Frame_Resumen().frame_Resumen.setVisible(true);
				Funciones_Resumen.escribirResumen();
				frame_generos.setVisible(false);
				
			}
		});
		btn_confirmar.setBounds(520, 227, 96, 23);
		frame_generos.getContentPane().add(btn_confirmar);
	}
}

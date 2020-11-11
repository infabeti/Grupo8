package Reto1.Grupo8;

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

public class Generos {

	private JFrame frame;
	private JTextField peliculasVistasSabado;
	private JTextField tiempoSabado;
	private JTextField tiempoDomingo;
	private JTextField peliculasVistasDomingo;
	final int tiempoTotalSabado=28800;
	final int tiempoTotalDomingo=21600;
	
	public int calcularSabado(int tiempoReproducidoSabado) {
		int tiempoRestanteSabado=0;	
		tiempoRestanteSabado=(tiempoTotalSabado-tiempoReproducidoSabado);
		
		return tiempoRestanteSabado;
	}
	
	public int calcularDomingo(int tiempoReproducidoDomingo) {
		int tiempoRestanteDomingo=0;
		tiempoRestanteDomingo=(tiempoTotalDomingo-tiempoReproducidoDomingo);
		
		return tiempoRestanteDomingo;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generos window = new Generos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Generos() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.setBounds(100, 100, 655, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 227, 69, 23);
		frame.getContentPane().add(btnSalir);
		
		JButton btnDrama = new JButton("Drama");
		btnDrama.setBounds(10, 67, 119, 23);
		btnDrama.setToolTipText("");
		frame.getContentPane().add(btnDrama);
		
		JButton btnComedia = new JButton("Comedia");
		btnComedia.setBounds(10, 101, 119, 23);
		frame.getContentPane().add(btnComedia);
		
		JButton btnTerror = new JButton("Terror");
		btnTerror.setBounds(10, 135, 119, 23);
		frame.getContentPane().add(btnTerror);
		
		JButton btnCienciaFiccion = new JButton("Ciencia Ficcion");
		btnCienciaFiccion.setBounds(10, 169, 119, 23);
		frame.getContentPane().add(btnCienciaFiccion);
		
		JLabel mensajeGeneros = new JLabel("Seleccione el genero ");
		mensajeGeneros.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeGeneros.setBounds(199, 11, 263, 29);
		frame.getContentPane().add(mensajeGeneros);
		
		JLabel mensajeTiempoSabado = new JLabel("Tiempo restante sabado:");
		mensajeTiempoSabado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoSabado.setBounds(264, 203, 173, 19);
		frame.getContentPane().add(mensajeTiempoSabado);
		
		JLabel mensajeTiempoDomingo = new JLabel("Tiempo restante domingo:");
		mensajeTiempoDomingo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 15));
		mensajeTiempoDomingo.setBounds(255, 226, 186, 19);
		frame.getContentPane().add(mensajeTiempoDomingo);
		
		peliculasVistasSabado = new JTextField();
		peliculasVistasSabado.setBackground(Color.WHITE);
		peliculasVistasSabado.setBounds(166, 68, 216, 124);
		frame.getContentPane().add(peliculasVistasSabado);
		peliculasVistasSabado.setColumns(10);
		
		JLabel mensajePeliculasSabado = new JLabel("Peliculas vistas sabado");
		mensajePeliculasSabado.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasSabado.setBounds(183, 44, 185, 23);
		frame.getContentPane().add(mensajePeliculasSabado);
		
		tiempoSabado = new JTextField();
		tiempoSabado.setBounds(491, 203, 95, 20);
		frame.getContentPane().add(tiempoSabado);
		tiempoSabado.setColumns(10);
		
		tiempoDomingo = new JTextField();
		tiempoDomingo.setColumns(10);
		tiempoDomingo.setBounds(488, 228, 98, 20);
		frame.getContentPane().add(tiempoDomingo);
		
		peliculasVistasDomingo = new JTextField();
		peliculasVistasDomingo.setColumns(10);
		peliculasVistasDomingo.setBackground(Color.WHITE);
		peliculasVistasDomingo.setBounds(400, 68, 216, 124);
		frame.getContentPane().add(peliculasVistasDomingo);
		
		JLabel mensajePeliculasDomingo = new JLabel("Peliculas vistas domingo");
		mensajePeliculasDomingo.setFont(new Font("Arial Black", Font.BOLD, 13));
		mensajePeliculasDomingo.setBounds(411, 45, 204, 23);
		frame.getContentPane().add(mensajePeliculasDomingo);
	}
	
	
}

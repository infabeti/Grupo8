package Reto1.Grupo8;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.*;
public class Bienvenida {
	private JFrame frmBienvenida;
	public Timer tiempo;
	
	public Bienvenida() {
		initialize();
		//temporizador para cambiar de ventana
		tiempo = new Timer(5000,null);
		tiempo.start();
		tiempo.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
					
				metodoTimer();
			}
			
		});
		
	}
	//metodo que indica la accion al acabar el Timer "tiempo", cambiar system.exit(0) por la ventana de login
	protected void metodoTimer() {
		System.exit(0);
		
		
	}


	private void initialize() {
		frmBienvenida = new JFrame();
		frmBienvenida.getContentPane().setBackground(Color.WHITE);
		frmBienvenida.getContentPane().setLayout(null);
		/*Mensaje de bienvenida*/
		JLabel mensajeBienvenida = new JLabel("BIENVENIDO");
		mensajeBienvenida.setBounds(10, 47, 434, 32);
		mensajeBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida.setFont(new Font("Arial Black", Font.BOLD, 42));
		frmBienvenida.getContentPane().add(mensajeBienvenida);
		
		JLabel autor1 = new JLabel("Markel Cuesta Arribas");
		autor1.setBounds(86, 314, 176, 14);
		frmBienvenida.getContentPane().add(autor1);
		
		JLabel autor2 = new JLabel("Alberto Garcia Lopez");
		autor2.setBounds(242, 314, 146, 14);
		frmBienvenida.getContentPane().add(autor2);
		
		JLabel mensajeBienvenida_1 = new JLabel("SELECCION DE PELICULAS");
		mensajeBienvenida_1.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeBienvenida_1.setBounds(10, 193, 434, 32);
		frmBienvenida.getContentPane().add(mensajeBienvenida_1);
		
		JLabel mensajeBienvenida_1_1 = new JLabel("SOFTWARE ");
		mensajeBienvenida_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBienvenida_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		mensajeBienvenida_1_1.setBounds(10, 129, 434, 32);
		frmBienvenida.getContentPane().add(mensajeBienvenida_1_1);
		frmBienvenida.setTitle("Bienvenida");
		frmBienvenida.setBounds(100, 100, 450, 378);
		frmBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Mensaje de bienvenida*/
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida window = new Bienvenida();
					window.frmBienvenida.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

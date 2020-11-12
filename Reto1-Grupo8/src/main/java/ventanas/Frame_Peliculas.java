package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import funciones.Pelicula;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame_Peliculas extends JFrame {

	private String genero;
	
	
	
	

	private JPanel contentPane;
	private JButton btn_cadena_perpetua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Peliculas frame = new Frame_Peliculas("Drama");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame_Peliculas(String genero) throws HeadlessException {
		this.genero = genero;
		//////////////////////////////////////
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		///
		
		
		
		////////////////////////////////////////////////////////
		//SI EL GÉNERO ES DRAMA
		if(genero.equals("Drama")) {
			JLabel lb_titulo_drama = new JLabel("Drama");
			lb_titulo_drama.setFont(new Font("Tahoma", Font.PLAIN, 22));
			
			JButton btn_handia = new JButton("Handia: 1h 56 min.");
			btn_handia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0){
					
					Pelicula.addPeli(Pelicula.handia);
				}
			});
			
			JButton btn_lista_sindler = new JButton("La lista de Schindler: 3 h 17 min.");
			btn_lista_sindler.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			btn_cadena_perpetua = new JButton("Cadena Perpetua: 2 h 22 min.");
			btn_cadena_perpetua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_million_dollar_baby = new JButton("Million Dollar Baby: 2 h 13 min.");
			btn_million_dollar_baby.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(41)
								.addComponent(lb_titulo_drama))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(23)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btn_lista_sindler, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btn_cadena_perpetua, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
									.addComponent(btn_million_dollar_baby, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
									.addComponent(btn_handia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap(214, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(22)
						.addComponent(lb_titulo_drama)
						.addGap(35)
						.addComponent(btn_handia)
						.addGap(18)
						.addComponent(btn_lista_sindler)
						.addGap(18)
						.addComponent(btn_cadena_perpetua)
						.addGap(18)
						.addComponent(btn_million_dollar_baby)
						.addContainerGap(21, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
			
		}
		
		///////////////////////////////////////////////////////////////
		//SI EL GÉNERO ES SCI-FI
		if(genero.equals("Sci-Fi")) {
			JLabel lb_titulo_scifi = new JLabel("Sci-Fi");
			lb_titulo_scifi.setFont(new Font("Tahoma", Font.PLAIN, 22));
			
			JButton btn_novia_frankenstein = new JButton("La novia de Frankenstein: 1 h 15 min.");
			btn_novia_frankenstein.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_odisea_en_el_espacio = new JButton("2001: Odisea en el espacio 2 h 22 min.");
			btn_odisea_en_el_espacio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_el_planeta_de_los_simios = new JButton("El planeta de los simios: 1 h 55 min.");
			btn_el_planeta_de_los_simios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_allien_el_octavo_pasajero = new JButton("Alien, el octavo pasajero: 1 h 57 min.");
			btn_allien_el_octavo_pasajero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(20)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addComponent(lb_titulo_scifi, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
							.addComponent(btn_novia_frankenstein, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_el_planeta_de_los_simios, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_allien_el_octavo_pasajero, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_odisea_en_el_espacio, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(171, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lb_titulo_scifi, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(btn_odisea_en_el_espacio)
						.addGap(18)
						.addComponent(btn_novia_frankenstein)
						.addGap(18)
						.addComponent(btn_el_planeta_de_los_simios)
						.addGap(18)
						.addComponent(btn_allien_el_octavo_pasajero)
						.addContainerGap(32, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
		}
		//////////////////////////////////////////////
		//SI EL GÉNERO ES COMEDIA
		if(genero.equals("Comedia")) {
			JLabel lb_titulo_drama_1 = new JLabel("Comedia");
			lb_titulo_drama_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
			
			JButton btn_el_gran_lebowski = new JButton("El gran Lebowsky: 1 h 59 min.");
			btn_el_gran_lebowski.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_scary_movie = new JButton("Scary movie: 1 h 30 min.");
			btn_scary_movie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_la_vida_de_brian = new JButton("La vida de Brian: 1 h 34 min.");
			btn_la_vida_de_brian.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_aterriza_como_puedas = new JButton("Aterriza como puedas: 1 h 28 min.");
			btn_aterriza_como_puedas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(btn_scary_movie, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_el_gran_lebowski, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_la_vida_de_brian, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_aterriza_como_puedas, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addComponent(lb_titulo_drama_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(227, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lb_titulo_drama_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(btn_scary_movie)
						.addGap(18)
						.addComponent(btn_el_gran_lebowski)
						.addGap(18)
						.addComponent(btn_la_vida_de_brian)
						.addGap(18)
						.addComponent(btn_aterriza_como_puedas)
						.addContainerGap(42, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
		}
		/////////////////////////////////////////////////////
		//SI EL GÉNERO ES TERROR
		if(genero.equals("Terror")) {
			JLabel lb_titulo_drama_1_1 = new JLabel("Terror");
			lb_titulo_drama_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
			
			JButton btn_psicosis = new JButton("Psicosis: 1 h 49 min.");
			btn_psicosis.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_el_resplandor = new JButton("El resplandor: 2 h 26 min.");
			btn_el_resplandor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_dracula = new JButton("Dracula: 2 h 35 min.");
			btn_dracula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JButton btn_cisne_negro = new JButton("Cisne negro: 1 h 50 min.");
			btn_cisne_negro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addComponent(lb_titulo_drama_1_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addComponent(btn_psicosis, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_el_resplandor, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_dracula, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn_cisne_negro, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(227, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGap(1)
						.addComponent(lb_titulo_drama_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(btn_psicosis)
						.addGap(18)
						.addComponent(btn_el_resplandor)
						.addGap(18)
						.addComponent(btn_dracula)
						.addGap(18)
						.addComponent(btn_cisne_negro)
						.addContainerGap(32, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
		}
		
	}
}

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Funciones_Generos;
import controlador.Funciones_Pelicula;
import modelo.Objeto_Pelicula;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Frame_Peliculas extends JFrame {

	private String genero;
	
	
	
	

	private JPanel contentPane;
	private JButton btn_cadena_perpetua;
	public static JTextField tf_disponible_sabado;

	public static JTextField tf_disponible_domingo;

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
					
					Funciones_Pelicula.addPeli(Objeto_Pelicula.handia, Frame_Generos.frame_pelis_drama);
				}
			});
			
			JButton btn_lista_sindler = new JButton("La lista de Schindler: 3 h 17 min.");
			btn_lista_sindler.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.lista_Schindler,Frame_Generos.frame_pelis_drama);
				}
			});
			
			btn_cadena_perpetua = new JButton("Cadena Perpetua: 2 h 22 min.");
			btn_cadena_perpetua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.cadena_perpetua, Frame_Generos.frame_pelis_drama);

				}
			});
			
			JButton btn_million_dollar_baby = new JButton("Million Dollar Baby: 2 h 13 min.");
			btn_million_dollar_baby.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.mdb,Frame_Generos.frame_pelis_drama);
				}
			});
			tf_disponible_sabado = new JTextField(Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_SABADO));
			tf_disponible_sabado.setEditable(false);
			tf_disponible_sabado.setColumns(10);
			
			tf_disponible_domingo = new JTextField(Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_DOMINGO));
			tf_disponible_domingo.setEditable(false);
			tf_disponible_domingo.setColumns(10);
			
			JLabel lb_disponible_sabado = new JLabel("Disponible s\u00E1bado:");
			
			JLabel lblNewLabel = new JLabel("Disponible domingo:");
			
			JButton bt_generos = new JButton("Volver a g\u00E9neros");
			bt_generos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.frame_pelis_drama.dispose();
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(23)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btn_lista_sindler, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btn_cadena_perpetua, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
									.addComponent(btn_million_dollar_baby, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
									.addComponent(btn_handia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(41)
								.addComponent(lb_titulo_drama)))
						.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lb_disponible_sabado)
									.addContainerGap())
								.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(tf_disponible_domingo)
										.addContainerGap())
									.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(tf_disponible_sabado)
											.addContainerGap())
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(bt_generos, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
											.addContainerGap()))))))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(22)
						.addComponent(lb_titulo_drama)
						.addGap(31)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(4)
								.addComponent(btn_handia))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lb_disponible_sabado)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(tf_disponible_sabado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(7)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btn_lista_sindler)
								.addGap(18)
								.addComponent(btn_cadena_perpetua)
								.addGap(18)
								.addComponent(btn_million_dollar_baby))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(tf_disponible_domingo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(bt_generos)))
						.addContainerGap(19, Short.MAX_VALUE))
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
					Funciones_Pelicula.addPeli(Objeto_Pelicula.novia_Frankenstein,Frame_Generos.frame_pelis_scifi);

				}
			});
			
			JButton btn_odisea_en_el_espacio = new JButton("2001: Odisea en el espacio 2 h 22 min.");
			btn_odisea_en_el_espacio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.space_odyssey, Frame_Generos.frame_pelis_scifi);
				}
			});
			
			JButton btn_el_planeta_de_los_simios = new JButton("El planeta de los simios: 1 h 55 min.");
			btn_el_planeta_de_los_simios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.planeta_simios, Frame_Generos.frame_pelis_scifi);

				}
			});
			
			JButton btn_allien_el_octavo_pasajero = new JButton("Alien, el octavo pasajero: 1 h 57 min.");
			btn_allien_el_octavo_pasajero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.alien, Frame_Generos.frame_pelis_scifi);
				}
			});
			JButton bt_generos = new JButton("Volver a g\u00E9neros");
			bt_generos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.frame_pelis_scifi.dispose();
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
							.addComponent(btn_novia_frankenstein, GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_el_planeta_de_los_simios, GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_allien_el_octavo_pasajero, GroupLayout.PREFERRED_SIZE, 187, Short.MAX_VALUE)
							.addComponent(btn_odisea_en_el_espacio, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(bt_generos, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
					.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(178, Short.MAX_VALUE)
						.addComponent(bt_generos)
						.addGap(50))
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
					Funciones_Pelicula.addPeli(Objeto_Pelicula.gran_lebowski, Frame_Generos.frame_pelis_comedia);

				}
			});
			
			JButton btn_scary_movie = new JButton("Scary movie: 1 h 30 min.");
			btn_scary_movie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.scary_movie, Frame_Generos.frame_pelis_comedia);
				}
			});
			
			JButton btn_la_vida_de_brian = new JButton("La vida de Brian: 1 h 34 min.");
			btn_la_vida_de_brian.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.vida_brian, Frame_Generos.frame_pelis_comedia);
				}
			});
			
			JButton btn_aterriza_como_puedas = new JButton("Aterriza como puedas: 1 h 28 min.");
			btn_aterriza_como_puedas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.aterriza_como_puedas, Frame_Generos.frame_pelis_comedia);
				}
			});
			
			JButton bt_generos = new JButton("Volver a g\u00E9neros");
			bt_generos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.frame_pelis_comedia.dispose();
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
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btn_aterriza_como_puedas, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
								.addComponent(bt_generos, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addComponent(lb_titulo_drama_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
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
						.addContainerGap(32, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(185, Short.MAX_VALUE)
						.addComponent(bt_generos)
						.addGap(43))
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
					Funciones_Pelicula.addPeli(Objeto_Pelicula.psicosis, Frame_Generos.frame_pelis_terror);

				}
			});
			
			JButton btn_el_resplandor = new JButton("El resplandor: 2 h 26 min.");
			btn_el_resplandor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.el_resplandor, Frame_Generos.frame_pelis_terror);
				}
			});
			
			JButton btn_dracula = new JButton("Dracula: 2 h 35 min.");
			btn_dracula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.dracula, Frame_Generos.frame_pelis_terror);
				}
				
			});
			
			JButton btn_cisne_negro = new JButton("Cisne negro: 1 h 50 min.");
			btn_cisne_negro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Funciones_Pelicula.addPeli(Objeto_Pelicula.cisne_negro, Frame_Generos.frame_pelis_terror);
				}
			});
			JButton bt_generos = new JButton("Volver a g\u00E9neros");
			bt_generos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.frame_pelis_terror.dispose();
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
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btn_cisne_negro, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
								.addComponent(bt_generos, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lb_titulo_drama_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(btn_psicosis)
						.addGap(18)
						.addComponent(btn_el_resplandor)
						.addGap(18)
						.addComponent(btn_dracula)
						.addGap(18)
						.addComponent(btn_cisne_negro)
						.addContainerGap(42, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(172, Short.MAX_VALUE)
						.addComponent(bt_generos)
						.addGap(56))
			);
			contentPane.setLayout(gl_contentPane);
		}
		
	}
}

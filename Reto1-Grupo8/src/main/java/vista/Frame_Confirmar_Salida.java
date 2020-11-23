package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import controlador.Funciones_Generos;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frame_Confirmar_Salida {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Confirmar_Salida window = new Frame_Confirmar_Salida();
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
	public Frame_Confirmar_Salida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 140, 0));
		frame.setBounds(100, 100, 269, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn_confirmar = new JButton("Aceptar");
		btn_confirmar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_confirmar.setBorderPainted(false);
		btn_confirmar.setBackground(new Color(255, 255, 255));
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame_Generos.frame_generos.dispose();
				if(Frame_Resumen.frmResumen != null)
					Frame_Resumen.frmResumen.dispose();

				Funciones_Generos.limpiarLista("sabado");
				Funciones_Generos.limpiarLista("domingo");
				frame.dispose();
				Frame_Bienvenida bienvenida=new Frame_Bienvenida();
				bienvenida.frmBienvenida.setVisible(true);			}
		});
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_cancelar.setBorderPainted(false);
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		JLabel lbl_confirmar_salir = new JLabel("\u00BFEst\u00E1 seguro que desea salir?");
		lbl_confirmar_salir.setForeground(new Color(255, 255, 255));
		lbl_confirmar_salir.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbl_confirmar_salir, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn_confirmar, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(btn_cancelar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
					.addGap(25))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lbl_confirmar_salir, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_confirmar)
						.addComponent(btn_cancelar))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}

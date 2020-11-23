package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Funciones_Login;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.ComponentOrientation;

public class Frame_Login extends JFrame {
	private static JLabel label_usuario_no_existe,label_password_incorrecta;
	private JPanel contentPane;
	private static JTextField jtf_usuario;
	private static JPasswordField jtf_password;
	private final Action boton_entrar = new SwingAction();
	private static Frame_Login frame;
	
	
	
	public static Frame_Login getFrame() {
		return frame;
	}

	public static void setFrame(Frame_Login frame) {
		Frame_Login.frame = frame;
	}

	public static JLabel getLabel_usuario_no_existe() {
		return label_usuario_no_existe;
	}

	public static void setLabel_usuario_no_existe(JLabel label_usuario_no_existe) {
		Frame_Login.label_usuario_no_existe = label_usuario_no_existe;
	}

	public static JLabel getLabel_password_incorrecta() {
		return label_password_incorrecta;
	}

	public static void setLabel_password_incorrecta(JLabel label_password_incorrecta) {
		Frame_Login.label_password_incorrecta = label_password_incorrecta;
	}



	public static JTextField getJtf_usuario() {
		return jtf_usuario;
	}

	public static void setJtf_usuario(JTextField jtf_usuario) {
		Frame_Login.jtf_usuario = jtf_usuario;
	}

	public static JPasswordField getJtf_password() {
		return jtf_password;
	}

	public static void setJtf_password(JPasswordField jtf_password) {
		Frame_Login.jtf_password = jtf_password;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Frame_Login();
					setFrame(frame); //Para poder acceder a la ventana desde otras clases
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
	public Frame_Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Inicia Sesi\u00F3n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 140, 0));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		jtf_usuario = new JTextField();
		jtf_usuario.setBorder(new LineBorder(new Color(255, 140, 0), 1, true));
		jtf_usuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(new Color(0, 0, 0));
		lblContrasea.setBackground(new Color(0, 0, 0));
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		jtf_password = new JPasswordField();
		jtf_password.setBorder(new LineBorder(new Color(255, 140, 0), 1, true));
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(255, 140, 0));
		btnEntrar.setAction(boton_entrar);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//SE PULSA EL BOTÓN
				Funciones_Login.validarCampos(jtf_usuario.getText(), jtf_password.getText());
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		label_usuario_no_existe = new JLabel("*El usuario no existe");
		label_usuario_no_existe.setVisible(false);
		label_usuario_no_existe.setForeground(Color.RED);
		
		label_password_incorrecta = new JLabel("*La contrase\u00F1a es incorrecta");
		label_password_incorrecta.setForeground(Color.RED);
		label_password_incorrecta.setVisible(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(196)
					.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(260, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario)
						.addComponent(lblContrasea, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
							.addGap(111))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jtf_password)
								.addComponent(jtf_usuario, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_password_incorrecta, Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_usuario_no_existe)
									.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)))))
					.addGap(126))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(55, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(jtf_usuario, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario)
						.addComponent(label_usuario_no_existe))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(jtf_password, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_password_incorrecta))
					.addGap(35)
					.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Entrar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

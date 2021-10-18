package Tema15_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ControlAcceso {

	private JFrame frmControlDeAcceso;
	private JTextField txtUsu;
	private JPasswordField pswCont;
	private JLabel lblCerr, lblAbi, lblFbck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlAcceso window = new ControlAcceso();
					window.frmControlDeAcceso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlAcceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmControlDeAcceso = new JFrame();
		frmControlDeAcceso.setTitle("Control de Acceso DAM-Curso 2020-2021");
		frmControlDeAcceso.setBounds(100, 100, 450, 342);
		frmControlDeAcceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControlDeAcceso.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(35, 30, 56, 16);
		frmControlDeAcceso.getContentPane().add(lblUsuario);
		
		JLabel lblContrasenya = new JLabel("Contrase\u00F1a:");
		lblContrasenya.setBounds(35, 69, 76, 16);
		frmControlDeAcceso.getContentPane().add(lblContrasenya);
		
		txtUsu = new JTextField();
		txtUsu.setBounds(124, 27, 116, 22);
		frmControlDeAcceso.getContentPane().add(txtUsu);
		txtUsu.setColumns(10);
		
		JButton btnAcep = new JButton("Aceptar");
		btnAcep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = txtUsu.getText();
				char [] contras = pswCont.getPassword();
				String cont = String.valueOf(contras);
				
				if(usuario.isEmpty() || cont.isEmpty()) {
					lblAbi.setVisible(false);
					lblCerr.setVisible(false);
					lblFbck.setText("");
					JOptionPane.showMessageDialog(frmControlDeAcceso, "DEBE COMPLETAR LOS DOS CAMPOS",
							"Mensaje", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else {
					AccesoBDatos abd = new AccesoBDatos();
					try {
						abd.conectar();
						if(abd.clave(usuario, cont)) {
							lblAbi.setVisible(true);
							lblCerr.setVisible(false);
							lblFbck.setText("Bienvenido/a " + abd.dameNombre(usuario));
						}
						else {
							lblFbck.setText("Usuario/Contraseña incorrectos");
							lblAbi.setVisible(false);
							lblCerr.setVisible(true);
						}
							
							
					} catch (ClassNotFoundException | SQLException e) {
						System.out.println(e.getMessage());
					}
				}
					
			}
		});
		btnAcep.setBounds(290, 44, 97, 25);
		frmControlDeAcceso.getContentPane().add(btnAcep);
		
		lblCerr = new JLabel("");
		lblCerr.setEnabled(true);
		lblCerr.setIcon(new ImageIcon(ControlAcceso.class.getResource("/Tema15_2/Imagenes/candado_cerrado.png")));
		lblCerr.setBounds(165, 101, 97, 139);
		frmControlDeAcceso.getContentPane().add(lblCerr);
		lblCerr.setVisible(false);
		
		lblAbi = new JLabel("");
		lblAbi.setIcon(new ImageIcon(ControlAcceso.class.getResource("/Tema15_2/Imagenes/candado_abierto.png")));
		lblAbi.setEnabled(true);
		lblAbi.setBounds(143, 101, 97, 139);
		frmControlDeAcceso.getContentPane().add(lblAbi);
		lblAbi.setVisible(false);
		
		lblFbck = new JLabel("");
		lblFbck.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFbck.setBounds(60, 246, 308, 36);
		frmControlDeAcceso.getContentPane().add(lblFbck);
		
		pswCont = new JPasswordField();
		pswCont.setBounds(123, 69, 117, 22);
		frmControlDeAcceso.getContentPane().add(pswCont);
	}
}

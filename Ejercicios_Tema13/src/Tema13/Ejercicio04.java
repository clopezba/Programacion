package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Ejercicio04 {

	private JFrame frmIniciarSesin;
	private JPasswordField psswContras;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04 window = new Ejercicio04();
					window.frmIniciarSesin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesin = new JFrame();
		frmIniciarSesin.setMinimumSize(new Dimension(400, 200));
		frmIniciarSesin.setTitle("Iniciar Sesi\u00F3n");
		frmIniciarSesin.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(30, 33, 50, 15);
		lblUsuario.setIconTextGap(0);
		lblUsuario.setHorizontalTextPosition(SwingConstants.LEFT);
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmIniciarSesin.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(137, 30, 106, 21);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmIniciarSesin.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContras = new JLabel("Contrase\u00F1a:");
		lblContras.setBounds(30, 59, 72, 15);
		lblContras.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmIniciarSesin.getContentPane().add(lblContras);
		
		psswContras = new JPasswordField();
		psswContras.setBounds(137, 56, 106, 21);
		psswContras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psswContras.setColumns(10);
		frmIniciarSesin.getContentPane().add(psswContras);
		
		JButton btnVal = new JButton("Validar");
		btnVal.setBounds(137, 104, 105, 29);
		btnVal.setPreferredSize(new Dimension(105, 21));
		btnVal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = "dam";
				String contras = "1234";
				
				if(txtUsuario.getText().equals(usuario) && psswContras.getText().equals(contras))
					frmIniciarSesin.setTitle("Validación Correcta");
				else
					frmIniciarSesin.setTitle("Validación Incorrecta");
			}
		});
		btnVal.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmIniciarSesin.getContentPane().add(btnVal);
	}
}

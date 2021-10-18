package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ejercicio07 implements ChangeListener{

	private JFrame frmConfirmar;
	private JCheckBox chbAcepto;
	private JButton btnContinuar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio07 window = new Ejercicio07();
					window.frmConfirmar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfirmar = new JFrame();
		frmConfirmar.setTitle("Confirmar");
		frmConfirmar.setBounds(100, 100, 450, 300);
		frmConfirmar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConfirmar.getContentPane().setLayout(null);
		
		JLabel lblTexto = new JLabel("He le\u00EDdo el documento y acepto las condiciones");
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTexto.setBounds(10, 23, 324, 24);
		frmConfirmar.getContentPane().add(lblTexto);
		
		chbAcepto = new JCheckBox("Acepto");
		chbAcepto.setFont(new Font("Tahoma", Font.BOLD, 11));
		chbAcepto.setBounds(10, 66, 97, 23);
		frmConfirmar.getContentPane().add(chbAcepto);
		chbAcepto.addChangeListener(this);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setEnabled(false);
		btnContinuar.setBounds(10, 107, 97, 24);
		frmConfirmar.getContentPane().add(btnContinuar);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if(chbAcepto.isSelected())
			btnContinuar.setEnabled(true);
		if(!chbAcepto.isSelected())
			btnContinuar.setEnabled(false);
		
	}
}

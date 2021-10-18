package Tema13;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ejercicio06 implements ActionListener {

	private JFrame frmPracticandoConCombos;
	private JComboBox<Integer> cmbRojo, cmbVerde, cmbAzul;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 window = new Ejercicio06();
					window.frmPracticandoConCombos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPracticandoConCombos = new JFrame();
		frmPracticandoConCombos.setTitle("Practicando con combos");
		frmPracticandoConCombos.setBounds(100, 100, 450, 300);
		frmPracticandoConCombos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPracticandoConCombos.getContentPane().setLayout(null);
		
		JLabel lblRojo = new JLabel("Rojo:");
		lblRojo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRojo.setBounds(22, 28, 46, 14);
		frmPracticandoConCombos.getContentPane().add(lblRojo);
		
		cmbRojo = new JComboBox<Integer>();
		cmbRojo.setBounds(104, 26, 52, 20);
		frmPracticandoConCombos.getContentPane().add(cmbRojo);
		
		JLabel lblVerde = new JLabel("Verde:");
		lblVerde.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVerde.setBounds(22, 67, 46, 14);
		frmPracticandoConCombos.getContentPane().add(lblVerde);
		
		cmbVerde = new JComboBox<Integer>();
		cmbVerde.setBounds(104, 65, 52, 20);
		frmPracticandoConCombos.getContentPane().add(cmbVerde);
		
		JLabel lblAzul = new JLabel("Azul:");
		lblAzul.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAzul.setBounds(22, 106, 46, 14);
		frmPracticandoConCombos.getContentPane().add(lblAzul);
		
		cmbAzul = new JComboBox<Integer>();
		cmbAzul.setBounds(104, 104, 52, 20);
		frmPracticandoConCombos.getContentPane().add(cmbAzul);
		
		JButton btnColor = new JButton("Color de fondo");
		btnColor.addActionListener(this);
		btnColor.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnColor.setBounds(22, 153, 134, 23);
		frmPracticandoConCombos.getContentPane().add(btnColor);
		
		//Asignar valores a los comboBox
		for (int i = 0; i < 256; i++) {
			cmbRojo.addItem(i);
			cmbVerde.addItem(i);
			cmbAzul.addItem(i);
		}
		
	}
	public void actionPerformed(ActionEvent ae) {
		Color color1 = new Color((int)cmbRojo.getSelectedItem(), (int)cmbVerde.getSelectedItem(), (int)cmbAzul.getSelectedItem());
		frmPracticandoConCombos.getContentPane().setBackground(color1);
	}
}

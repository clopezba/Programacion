package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;

public class Ejercicio08 implements ChangeListener{

	private JFrame frmIdiomas;
	private JCheckBox chbIngles, chbFrances, chbAleman;
	private JLabel lblIdiomas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio08 window = new Ejercicio08();
					window.frmIdiomas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdiomas = new JFrame();
		frmIdiomas.setTitle("Idiomas");
		frmIdiomas.setBounds(100, 100, 450, 300);
		frmIdiomas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIdiomas.getContentPane().setLayout(null);
		
		chbIngles = new JCheckBox("Ingl\u00E9s");
		chbIngles.setFont(new Font("Tahoma", Font.BOLD, 12));
		chbIngles.setBounds(6, 23, 97, 23);
		frmIdiomas.getContentPane().add(chbIngles);
		chbIngles.addChangeListener(this);
		
		chbFrances = new JCheckBox("Franc\u00E9s");
		chbFrances.setFont(new Font("Tahoma", Font.BOLD, 12));
		chbFrances.setBounds(6, 59, 97, 23);
		frmIdiomas.getContentPane().add(chbFrances);
		chbFrances.addChangeListener(this);
		
		chbAleman = new JCheckBox("Alem\u00E1n");
		chbAleman.setFont(new Font("Tahoma", Font.BOLD, 12));
		chbAleman.setBounds(6, 98, 97, 23);
		frmIdiomas.getContentPane().add(chbAleman);
		chbAleman.addChangeListener(this);
		
		JLabel lblIdiSel = new JLabel("Idiomas seleccionados:");
		lblIdiSel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdiSel.setBounds(10, 140, 135, 23);
		frmIdiomas.getContentPane().add(lblIdiSel);
		
		lblIdiomas = new JLabel("");
		lblIdiomas.setForeground(Color.BLUE);
		lblIdiomas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdiomas.setBounds(155, 141, 233, 23);
		frmIdiomas.getContentPane().add(lblIdiomas);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String idiomas = "";
		if(chbIngles.isSelected())
			idiomas += "Inglés-";
		if(chbFrances.isSelected())
			idiomas += "Francés-";
		if(chbAleman.isSelected())
			idiomas += "Alemán-";
		
		lblIdiomas.setText(idiomas);
			
		
	}

}

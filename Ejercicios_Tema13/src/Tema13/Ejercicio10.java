package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio10 implements ActionListener{

	private JFrame frmCalculadora;
	private JTextField txtDat1;
	private JTextField txtDat2;
	private JMenuItem mnitSumar, mnitRestar, mnitMultip, mnitDividir, mnitSalir, mnitAbout;
	private JLabel lblResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 window = new Ejercicio10();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ejercicio10.class.getResource("/Tema13/calculadora.jpg")));
		lblNewLabel.setBounds(83, 0, 122, 92);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		JLabel lblDat1 = new JLabel("Dato 1:");
		lblDat1.setBounds(10, 118, 46, 14);
		frmCalculadora.getContentPane().add(lblDat1);
		
		JLabel lblDat2 = new JLabel("Dato 2:");
		lblDat2.setBounds(10, 142, 46, 14);
		frmCalculadora.getContentPane().add(lblDat2);
		
		JLabel lblRes = new JLabel("Resultado:");
		lblRes.setBounds(10, 170, 78, 14);
		frmCalculadora.getContentPane().add(lblRes);
		
		txtDat1 = new JTextField();
		txtDat1.setBounds(98, 118, 86, 20);
		frmCalculadora.getContentPane().add(txtDat1);
		txtDat1.setColumns(10);
		
		txtDat2 = new JTextField();
		txtDat2.setColumns(10);
		txtDat2.setBounds(98, 142, 86, 20);
		frmCalculadora.getContentPane().add(txtDat2);
		
		lblResul = new JLabel("");
		lblResul.setBorder(new LineBorder(SystemColor.inactiveCaption));
		lblResul.setBounds(98, 167, 86, 20);
		frmCalculadora.getContentPane().add(lblResul);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculadora.setJMenuBar(menuBar);
		
		JMenu mnOperac = new JMenu("Operaciones");
		menuBar.add(mnOperac);
		
		mnitSumar = new JMenuItem("Sumar");
		mnOperac.add(mnitSumar);
		mnitSumar.addActionListener(this);
		
		mnitRestar = new JMenuItem("Restar");
		mnOperac.add(mnitRestar);
		mnitRestar.addActionListener(this);
		
		mnitMultip = new JMenuItem("Multiplicar");
		mnOperac.add(mnitMultip);
		mnitMultip.addActionListener(this);
		
		mnitDividir = new JMenuItem("Dividir");
		mnOperac.add(mnitDividir);
		mnitDividir.addActionListener(this);
		
		JMenu mnAplic = new JMenu("Aplicaci\u00F3n");
		menuBar.add(mnAplic);
		
		mnitSalir = new JMenuItem("Salir");
		mnAplic.add(mnitSalir);
		mnitSalir.addActionListener(this);
		
		mnitAbout = new JMenuItem("About");
		mnAplic.add(mnitAbout);
		mnitAbout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==mnitSalir)
			System.exit(0);
		else if(ae.getSource()==mnitAbout)
			JOptionPane.showMessageDialog(frmCalculadora,
					"Calculadora creada por Cristina", "About", JOptionPane.INFORMATION_MESSAGE);
		else {
		double num1 = Double.parseDouble(txtDat1.getText());
		double num2 = Double.parseDouble(txtDat2.getText());
		
		if(ae.getSource()==mnitSumar)
			lblResul.setText(Double.toString(num1+num2));
		if(ae.getSource()==mnitRestar)
			lblResul.setText(Double.toString(num1-num2));
		if(ae.getSource()==mnitMultip)
			lblResul.setText(Double.toString(num1*num2));
		if(ae.getSource()==mnitDividir)
			lblResul.setText(Double.toString(num1/num2));
		}
	}
}

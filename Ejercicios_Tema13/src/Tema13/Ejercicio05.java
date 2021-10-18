package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio05 implements ActionListener {

	private JFrame frmCalculadora;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btnSumar;
	private JLabel lblResul;
	private JButton btnRestar;
	private JButton btnMultip;
	private JButton btnDividir;
	private JButton btnSalir;
	private JButton btnAcercaDe;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio05 window = new Ejercicio05();
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
	public Ejercicio05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setPreferredSize(new Dimension(300, 500));
		frmCalculadora.getContentPane().setLayout(null);
		
		
		JLabel lblCalc = new JLabel("");
		lblCalc.setBounds(128, 31, 122, 82);
		lblCalc.setMinimumSize(new Dimension(122, 82));
		lblCalc.setPreferredSize(new Dimension(122, 82));
		lblCalc.setIcon(new ImageIcon(Ejercicio05.class.getResource("/Tema13/calculadora.jpg")));
		frmCalculadora.getContentPane().add(lblCalc);
		
		JLabel lblNum1 = new JLabel("Dato1:");
		lblNum1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNum1.setBounds(23, 146, 45, 13);
		frmCalculadora.getContentPane().add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNum1.setBounds(114, 144, 96, 19);
		frmCalculadora.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNum2.setColumns(10);
		txtNum2.setBounds(114, 183, 96, 19);
		frmCalculadora.getContentPane().add(txtNum2);
		
		JLabel lblNum2 = new JLabel("Dato2:");
		lblNum2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNum2.setBounds(23, 185, 45, 13);
		frmCalculadora.getContentPane().add(lblNum2);
		
		JLabel lblRes = new JLabel("Resultado:");
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRes.setBounds(23, 226, 81, 13);
		frmCalculadora.getContentPane().add(lblRes);
		
		lblResul = new JLabel("");
		lblResul.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResul.setForeground(Color.RED);
		lblResul.setBorder(new LineBorder(SystemColor.inactiveCaption));
		lblResul.setBounds(114, 220, 96, 19);
		frmCalculadora.getContentPane().add(lblResul);
		
		btnSumar = new JButton("+");
		btnSumar.addActionListener(this);
		btnSumar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSumar.setBounds(245, 143, 65, 33);
		frmCalculadora.getContentPane().add(btnSumar);
		
		btnRestar = new JButton("-");
		btnRestar.addActionListener(this);
		btnRestar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRestar.setBounds(245, 183, 65, 33);
		frmCalculadora.getContentPane().add(btnRestar);
		
		btnMultip = new JButton("x");
		btnMultip.addActionListener(this);
		btnMultip.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMultip.setBounds(245, 220, 65, 33);
		frmCalculadora.getContentPane().add(btnMultip);
		
		btnDividir = new JButton("/");
		btnDividir.addActionListener(this);
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDividir.setBounds(245, 260, 65, 33);
		frmCalculadora.getContentPane().add(btnDividir);
		
		btnSalir = new JButton("");
		btnSalir.addActionListener(this);
		btnSalir.setIconTextGap(0);
		btnSalir.setIcon(new ImageIcon(Ejercicio05.class.getResource("/Tema13/puerta.jpg")));
		btnSalir.setBounds(49, 286, 55, 56);
		frmCalculadora.getContentPane().add(btnSalir);
		
		btnAcercaDe = new JButton("");
		btnAcercaDe.addActionListener(this);
		btnAcercaDe.setIcon(new ImageIcon(Ejercicio05.class.getResource("/Tema13/hombre.png")));
		btnAcercaDe.setIconTextGap(0);
		btnAcercaDe.setBounds(129, 286, 55, 56);
		frmCalculadora.getContentPane().add(btnAcercaDe);
		frmCalculadora.setBounds(100, 100, 420, 413);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnSalir) {
			System.exit(0);
		}
		if(ae.getSource()==btnAcercaDe) {
			JOptionPane.showMessageDialog(frmCalculadora, "Calculadora sencilla - Tema 13 Interfaces gráficas", "Acerca De", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			if(ae.getSource()==btnSumar)
				lblResul.setText(Double.toString(num1+num2));
			if(ae.getSource()==btnRestar)
				lblResul.setText(Double.toString(num1-num2));
			if(ae.getSource()==btnMultip)
				lblResul.setText(Double.toString(num1*num2));
			if(ae.getSource()==btnDividir)
				lblResul.setText(Double.toString(num1/num2));
		}
		
	}
}

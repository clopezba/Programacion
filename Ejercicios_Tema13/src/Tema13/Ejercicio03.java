package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio03 {

	private JFrame frmSumarYRestar;
	private JTextField textNum1;
	private JTextField textNum2;
	JLabel lblResul;
	JButton btnSumar;
	JButton btnRestar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03 window = new Ejercicio03();
					window.frmSumarYRestar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio03() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSumarYRestar = new JFrame();
		frmSumarYRestar.setTitle("Sumar y restar reales");
		frmSumarYRestar.setBounds(100, 100, 450, 300);
		frmSumarYRestar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSumarYRestar.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("Num1");
		lblNum1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum1.setBounds(10, 25, 46, 14);
		frmSumarYRestar.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum2.setBounds(10, 60, 46, 14);
		frmSumarYRestar.getContentPane().add(lblNum2);
		
		
		
		textNum1 = new JTextField();
		textNum1.setBounds(64, 22, 65, 20);
		frmSumarYRestar.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setColumns(10);
		textNum2.setBounds(64, 57, 65, 20);
		frmSumarYRestar.getContentPane().add(textNum2);
		
		lblResul = new JLabel("0");
		btnSumar = new JButton("+");
		btnRestar = new JButton("-");
		
		btnSumar.setBounds(25, 104, 54, 23);
		frmSumarYRestar.getContentPane().add(btnSumar);
		
		
		btnRestar.setBounds(101, 104, 54, 23);
		frmSumarYRestar.getContentPane().add(btnRestar);
		btnSumar.addActionListener(new OyenteBoton());
	    btnRestar.addActionListener(new OyenteBoton());
		
		lblResul.setForeground(Color.RED);
		lblResul.setBorder(new LineBorder(SystemColor.inactiveCaption));
		lblResul.setBounds(184, 104, 54, 23);
		frmSumarYRestar.getContentPane().add(lblResul);
	}
	
	class OyenteBoton implements ActionListener {
	public void actionPerformed(ActionEvent ae) {
		double num1 = Double.parseDouble(textNum1.getText());
		double num2 = Double.parseDouble(textNum2.getText());
		
		if(ae.getSource()==btnSumar) {
			double suma = num1 + num2;
			lblResul.setText(Double.toString(suma));
		}
		if(ae.getSource()==btnRestar) {
			double resta = num1 - num2;
			lblResul.setText(Double.toString(resta));
			
		}
	}
	}
}

package Tema13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

public class Ejercicio02 {

	private JFrame frmClculoreaTringulo;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio02 window = new Ejercicio02();
					window.frmClculoreaTringulo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClculoreaTringulo = new JFrame();
		frmClculoreaTringulo.setTitle("C\u00E1lculo \u00E1rea tri\u00E1ngulo");
		frmClculoreaTringulo.setBounds(100, 100, 450, 300);
		frmClculoreaTringulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClculoreaTringulo.getContentPane().setLayout(null);
		JLabel lblResultado = new JLabel();
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(10, 35, 46, 14);
		frmClculoreaTringulo.getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 69, 46, 14);
		frmClculoreaTringulo.getContentPane().add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(66, 32, 86, 20);
		frmClculoreaTringulo.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(66, 66, 86, 20);
		frmClculoreaTringulo.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnArea = new JButton("Area");
		btnArea.setBounds(60, 108, 98, 23);
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			double base = Double.parseDouble(txtBase.getText());
			double altura = Double.parseDouble(txtAltura.getText());
			String area = Double.toString(base*altura/2);
			lblResultado.setText(area);
			lblResultado.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(153, 180, 209)));
			}
		});
		frmClculoreaTringulo.getContentPane().add(btnArea);
		
		
		lblResultado.setBounds(171, 112, 71, 19);
		lblResultado.setEnabled(true);
		lblResultado.setForeground(Color.RED);
		frmClculoreaTringulo.getContentPane().add(lblResultado);
		
	}
}

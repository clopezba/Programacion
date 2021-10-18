package Tema13;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio09 implements ActionListener{

	private JFrame frmEjemploGruposDe;
	private ButtonGroup grupo;
	private JRadioButton rdbLinux, rdbWindows, rdbMacintosh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio09 window = new Ejercicio09();
					window.frmEjemploGruposDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		grupo = new ButtonGroup();
		frmEjemploGruposDe = new JFrame();
		frmEjemploGruposDe.setTitle("Ejemplo grupos de opci\u00F3n");
		frmEjemploGruposDe.setBounds(100, 100, 450, 180);
		frmEjemploGruposDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjemploGruposDe.getContentPane().setLayout(null);
		
		rdbLinux = new JRadioButton("Linux");
		rdbLinux.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbLinux.setBounds(51, 27, 109, 23);
		frmEjemploGruposDe.getContentPane().add(rdbLinux);
		grupo.add(rdbLinux);
		rdbLinux.addActionListener(this);
		
		rdbWindows = new JRadioButton("Windows");
		rdbWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbWindows.setBounds(162, 28, 109, 23);
		frmEjemploGruposDe.getContentPane().add(rdbWindows);
		grupo.add(rdbWindows);
		rdbWindows.addActionListener(this);
		
		rdbMacintosh = new JRadioButton("Macintosh");
		rdbMacintosh.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbMacintosh.setBounds(273, 28, 109, 23);
		frmEjemploGruposDe.getContentPane().add(rdbMacintosh);
		grupo.add(rdbMacintosh);
		rdbMacintosh.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		JRadioButton boton = (JRadioButton) ae.getSource();
		JOptionPane.showMessageDialog(frmEjemploGruposDe, "Elegiste: " + boton.getActionCommand(), "Mensaje", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
}

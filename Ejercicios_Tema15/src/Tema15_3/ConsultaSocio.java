package Tema15_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Tema15_1.Socio;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ConsultaSocio implements ActionListener{

	private JFrame frmBsquedaDeSocios;
	private JTextField txtSocio;
	private JTextField txtNombre;
	private JTextField txtEstatura;
	private JTextField txtEdad;
	private JTextField txtLocalidad;
	private JTextField txtBuscar;
	private JButton btnBuscar, btnAnterior, btnSiguiente;
	private JLabel lblCont;
	private ResultSet rs;
	private static AccesoBdatos bd;
	int filas=0, posicion=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaSocio window = new ConsultaSocio();
					window.frmBsquedaDeSocios.setVisible(true);
					bd = new AccesoBdatos();
					bd.conectar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultaSocio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBsquedaDeSocios = new JFrame();
		frmBsquedaDeSocios.setTitle("B\u00FAsqueda de Socios por localidad");
		frmBsquedaDeSocios.setBounds(100, 100, 521, 320);
		frmBsquedaDeSocios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBsquedaDeSocios.getContentPane().setLayout(null);
		
		JLabel lblSocio = new JLabel("Socio");
		lblSocio.setBounds(12, 27, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblSocio);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 56, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblNombre);
		
		JLabel lblEstatura = new JLabel("Estatura");
		lblEstatura.setBounds(12, 85, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblEstatura);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(12, 114, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblEdad);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(12, 143, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblLocalidad);
		
		txtSocio = new JTextField();
		txtSocio.setForeground(Color.BLACK);
		txtSocio.setEditable(false);
		txtSocio.setBounds(89, 24, 73, 22);
		frmBsquedaDeSocios.getContentPane().add(txtSocio);
		txtSocio.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(89, 53, 240, 22);
		frmBsquedaDeSocios.getContentPane().add(txtNombre);
		
		txtEstatura = new JTextField();
		txtEstatura.setEditable(false);
		txtEstatura.setColumns(10);
		txtEstatura.setBounds(89, 82, 45, 22);
		frmBsquedaDeSocios.getContentPane().add(txtEstatura);
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		txtEdad.setBounds(89, 111, 34, 22);
		frmBsquedaDeSocios.getContentPane().add(txtEdad);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(89, 140, 202, 22);
		frmBsquedaDeSocios.getContentPane().add(txtLocalidad);
		
		JLabel lblCm = new JLabel("cm.");
		lblCm.setBounds(141, 88, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblCm);
		
		JLabel lblAnyos = new JLabel("a\u00F1os");
		lblAnyos.setBounds(129, 117, 65, 16);
		frmBsquedaDeSocios.getContentPane().add(lblAnyos);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(361, 24, 116, 22);
		frmBsquedaDeSocios.getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(371, 59, 97, 25);
		frmBsquedaDeSocios.getContentPane().add(btnBuscar);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setEnabled(false);
		btnAnterior.setBounds(129, 215, 97, 25);
		frmBsquedaDeSocios.getContentPane().add(btnAnterior);
		btnAnterior.addActionListener(this);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(273, 215, 97, 25);
		frmBsquedaDeSocios.getContentPane().add(btnSiguiente);
		btnSiguiente.addActionListener(this);
		
		lblCont = new JLabel("");
		lblCont.setBounds(167, 180, 162, 22);
		frmBsquedaDeSocios.getContentPane().add(lblCont);
	}
	public void actionPerformed(ActionEvent ae) {
		
		try {
			String local = txtBuscar.getText().trim();
			if(ae.getSource()==btnBuscar) {
				rs = bd.consultaPorLocalidad(local);
					rs.last();
					filas = rs.getRow();
				
				if(filas>0) {
					btnAnterior.setEnabled(true);
					btnSiguiente.setEnabled(true);
					rs.first();
					posicion=1;
					Socio s= new Socio();
					s.setSocioID(rs.getInt(1));
					txtSocio.setText(Integer.toString(s.getSocioID())); 
					s.setNombre(rs.getString(2));
					txtNombre.setText(s.getNombre());
					s.setEstatura(rs.getInt(3));
					txtEstatura.setText(Integer.toString(s.getEstatura()));
					s.setEdad(rs.getInt(4));
					txtEdad.setText(Integer.toString(s.getEdad()));
					s.setLocalidad(rs.getString(5));
					txtLocalidad.setText(s.getLocalidad());
					lblCont.setText("Socio 1 de " + filas);
				}
				else {
					btnAnterior.setEnabled(false);
					btnSiguiente.setEnabled(false);
					txtSocio.setText("");
					txtNombre.setText("");
					txtEstatura.setText("");
					txtEdad.setText("");
					txtLocalidad.setText("");
					lblCont.setText("");
					JOptionPane.showMessageDialog(frmBsquedaDeSocios, 
							"No se encontraron socios de " + local, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if(ae.getSource()==btnAnterior) {
				if(rs.getRow()==1)
					JOptionPane.showMessageDialog(frmBsquedaDeSocios, "No existen registros anteriores",
							"Primer Socio", JOptionPane.INFORMATION_MESSAGE);
				else {
					posicion--;
					rs.absolute(posicion);
					Socio s= new Socio();
					s.setSocioID(rs.getInt(1));
					txtSocio.setText(Integer.toString(s.getSocioID())); 
					s.setNombre(rs.getString(2));
					txtNombre.setText(s.getNombre());
					s.setEstatura(rs.getInt(3));
					txtEstatura.setText(Integer.toString(s.getEstatura()));
					s.setEdad(rs.getInt(4));
					txtEdad.setText(Integer.toString(s.getEdad()));
					s.setLocalidad(rs.getString(5));
					txtLocalidad.setText(s.getLocalidad());
					lblCont.setText("Socio "+ posicion+ " de " + filas);
				}
			}
			if(ae.getSource()==btnSiguiente) {
				if(rs.getRow()==filas)
					JOptionPane.showMessageDialog(frmBsquedaDeSocios, "No existen registros posteriores",
							"Último Socio", JOptionPane.INFORMATION_MESSAGE);
				else {
					posicion++;
					rs.absolute(posicion);
					Socio s= new Socio();
					s.setSocioID(rs.getInt(1));
					txtSocio.setText(Integer.toString(s.getSocioID())); 
					s.setNombre(rs.getString(2));
					txtNombre.setText(s.getNombre());
					s.setEstatura(rs.getInt(3));
					txtEstatura.setText(Integer.toString(s.getEstatura()));
					s.setEdad(rs.getInt(4));
					txtEdad.setText(Integer.toString(s.getEdad()));
					s.setLocalidad(rs.getString(5));
					txtLocalidad.setText(s.getLocalidad());
					lblCont.setText("Socio "+ posicion+ " de " + filas);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}

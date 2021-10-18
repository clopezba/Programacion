package Sesion7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Controlador implements ActionListener, MouseListener{

	private Vista vista;
	AccesoBDatos abd = new AccesoBDatos();
	
	
	Controlador(Vista vista) throws ClassNotFoundException, SQLException {
		this.vista = vista;
		abd.conectar();
		cargarTabla();
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String comando = ae.getActionCommand();
		int socioID = Integer.parseInt(this.vista.txtID.getText());
		String nombre = this.vista.txtNombre.getText();
		int estatura = Integer.parseInt(this.vista.txtEstatura.getText());
		int edad = Integer.parseInt(this.vista.txtEdad.getText());
		String localidad = this.vista.txtLocalidad.getText();
		
		
		switch(comando) {
			case "AÑADIR":
				try {
					abd.añadirSocio(socioID, nombre, estatura, edad, localidad);
				} catch (SQLException e) {
					System.err.println("Error en la inserción");
					System.out.println(e.getMessage());
				}
				break;
			
			case "BORRAR":
					int filaPulsada = this.vista.table.getSelectedRow();
				try {	
					if(filaPulsada >= 0) {
						int socio = (int) this.vista.table.getValueAt(filaPulsada, 0);
						
						abd.borrarSocio(socio);
					}
				} catch (SQLException e) {
					System.err.println("Error al borrar la fila");
					System.out.println(e.getMessage());
				}
				break;
			
			case "EDITAR":
				filaPulsada = this.vista.table.getSelectedRow();
				if(filaPulsada >=0) {
					int socio = (int) this.vista.table.getValueAt(filaPulsada, 0);
					try {
						abd.editarSocio(socio, nombre, estatura, edad, localidad);
					} catch (SQLException e) {
						System.err.println("Error al editar el registro");
						System.out.println(e.getMessage());
					}
				}
				break;
				
			default:
				System.err.println("Comando no definido");		
		}
		limpia();
		cargarTabla();
	}
	private void limpia(){
        vista.txtID.setText("");
		vista.txtNombre.setText("");
        vista.txtEstatura.setText("");
        vista.txtEdad.setText("");
        vista.txtLocalidad.setText("");
	}
	protected void cargarTabla() {
		ResultSet resultado;
		
		Vector<Object> fila;
		
		for(int i=this.vista.dtm.getRowCount(); i>0; i--) {
			vista.dtm.removeRow(i-1);
		}
		try {
			resultado = abd.mostrarSocios();
			
			while(resultado.next()) {
				fila = new Vector<Object>();
				fila.add(resultado.getInt(1));
				fila.add(resultado.getString(2));
				fila.add(resultado.getInt(3));
				fila.add(resultado.getInt(4));
				fila.add(resultado.getString(5));
				
				this.vista.dtm.addRow(fila);
			}
		} catch (SQLException e) {
			System.out.println("Error al cargar datos");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		ResultSet res;
		int filaPulsada = this.vista.table.getSelectedRow();
		
		if(filaPulsada >=0) {
			int id = (int) this.vista.dtm.getValueAt(filaPulsada, 0);
			try {
				res = abd.mostrarSocio(id);
				if(res.next()) {
					vista.txtID.setText(String.valueOf(res.getInt(1)));
					vista.txtNombre.setText(res.getString(2));
					vista.txtEstatura.setText(String.valueOf(res.getInt(3)));
					vista.txtEdad.setText(String.valueOf(res.getInt(4)));
					vista.txtLocalidad.setText(res.getString(5));
				}
			} catch (SQLException e) {
				System.out.println("Error al cargar el cliente");
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}

}

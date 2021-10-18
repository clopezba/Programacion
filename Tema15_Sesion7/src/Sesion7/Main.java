package Sesion7;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		new AccesoBDatos();
		
		Vista vista = new Vista();
		
		Controlador control = new Controlador(vista);
		
		vista.conectarControlador(control);

	}

}

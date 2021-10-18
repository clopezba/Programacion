package Tema15_1;

import java.sql.SQLException;

public class MainSocios {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos bd = new AccesoBdatos();
		
		bd.conectar();
		
		bd.consultaPorLocalidad("");
		
	}

}

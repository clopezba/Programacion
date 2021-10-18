package Tema15_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListaSociosBaloncesto {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "baloncesto";
    private static String hostname = "localhost";
    private static String port = "3306";
	// private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=CET";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
		
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM socio");
		System.out.println("LISTA DE SOCIOS");
		System.out.println("===============");
		
		int cont= 0;
		while (rs.next()) {
			int socioID = rs.getInt(1);
			String nombre = rs.getString(2);
			int estatura = rs.getInt(3);
			int edad = rs.getInt(4);
			String localidad = rs.getString(5);
			System.out.println("Id: " + socioID + "| Nombre: " + nombre + "| Estatura: " 
			+ estatura + " cm. | Edad: " + edad + " años | Localidad: " + localidad);
			cont++;
		}
		System.out.println("______________________________________________________________________________");
		System.out.println("Total de Socios: " + cont);
		rs.close();
		stmt.close();		
		conn.close();
	}

}

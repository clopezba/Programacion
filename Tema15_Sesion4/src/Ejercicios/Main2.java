package Ejercicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "pedidos";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce número de categoría: ");
		int cat = s.nextInt();
		s.close();
		CallableStatement call = conn.prepareCall("CALL productosCategoriaBajoMinimos(?)");
		call.setInt(1, cat);
		
		ResultSet rs = call.executeQuery();
		
		if(rs.next()) {
		System.out.println("Nombre Producto  - Precio - Existencias - Mínimo");
		System.out.println("------------------------------------------------");
		System.out.println(rs.getString(1) + " | " + rs.getDouble(2) + " | " + rs.getInt(3)
		+ " | " + rs.getInt(4));
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getDouble(2) + " | " + rs.getInt(3)
				+ " | " + rs.getInt(4));
			}
		}
		else
			System.out.println("La categoria: " + cat + " no existe o no tiene productos bajo mínimos");
	
		rs.close();
		call.close();
		conn.close();
	}
		
}

package Ejercicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main1 {

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
		
		System.out.println("Introduce número de pedido: ");
		Scanner s = new Scanner(System.in);
		int pedido = s.nextInt();
		s.close();
		
		CallableStatement importe = conn.prepareCall("Select importePedido(?)");
		importe.setInt(1, pedido);
		
		
		ResultSet rs = importe.executeQuery();
		
		if(rs.next()) {
			System.out.println("El importe total del pedido " + pedido +" es: " + rs.getDouble(1));
		}
		
		rs.close();
		importe.close();
		conn.close();
	}

}

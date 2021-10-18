package Tema15_1;

import java.sql.*;


public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	
	
	public Connection conecta;
	
	//Conectar
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conecta=DriverManager.getConnection(url, username, password);
			
	}
	//Consulta por localidad
	public void consultaPorLocalidad(String localidad) throws SQLException {
		Statement consulta = conecta.createStatement();
		ResultSet rs = consulta.executeQuery("SELECT * FROM socio WHERE localidad LIKE '%" + localidad + "%'");
		imprimirDatos(rs);
		}
	
	//Imprimir datos
	public void imprimirDatos(ResultSet r) throws SQLException {
		Socio socio = new Socio();
		int cont = 0; 
		while (r.next()) {
		
			socio.setSocioID(r.getInt(1));
			socio.setNombre(r.getString(2));
			socio.setEstatura(r.getInt(3));
			socio.setEdad(r.getInt(4));
			socio.setLocalidad(r.getString(5));
			cont++;
			System.out.println(socio.toString());
			
		}
		System.out.println("Número de filas: " + cont);
		
	}
	
	//Desconectar
	public void desconectar() throws SQLException {
		if( conecta != null)
			conecta.close();
	}
	
}

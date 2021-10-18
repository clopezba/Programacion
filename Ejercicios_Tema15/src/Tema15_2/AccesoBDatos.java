package Tema15_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	
	public Connection conecta;
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public boolean clave(String usuario, String contrasenya) throws SQLException {
		PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM usuario WHERE username =? AND password=?");
		consulta.setString(1, usuario);
		consulta.setString(2, contrasenya);
		ResultSet rs = consulta.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
	}
	public String dameNombre(String usuario) throws SQLException {
		Statement cons = conecta.createStatement();
		ResultSet res = cons.executeQuery("SELECT nombre FROM usuario WHERE username='" + usuario + "'");
		String nom;
		if(res.next())
			nom = res.getString("nombre");
		else
			nom=null;
		return nom;
	}
	
	
	
	public void desconectar() throws SQLException {
		if(conecta!=null)
			conecta.close();
	}

}

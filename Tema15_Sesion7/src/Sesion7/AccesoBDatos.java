package Sesion7;

import java.sql.*;

import javax.swing.JOptionPane;



public class AccesoBDatos {
	protected static String driver = "com.mysql.cj.jdbc.Driver";
	protected static String database = "baloncesto";
	protected static String hostname = "localhost";
	protected static String port = "3306";
	protected static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	protected static String username = "root";
	protected static String password = "root";
	
	
	public Connection conecta;
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conecta=DriverManager.getConnection(url, username, password);
	}
	public void desconectar() throws SQLException {
		if(conecta!=null)
		conecta.close();
	}
	public boolean comprobarID(int id) throws SQLException {
		PreparedStatement pre = conecta.prepareStatement("SELECT nombre FROM socio WHERE socioID=?");
		pre.setInt(1, id);
		ResultSet rs = pre.executeQuery();
		if(rs.next()) {
			JOptionPane.showMessageDialog(null, "Ya existe un socio con ese ID");
			return false;
		}
		else
			return true;
				
	}
	
	public void añadirSocio(int socioId, String nombre, int estatura, int edad, String localidad) throws SQLException {
		if(comprobarID(socioId)) {
			PreparedStatement prep = conecta.prepareStatement("INSERT INTO socio VALUES "
					+ "(?,?,?,?,?)");
			prep.setInt(1, socioId);
			prep.setString(2, nombre);
			prep.setInt(3, estatura);
			prep.setInt(4, edad);
			prep.setString(5, localidad);
			prep.executeUpdate();
		}
		
	}
	
	public void borrarSocio(int socioID) throws SQLException {
		PreparedStatement pre = conecta.prepareStatement("DELETE FROM socio WHERE socioID=?");
		pre.setInt(1, socioID);
		pre.executeUpdate();
	
	}
	
	public void editarSocio(int socioID, String nombre, int estatura, int edad, String localidad) throws SQLException {
		PreparedStatement pre= conecta.prepareStatement("UPDATE socio SET nombre=?,"
				+ "estatura=?, edad=?, localidad=? WHERE socioID=?");
		pre.setInt(5, socioID);
		pre.setString(1, nombre);
		pre.setInt(2, estatura);
		pre.setInt(3, edad);
		pre.setString(4, localidad);
		pre.executeUpdate();
	}
	public ResultSet mostrarSocios() throws SQLException {
		PreparedStatement pre = conecta.prepareStatement("SELECT * FROM socio");
		ResultSet rs = pre.executeQuery();
		return rs;
		
	}
	public ResultSet mostrarSocio(int id) throws SQLException {
		PreparedStatement pre = conecta.prepareStatement("SELECT * FROM socio WHERE socioID=?");
		pre.setInt(1, id);
		ResultSet rs = pre.executeQuery();
		return rs;
		
	}
	
}

package ejercicios;
//// https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/DatabaseMetaData.html

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

// Alberto Carrera Martín - Abril 2020


public class AccesoBdatos {

	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "empleados";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";

    private Connection conecta;
    private DatabaseMetaData metadata;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
		metadata = conecta.getMetaData();
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		
		conecta = null; // = conecta.close();
	}
	
	public  void infoGeneralMetadata() throws SQLException {
		
		String mensaje= "Gestor de base de datos: " + metadata.getDatabaseProductName() + "\n" 
				+"Versión instalada: "+ metadata.getDatabaseProductVersion() + "\n" 
        		+ "Usuario conectado: " + metadata.getUserName() + "\n"
        		+ "Tipo de driver JDBC: " + metadata.getDriverName() + "\n"
        		+ "Versiones JDBC soportadas: " +metadata.getJDBCMinorVersion() +" a " + metadata.getJDBCMajorVersion() + "\n"
        		+ "Versión del Driver: " + metadata.getDriverVersion();

		JOptionPane.showMessageDialog(null,  mensaje, "Información del SGBD", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public  void tablasMetadata(String catalogo) throws SQLException {
		String mensaje = "";
		String tablaTipos[] = {"TABLE", "VIEW"};
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje +  "Nombre: " +	rs.getString("TABLE_NAME") + " - "
							  + "Tipo : " + rs.getString("TABLE_TYPE") + "\n";
		}
		JOptionPane.showMessageDialog(null,  mensaje, "Tablas de la Bda " + catalogo, 
													JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public  void tablasMetadataMejorado(String catalogo) throws SQLException {
		String mensaje = "";
		if (!existeCatalogo(catalogo)) {
			mensaje = " No existe el catálogo: " + catalogo;
			JOptionPane.showMessageDialog(null,  mensaje, catalogo + " no encontrado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(-1);
		}
		String tablaTipos[] = {"TABLE", "VIEW"};
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje +  "Nombre: " +	rs.getString("TABLE_NAME") + " - "
							  + "Tipo : " + rs.getString("TABLE_TYPE") + "\n";
		}
		JOptionPane.showMessageDialog(null,  mensaje, "Tablas de la Bda " + catalogo, JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public boolean existeCatalogo (String catalogo) throws SQLException {
		boolean encontrado = false;
		ResultSet rs = metadata.getCatalogs();
		
		while (rs.next()) {
			if (rs.getString("TABLE_CAT").equalsIgnoreCase(catalogo)){
				encontrado =true;
				break;
			}
		}
		return encontrado;
	}
	
	public void columnasMetadata(String catalogo, String tabla) throws SQLException {
		String mensaje="";
		String tablaTipos [] = {"TABLE", "VIEW"};
		ResultSet rs = metadata.getColumns(catalogo, null, tabla, null);
		while(rs.next()) {
			mensaje = mensaje + "Nombre: " + rs.getString(4) + " - Tipo: " + rs.getString(6) 
			+ " - Tamaño: " + rs.getInt(7) + " - Admite nulos: " + rs.getString(18) + "\n" ;
		}
				
		String error="No existe la BD " + catalogo + " o la tabla " + tabla;
		if(mensaje.isEmpty()) {
			JOptionPane.showMessageDialog(null, error, "Columnas de la tabla " + tabla + " de la BD " + catalogo, JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			mensaje+="------------------------------------------------------------------\n";
			ResultSet res =  metadata.getPrimaryKeys(catalogo, null, tabla); 
			String clavePrimaria="Clave primaria: ";
			while(res.next())
			clavePrimaria += res.getString("COLUMN_NAME")+" ";
			mensaje+=clavePrimaria;
			JOptionPane.showMessageDialog(null, mensaje, "Columnas de la tabla " + tabla + " de la BD " + catalogo, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
}
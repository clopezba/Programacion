package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	
	
	public Connection conecta;
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conecta=DriverManager.getConnection(url, username, password);
	}
	public void desconectar() throws SQLException {
		if(conecta!=null)
			conecta.close();
	}
	
	public Empleado busquedaPorCodigo(int numero) throws SQLException {
		Empleado emp = new Empleado();
		PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM emp WHERE empno=?");
		consulta.setInt(1, numero);
		ResultSet rs = consulta.executeQuery();
		
		if(rs.next()) {
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setMgr(rs.getInt(4));
			emp.setHiredate(rs.getDate(5));
			emp.setSal(rs.getDouble(6));
			emp.setComm(rs.getDouble(7));
			emp.setDeptno(rs.getInt(8));
		}
		else
			emp=null;
		
		return emp;
	}
	
	public ArrayList<Empleado> busquedaPorOficio(String oficio) throws SQLException{
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		PreparedStatement cons = conecta.prepareStatement("SELECT * FROM emp WHERE job=?");
		cons.setString(1, oficio);
		ResultSet rs = cons.executeQuery();
		
		while(rs.next()) {
			Empleado emp = new Empleado();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setMgr(rs.getInt(4));
			emp.setHiredate(rs.getDate(5));
			emp.setSal(rs.getDouble(6));
			emp.setComm(rs.getDouble(7));
			emp.setDeptno(rs.getInt(8));
			lista.add(emp);
		}
		return lista;
	}
	
	public ArrayList<Empleado> busquedaPorAntiguedad(java.sql.Date fecha) throws SQLException{
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		PreparedStatement cons = conecta.prepareStatement("SELECT * FROM emp WHERE hiredate<=?");
		cons.setDate(1, fecha);
		ResultSet rs = cons.executeQuery();
		
		while(rs.next()) {
			Empleado emp = new Empleado();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setMgr(rs.getInt(4));
			emp.setHiredate(rs.getDate(5));
			emp.setSal(rs.getDouble(6));
			emp.setComm(rs.getDouble(7));
			emp.setDeptno(rs.getInt(8));
			lista.add(emp);
			
		}
		return lista;
	}
	public int insertarConBean(Empleado emp) {
		int resultado=0;
		try {
			PreparedStatement cons = conecta.prepareStatement("INSERT INTO emp VALUES (?,?,?,?,?,?,?,?)");
			cons.setInt(1, emp.getEmpno());
			cons.setString(2, emp.getEname());
			cons.setString(3, emp.getJob());
			cons.setInt(4, emp.getMgr());
			cons.setDate(5, emp.getHiredate());
			cons.setDouble(6, emp.getSal());
			cons.setDouble(7, emp.getComm());
			cons.setInt(8, emp.getDeptno());
			resultado = cons.executeUpdate();
		} catch (SQLException e) {
			System.out.print("Error ");
			resultado = e.getErrorCode();
		}
		return resultado;
	}
	public int actualizarSalario(int departamento, double porcentaje) throws SQLException {
		PreparedStatement consulta = conecta.prepareStatement("UPDATE emp "
				+ "SET sal=sal+sal*? WHERE deptno=?");
		consulta.setDouble(1, porcentaje);
		consulta.setInt(2, departamento);
			
		return consulta.executeUpdate();
	}
	public int actualizarSalarioTransacciones(int departamento, double porcentaje) throws SQLException {
		int resul=0;
		
		conecta.setAutoCommit(false);
		PreparedStatement salario = conecta.prepareStatement("UPDATE emp SET sal = sal+sal*? WHERE deptno=?");
		salario.setDouble(1, porcentaje);
		salario.setInt(2, departamento);
		resul = salario.executeUpdate();
		conecta.commit();
		
		return resul;
		
	}
	
	public int borrarEmpleado(int numero) {
		int filas=0;
		try {
			PreparedStatement borrar = conecta.prepareStatement("DELETE FROM emp WHERE empno=?");
			borrar.setInt(1, numero);
			filas = borrar.executeUpdate();
		
		} catch (SQLException e) {
			filas=e.getErrorCode();
		}
		return filas;
	}

}

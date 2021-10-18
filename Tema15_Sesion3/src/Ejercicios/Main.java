package Ejercicios;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBDatos abd = new AccesoBDatos();
		abd.conectar();
		
		System.out.println("Buscar por código:");
		System.out.println(abd.busquedaPorCodigo(100));
		System.out.println(abd.busquedaPorCodigo(7788));

		System.out.println("Buscar por oficio:");
		System.out.println(abd.busquedaPorOficio("Profesor"));
		System.out.println(abd.busquedaPorOficio("CLERK"));
		
		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
		System.out.println("=====================================================");
		java.util.Date fecha = null;
		java.sql.Date sqlFecha = null;
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha= sdf.parse("1981/02/22");
			sqlFecha = new java.sql.Date(fecha.getTime());
		} catch (ParseException e) {
			System.out.println("Error al convertir fecha");
		}
		System.out.println(abd.busquedaPorAntiguedad(sqlFecha));
		
		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, sqlFecha, 700.0, 0, 20);
		//System.out.println(abd.insertarConBean(e1));
		
		//Empleado e1 = new Empleado(10, "CARRERA", "FOL", 7788, sqlFecha, 700, 0, 35);
		//g. No hay ningún departamento 35. Devuelve el error 1452.
		
		//h. indicar las columnas a las que se aplicará
		
		
		/*System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(abd.actualizarSalario(30, 0.20));
		System.out.println("Subir un 15% el salario de los empleados del Departamento 44");
		System.out.println(abd.actualizarSalario(44, 0.15));
		
		*/System.out.println(abd.borrarEmpleado(1));
		System.out.println(abd.borrarEmpleado(99));
		System.out.println(abd.borrarEmpleado(7839));
		
		//k. Porque no es foreign key de empno
		//System.out.println(abd.actualizarSalarioTransacciones(10, 0.10));
	}

}

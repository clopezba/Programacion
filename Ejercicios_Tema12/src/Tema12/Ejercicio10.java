package Tema12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio10 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
	
		int opcion;
			
		do {
			System.out.println("\nMENÚ");
			System.out.println("-----------------------");
			System.out.println("1. Introducir datos cliente");
			System.out.println("2. Visualizar datos clientes");
			System.out.println("3. Salir");
			
			opcion = s.nextInt();
			s.nextLine();
			
			switch(opcion) {
			case 1:
				almacenar();
				break;
			case 2: 
				recuperar();
			}
		}while (opcion== 1 || opcion==2);
		
	}
	public static Cliente introducirDatos() {
		
		System.out.println("Nombre: ");
		String nombre= s.nextLine();
		System.out.println("Teléfono: ");
		String telefono = s.nextLine();
		System.out.println("Dirección: ");
		String direccion = s.nextLine();
		System.out.println("NIF: ");
		String nif = s.next();
		System.out.println("¿Debe dinero? (true/false)");
		boolean moroso = s.nextBoolean();
		
		Cliente c = new Cliente(nombre, telefono, direccion, nif, moroso);
		
		return c;
	}
	
	public static void almacenar() {
		FileOutputStream archivo = null;
		ObjectOutputStream obj = null;
		
		try {
			archivo = new FileOutputStream("Ficheros\\ventas.dat");
			obj = new ObjectOutputStream(archivo);
			
			System.out.println("Introduzca los datos del cliente: ");
			obj.writeObject(introducirDatos());
			System.out.println("¿Desea introducir más clientes? s/n");
			String opt = s.next();
			s.nextLine();
			while(opt.equals("s")) {
				switch(opt) {
				case "s":
					obj.writeObject(introducirDatos());
					break;
				}
				System.out.println("¿Desea introducir más clientes? s/n");
				opt=s.next();
				s.nextLine();
			}
			obj.close();
		} 
		catch (IOException e) {System.out.println("Ocurrió un error");}
	}
	
	public static void recuperar() {
		FileInputStream archLec = null;
		ObjectInputStream objLec = null;
		
		try {
			archLec = new FileInputStream("Ficheros\\ventas.dat");
			objLec = new ObjectInputStream(archLec);
			
			System.out.println("Datos de los clientes: ");
			while(objLec!=null) {
			Cliente c = (Cliente)objLec.readObject();
			System.out.println("\nNombre: " + c.getNombre() + "\nTelefono: " + c.getTelefono()
			+ "\nDirección: " + c.getDireccion() + "\nNIF: " + c.getNif() + "\nMoroso: " + c.isMoroso());
			}
			objLec.close();
		} catch (EOFException eof) {}
		catch (IOException e) {System.out.println("Ocurrió un error");} 
			catch (ClassNotFoundException e) {	}
		
		
		
	}
}

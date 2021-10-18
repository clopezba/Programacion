package Tema12;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) {
		String directorio;
		if(args.length>0) 
			directorio = args[0];
		else
			directorio = ".";
		
		File direct = new File(directorio);
		try {
			System.out.println("El directorio es: " + direct.getCanonicalPath());
				
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}
		File[] listado = direct.listFiles();
		for(File archivo: listado) 
			System.out.println(archivo.getName());
			
	}
}

package Tema12;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Recibe cadena de caracteres (en args) y guarda en fichero (en args) del revés
		FileWriter salida = null;
		
		if(args.length!=2) {
			System.out.println("No has mandado todos los argumentos");
			System.exit(-1);
		}
		try {
			salida = new FileWriter(args[1]);
			String cadena = args[0];
			for (int i = args[0].length()-1; i >=0; i--) {
				salida.write(cadena.charAt(i));
			}
			salida.close();
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}
	}

}

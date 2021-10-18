package Tema12;

import java.io.IOException;
import java.io.FileReader;

public class Ejercicio4 {

	public static void main(String[] args) {
				
		if(args.length!=1) {
			System.out.println("No has introducido un fichero");
			System.exit(-1);
		}
		FileReader origen = null;
		try {
			origen = new FileReader(args[0]);
			//Guardar caracteres en una cadena
			int aux=origen.read();
			String cadena = "";
			while(aux!=-1) {
				cadena += (char)aux;
				aux=origen.read();
			}
			//Separar la cadena en palabras
			String cad [] = cadena.split(" ");
			//Juntar palabras en cadena, sin espacios
			for (int i = 0; i < cad.length; i++)
				System.out.print(cad[i]);
			
			origen.close();
			} 
		
		catch (IOException e) {System.out.println("Ocurrió un error");}
	}

}

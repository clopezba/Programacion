package Tema12;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("No hay ningún fichero");
			System.exit(-1);
		}
		FileReader doc = null;
		int cont=0;
		try {
			doc = new FileReader(args[0]);
			int i= doc.read();
			while(i!=-1) {
				if (esVocal((char)i))
					cont++;
				i=doc.read();
			}
			System.out.println("Número de vocales en el texto:" + cont);
						
			doc.close();	
		}
		catch(IOException exc) {
			System.out.println("Ocurrió un error");
		}
		

	}
	//Método para comprobar si el caracter es una vocal
	private static boolean esVocal(char c) {
		if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O'|| c=='u' || c=='U')
			return true;
		else 
			return false;
	}
	
}

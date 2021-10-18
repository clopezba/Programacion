package Tema12;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.FileReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ej 3 -- concatenar en una cadena  
		//y conocer las palabras con StringTokenizer (o contar espacios)
		if(args.length != 1) {
			System.out.println("No has introducido ningún fichero");
			System.exit(-1);
		}
		FileReader origen = null;
		
		//Contando espacios:
		try {
			origen = new FileReader(args[0]);
			int aux=origen.read(), cont=1;
			while(aux!=-1) {
				if(aux == 32)
					cont++;
				aux=origen.read();
			}
			System.out.println("Número de palabras: " + cont);
			origen.close();
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}
		
		
		//Concatenando caracteres y contando con StringTokenizer
		try {
			origen = new FileReader(args[0]);
			String cadena= "";
			int aux=origen.read();
			while(aux!=-1) {
				cadena += (char)aux;
				aux=origen.read();
			}
			int cont=0;
			StringTokenizer st = new StringTokenizer(cadena);
			while(st.hasMoreTokens()) {
				st.nextToken();
				cont++;
			}
			System.out.println("Número de palabras: " + cont);
			origen.close();
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}
	}

}

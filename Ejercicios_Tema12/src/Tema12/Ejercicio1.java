package Tema12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		try {
			BufferedReader bufer = new BufferedReader(new FileReader("Ficheros\\Numeros.txt"));
			double sum=0;
			int cont = 0;
			String aux;
			while((aux = bufer.readLine())!= null) {
				sum += Double.parseDouble(aux);
				cont++;
			}
			System.out.println("Suma = " + sum);
			System.out.println("Media = " + sum/cont);
		
		
			bufer.close();
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}
			

	}

}

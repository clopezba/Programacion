package Tema12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio6 {

	public static void main(String[] args) {
		try {
			BufferedReader bufer = new BufferedReader(new FileReader("Ficheros\\Texto.txt"));
			BufferedWriter bufsalida = new BufferedWriter(new FileWriter("Ficheros\\Mayusculas.txt"));
			String aux;
			while((aux=bufer.readLine())!= null) {
				bufsalida.write(aux.toUpperCase());
				bufsalida.newLine();
			}
			
			bufsalida.close();
			bufer.close();
		} catch (IOException e) {
			System.out.println("Ocurrió un error");
		}

	}

}

package Tema12;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		int cont=0;
		double max= 0, min=50, suma=0;
		double temperat;
		FileInputStream fichero = null;
		DataInputStream temp = null;
		
		try {
			fichero = new FileInputStream("Ficheros\\Temperaturas.dat");
			temp = new DataInputStream(fichero);
			
			System.out.println("Fecha: " + temp.readUTF());
			while(true) {
				System.out.print("Hora: " + temp.readInt() + " ");
				temperat = temp.readDouble();
				suma += temperat;
				if(temperat>= max)
					max=temperat;
				if(temperat<=min)
					min=temperat;
				cont++;
				System.out.printf("Temperatura: " + "%2.2f\n", temperat);
				}
				
		} catch (FileNotFoundException e) {
			System.out.println("Ocurrió un error");
		}catch(EOFException end) {
			temp.close();
		}
		System.out.printf("Temperatura máxima: " + "%2.2f\n", max);
		System.out.printf("Temperatura mínima: " + "%2.2f\n", min);
		System.out.printf("Media: " + "%2.2f\n", suma/cont);
	
	}
}

package Tema3Previo_Ejemplos;

import java.util.Scanner;
/*
 * T�pico ejemplo de lectura de una secuencia de datos
 * Leer car�cter
 * Mientras no sea el final de la secuencia (no se escriba *)
 * 		Tratar el car�cter (contarlo seg�n sea n�mero, letra min�scula....
 * 		Leer car�cter
 * FinMientras
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cuentaNumeros=0, cuentaMayusculas=0, cuentaMinusculas=0;
		System.out.print("Introduce un car�cter: (finaliza con *) --> ");
		char c = (char)s.nextLine().charAt(0);
		int codigoAscii = (int)c;
		while (c!= '*') { // Tambi�n valdr�a poner como condici�n: (codigoAscii !=42) �No?
				if (codigoAscii >=48 && codigoAscii <=57) // se trata de un n�mero
						cuentaNumeros++;
				else
					if (codigoAscii >=65 && codigoAscii <=90)// Letra may�cula - ver tabla ASCII
							cuentaMayusculas++;
					else
						if (codigoAscii >=97 && codigoAscii <=122)// Letra min�scula
								cuentaMinusculas++;
			// La instrucci�n anterior if...else...if...
			//se pod�a haber codificado con 3 instrucciones If... independientes
			// La letra � "no la pilla"
			//
			System.out.print("Introduce un car�cter: (finaliza con * --> ");
			c = (char)s.nextLine().charAt(0);
			codigoAscii = (int)c;
		}// del while
		
		System.out.println("Total de caracteres");
		System.out.println("====================");
		System.out.println("N�meros: " + cuentaNumeros);
		System.out.println("Letras may�sculas: "+ cuentaMayusculas);
		System.out.println("Letras nin�sculas: "+ cuentaMinusculas);
		s.close();
	}
	
}

package Tema3Previo_Ejemplos;

import java.util.Scanner;
/*
 * Típico ejemplo de lectura de una secuencia de datos
 * Leer carácter
 * Mientras no sea el final de la secuencia (no se escriba *)
 * 		Tratar el carácter (contarlo según sea número, letra minúscula....
 * 		Leer carácter
 * FinMientras
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cuentaNumeros=0, cuentaMayusculas=0, cuentaMinusculas=0;
		System.out.print("Introduce un carácter: (finaliza con *) --> ");
		char c = (char)s.nextLine().charAt(0);
		int codigoAscii = (int)c;
		while (c!= '*') { // También valdría poner como condición: (codigoAscii !=42) ¿No?
				if (codigoAscii >=48 && codigoAscii <=57) // se trata de un número
						cuentaNumeros++;
				else
					if (codigoAscii >=65 && codigoAscii <=90)// Letra mayúcula - ver tabla ASCII
							cuentaMayusculas++;
					else
						if (codigoAscii >=97 && codigoAscii <=122)// Letra minúscula
								cuentaMinusculas++;
			// La instrucción anterior if...else...if...
			//se podía haber codificado con 3 instrucciones If... independientes
			// La letra ñ "no la pilla"
			//
			System.out.print("Introduce un carácter: (finaliza con * --> ");
			c = (char)s.nextLine().charAt(0);
			codigoAscii = (int)c;
		}// del while
		
		System.out.println("Total de caracteres");
		System.out.println("====================");
		System.out.println("Números: " + cuentaNumeros);
		System.out.println("Letras mayúsculas: "+ cuentaMayusculas);
		System.out.println("Letras ninúsculas: "+ cuentaMinusculas);
		s.close();
	}
	
}

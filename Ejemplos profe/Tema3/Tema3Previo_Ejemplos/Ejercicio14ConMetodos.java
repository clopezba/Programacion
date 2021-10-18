package Tema3Previo_Ejemplos;

import java.util.Scanner;

public class Ejercicio14ConMetodos {
	
	//M�todo leer para leer caracteres del teclado. Se lee el car�cter y se devuelve (int) su c�digo ASCII
	// No tiene argumentos (datos) de entrada
	
	public static int leer() { 
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un car�cter: (finaliza con *) --> ");
		char c = (char)s.nextLine().charAt(0);
		int codigoAscii = (int)c;
		return codigoAscii;
	}
	//
	//
	
	public static void main(String[] args) {
		int cuentaNumeros=0, cuentaMayusculas=0, cuentaMinusculas=0;
		int codigoCaracter;
		codigoCaracter= leer();
		while (codigoCaracter!= 42) { 
				if (codigoCaracter >=48 && codigoCaracter <=57) 
						cuentaNumeros++;
				else
					if (codigoCaracter >=65 && codigoCaracter <=90)
						cuentaMayusculas++;
					else
						if (codigoCaracter >=97 && codigoCaracter <=122)
							cuentaMinusculas++;
				codigoCaracter= leer();
		} // del while
		
		System.out.println("Total de caracteres");
		System.out.println("====================");
		System.out.println("N�meros: " + cuentaNumeros);
		System.out.println("Letras may�sculas: "+ cuentaMayusculas);
		System.out.println("Letras nin�sculas: "+ cuentaMinusculas);
	}
	
}

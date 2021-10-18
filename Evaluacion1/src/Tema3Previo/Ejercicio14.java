package Tema3Previo;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int codAscii, num = 0, mayus= 0, minus=0;
		char c; 
		System.out.println("Introduce un caracter (para terminar por un *): ");
		c = (char) s.nextLine().charAt(0);
		
		while (c != '*') {
			codAscii = (int) c;
			if (codAscii >= 48 && codAscii <= 57)
				num++;
			else if (codAscii >= 65 && codAscii <= 90)
				mayus++;
			else if (codAscii >= 97 && codAscii <= 122)
				minus++;
			
			System.out.println("Introduce un caracter (para terminar pon un *): ");
			c = (char) s.nextLine().charAt(0);
		}
		System.out.println("Cantidad de dígitos: " + num);
		System.out.println("Cantidad de mayúsculas: " + mayus);
		System.out.println("Cantidad de minúsculas: " + minus);
	}

}

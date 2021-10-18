package Tema3Previo;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c;
		
		System.out.println("Introduce el caracter deseado: ");
		c = (char) s.nextLine().charAt(0);
		
		System.out.println("Código ASCII de " + c + " es: " + (int) c);
		System.out.print("Los tres siguientes caracteres son: " + (char)(c + 1) + " " 
		+ (char)(c + 2) + " " + (char)(c + 3));

	}

}

package Tema3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void resultado (int a, int b) {
		int aux=1;
		for (int i = 1; i <= b; i++)
			aux = a * aux;
		System.out.println("El resultado es: " + aux);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introduce la base: ");
		int a = s.nextInt();
		System.out.println("Introduce el exponente: ");
		int b = s.nextInt();
		
		resultado (a,b);

		s.close();
	}

}

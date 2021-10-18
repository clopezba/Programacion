package Tema3Previo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el número deseado: ");
		num = Integer.parseInt(s.nextLine());
		
		if (num % 2 == 0) 
		System.out.println("El número " + num + " es par");
			else 
		System.out.println("El número " + num + " es impar");
				
	}

}

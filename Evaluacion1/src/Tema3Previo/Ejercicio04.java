package Tema3Previo;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1;
		double num2;
		
		System.out.println("Introduce los números que deseas comprobar: ");
		num1 = Integer.parseInt(s.nextLine());
		
		num2 = Math.floor(Math.sqrt(num1));
		
		if (num1 == (Math.pow(num2,2)))
			System.out.println("El número " + num1 + " es igual al cuadrado de " + (int) num2);
		else
			System.out.println("El número " + num1 + " no es el cuadrado de ningún número entero");
		

	}

}

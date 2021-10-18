package Tema3Previo;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1, num2;
		
		System.out.println("Introduce los números que deseas comprobar:");
		num1 = Integer.parseInt(s.nextLine());
		num2 = Integer.parseInt(s.nextLine());
		
		if (num1 % num2 == 0)
			System.out.println("El número " + num1 + " es múltiplo de " + num2);
		else
			System.out.println("El número " + num1 + " no es múltiplo de " + num2);
		
		
	}

}

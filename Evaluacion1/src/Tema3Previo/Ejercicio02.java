package Tema3Previo;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2, num3, max;
		
	
		System.out.println("Introduce el primer número: ");
		num1 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce el segundo número: ");
		num2= Integer.parseInt(s.nextLine());
		System.out.println("Introduce el tercer número: ");
		num3 = Integer.parseInt(s.nextLine());
	
		max = num1;
		if ((num2 > num1) && (num2 > num3))
		max = num2;
		if ((num3 > num2) && (num3 > num1))
			max = num3;
		
		System.out.println("El mayor de los números introducidos es: " + max);
		
		
	}

}

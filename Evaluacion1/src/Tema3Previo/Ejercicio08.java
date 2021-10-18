package Tema3Previo;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a, resultado = 1;
		int b;
		
		System.out.println("Introduce el primer número (base): ");
		a = Double.parseDouble(s.nextLine());
		System.out.println("Introduce el segundo número (exponente): ");
		b = Integer.parseInt(s.nextLine());
		
		for (int i = 1; i <= b; i++)
			resultado = a * resultado;
		
		System.out.println(a + " elevado a " + b + " es: " + resultado);

	}

}

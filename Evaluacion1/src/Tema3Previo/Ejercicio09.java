package Tema3Previo;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, factorial=1;
		
		System.out.println("Introduce un n�mero entero: ");
		num = Integer.parseInt(s.nextLine());
		
		for (int i = 1; i <= num; i++)
			factorial = factorial * i;
		
		System.out.println("El factorial del n�mero " + num + " es: " + factorial);

	}

}

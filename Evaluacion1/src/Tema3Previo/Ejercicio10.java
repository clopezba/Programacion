package Tema3Previo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, cont = 0;
		
		System.out.println("Introduce un n�mero: ");
		num = Integer.parseInt(s.nextLine());
		
		for (int i=1; i<= num; i++)
			if (num%i == 0)
				cont++;
		
		if (cont > 2)
			System.out.println("El n�mero " + num + " no es primo");
		else
			System.out.println("El n�mero " + num + " es primo");

	}

}

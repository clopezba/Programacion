package Tema3Previo;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, cont = 0;
		
		System.out.println("Introduce un número: ");
		num = Integer.parseInt(s.nextLine());
		
		for (int i=1; i<= num; i++)
			if (num%i == 0)
				cont++;
		
		if (cont > 2)
			System.out.println("El número " + num + " no es primo");
		else
			System.out.println("El número " + num + " es primo");

	}

}

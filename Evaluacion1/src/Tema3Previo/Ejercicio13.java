package Tema3Previo;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, anterior;
		boolean creciente = true;
		
		System.out.println("Introduce el n�mero deseado: ");
		num = Integer.parseInt(s.nextLine());
		
		if (num == 0) {
			System.out.println("No has introducido un n�mero v�lido");
			System.exit(0);
		}
		anterior=num; 
		while (num != 0) {
			
			if (num < anterior)
				creciente = false;
			
			anterior = num;
			System.out.println("Introduce el n�mero deseado: ");
			num = Integer.parseInt(s.nextLine());
		}
			
		if (creciente)
			System.out.println("La secuencia es creciente");
			else
				System.out.println("La secuencia no es creciente");
			
				

	}

}

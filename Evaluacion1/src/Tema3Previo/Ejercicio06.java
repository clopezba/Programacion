package Tema3Previo;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num, suma = 0;
		System.out.println("Introduce un número mayor de 0: ");
		num = Integer.parseInt(s.nextLine());
		
		for(int i = 1; i <= num; i++)
			suma = suma + i;
		System.out.println("La suma de los número es: " + suma);
	}

}

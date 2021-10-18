package Tema3Previo;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, suma=0;
		
		System.out.println("Introduce el número deseado: ");
		num = Integer.parseInt(s.nextLine());
		
		do {
			suma = suma + (num % 10);
			num = (num / 10);
		}
			while (num > 0);
		System.out.println("La suma de los dígitos es " + suma);
			

	}

}

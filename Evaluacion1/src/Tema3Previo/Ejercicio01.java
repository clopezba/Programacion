package Tema3Previo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero deseado: ");
		num = Integer.parseInt(s.nextLine());
		
		if (num % 2 == 0) 
		System.out.println("El n�mero " + num + " es par");
			else 
		System.out.println("El n�mero " + num + " es impar");
				
	}

}

package Tema3;

import java.util.Scanner;

public class Ejercicio07 {

	public static void cifras (int num) {
		while (num > 0) {
			System.out.println("cifra: " + num % 10);
			num = num / 10;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = s.nextInt();
		
		cifras(num);
		
		
		s.close();
	}

}

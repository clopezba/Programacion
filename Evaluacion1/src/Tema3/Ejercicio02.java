package Tema3;

import java.util.Scanner;

public class Ejercicio02 {

	public static boolean multiplo(int num1, int num2) {
		boolean cierto;
		if (num1 % num2 ==0)
			cierto = true;
		else
			cierto = false;
	
		return cierto;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce los números que quieres comprobar: ");
		num1 = s.nextInt();
		num2= s.nextInt();
		
		System.out.println(multiplo(num1, num2));
		
		s.close();
	}

}

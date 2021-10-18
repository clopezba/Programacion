package Tema3;

import java.util.Scanner;

public class Ejercicio08v2 {

	public static void delReves (int num) {
		while (num > 0) {
			System.out.print("" + num % 10);
			num = num / 10;
		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = s.nextInt();
		
		delReves (num);
		
		
		s.close();

	}

}

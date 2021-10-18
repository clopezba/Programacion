package Tema3;

import java.util.Scanner;

public class Ejercicio09 {

	public static void tabla(int num) {
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=num; j++)
				System.out.print(i*j + " ");
		System.out.println(i*10);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = s.nextInt();
		tabla(num);
		s.close();
	}

}

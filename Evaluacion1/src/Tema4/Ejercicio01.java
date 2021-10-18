package Tema4;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [] num = new int[10];
		
		System.out.println("Introduce 10 números: ");
		for (int i=0; i<=num.length-1; i++)
			num[i] = s.nextInt();
		
		System.out.println("La secuencia inversa es: ");
		for (int i=num.length - 1; i>=0; i--)
			System.out.print(num[i] + " - ");
	
		s.close();
	}

}

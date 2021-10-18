package Tema4;

import java.util.Scanner;

public class Ejercicio07 {
	static Scanner s = new Scanner(System.in);
	
	public static void escribir(int [] num) {
		System.out.println("Escribe los 15 números que deseas rotar: ");
		for (int i=0; i<= num.length - 1; i++) {
			System.out.println("Escribe el número " + (i+1) + " -->");
			num[i] = s.nextInt();
		}
	}
	
	public static void rotar(int [] num) {
		int primero = num[0];
		int i;
		for (i = 0; i< num.length - 1; i++) {
			num[i] = num[i+1];
			System.out.print(num[i] + " ");
		}
		System.out.print(num[i] = primero);
	}
	
	public static void main(String[] args) {
		
		int [] num = new int[15];
		
		escribir(num);
		rotar(num);
		
		}
		

}

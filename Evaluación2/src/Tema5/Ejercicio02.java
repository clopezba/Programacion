package Tema5;

import java.util.Scanner;

public class Ejercicio02 {

	public static void escribirArray(int [] num, int max) {
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*(max+1));
		}
	}
	public static void ordenDecrec(int [] num) {
		int aux;
		for (int i = 0; i < num.length; i++) 
			for (int j = 0; j < num.length -1; j++) {
				if(num[j] < num[j+1]) {
					aux = num[j];
					num[j]= num[j+1];
					num[j+1] = aux;
				}
			}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Indica el tamaño del vector: ");
		int x = s.nextInt();
		System.out.println("Indica el valor máximo del vector: ");
		int max = s.nextInt();
		
		int [] num = new int [x];
		
		escribirArray(num, max);
		ordenDecrec(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		s.close();
	}

}

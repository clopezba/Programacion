package Tema4;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner s = new Scanner(System.in);
	
	public static void escnum(int [] num) {
		for (int i=0; i <= num.length - 1; i++) {
			System.out.println("Introduce el número " + (i+1) + " --> ");
			num[i] = s.nextInt();
		}
	}
	
	public static void maxmin(int [] num) {
		int min = num[0];
		int max = num[0];
		for (int i=0; i <= num.length - 1; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		}
				
		String maxmin = " ";
				
		for (int i=0; i<= num.length - 1; i++) { 
			
				if (num[i] == max)
					maxmin = "Máximo";
				else if (num[i] == min)
					maxmin = "Mínimo";
				else 
					maxmin = " ";
			System.out.println(num[i] + "   " + maxmin);	
		}		
	}
	
	public static void main(String[] args) {
		
		int [] num = new int[10];
		escnum(num);
		maxmin(num);
		
		
			
		
			
		}
		
		
		


}

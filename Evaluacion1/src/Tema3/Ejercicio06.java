package Tema3;

import java.util.Scanner;

public class Ejercicio06 {

	public static boolean cuadrado (int num) {
		boolean resultado;
		double raiz = Math.floor(Math.sqrt(num));
		
		if (Math.pow(raiz, 2) == num) {
			resultado = true;
			System.out.println("El número " + num + " es el cuadrado de " + (int)Math.sqrt(num));
		}
		else {
			resultado = false;
			System.out.println("0");
		}
		return resultado; 
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("Introduce el número deseado: ");
		num = s.nextInt();
		
		cuadrado(num);
		
		s.close();
	}

}

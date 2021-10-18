package Tema4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] binario = new int[8];
		
		System.out.println("Introduce un número binario de 8 dígitos:");
		for (int i = 0; i < binario.length; i++) {
			binario[i] = s.nextInt();
			if (binario[i] != 0 && binario[i] != 1) {
				System.out.println("Número no válido");
				System.exit(0);
			}
				
		}
		int suma = 0;
		for (int i = 0; i < binario.length; i++) {
			suma = suma + (binario[binario.length -1 - i] * (int)Math.pow(2, i));
		}
		System.out.println("La conversión a decimal es: " + suma);
		s.close();
	}
	
}

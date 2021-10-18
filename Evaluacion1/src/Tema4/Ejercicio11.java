package Tema4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Indica cu�ntas cifras tiene el n�mero binario");
		int num = s.nextInt();
		
		int [] binario = new int[num];
		
		System.out.println("Introduce el n�mero:");
		for (int i = 0; i < binario.length; i++) {
			binario[i] = s.nextInt();
			if (binario[i] != 0 && binario[i] != 1) {
				System.out.println("N�mero no v�lido");
				System.exit(0);
			}
				
		}
		int suma = 0;
		for (int i = 0; i < binario.length; i++) {
			suma = suma + (binario[binario.length -1 - i] * (int)Math.pow(2, i));
		}
		System.out.println("La conversi�n a decimal es: " + suma);
		s.close();
	}

}

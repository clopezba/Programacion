package Tema5;

import java.util.Scanner;

public class Ejercicio01 {

	public static void arrayAleat(int [] num, int max) {
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*(max+1));
		}
	}
	
	public static void posicion(int [] num, int numBuscado) {
		int cont = 0, pos = -1;
		
		for (int i = 0; i < num.length; i++) {
			cont++;
			if (num[i] == numBuscado) {
				pos = i;
				break;
			}
		}
		System.out.println(numBuscado + " se encuentra en la posición " +
		pos);
		System.out.println("Se ha encontrado en " + cont + " intento(s)");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Indica el tamaño del vector: ");
		int x = s.nextInt();
		System.out.println("Indica el valor máximo del conjunto: ");
		int max = s.nextInt();
		
		int [] num = new int [x];
		arrayAleat(num, max);
		
		System.out.println("Introduce el número que quieres buscar:");
		int numBuscado = s.nextInt();
		
		posicion(num, numBuscado);
		
		s.close();
	}

}

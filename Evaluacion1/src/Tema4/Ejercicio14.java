package Tema4;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner s = new Scanner(System.in);
	
	public static void introducirNum(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Introduce la cifra de la fila " + (i+1) +
						" columna " + (j+1));
				matriz[i][j] = s.nextInt();
			}
		}
		
	}
	
	public static boolean simetrica(int [][] matriz) {
		boolean sim = true;
		int asim=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] != matriz[j][i])
					asim++;
			}
		}
		if (asim > 0)
			sim = false;
		
		return sim;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Indica en número de filas de la matriz: ");
		int n = s.nextInt();
		int [][] matriz = new int[n][n];
		
		introducirNum(matriz);
		System.out.println("¿La matriz es simétrica? " + simetrica(matriz));

	}

}

package Tema4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void traspuesta(int [][] matriz, int [][] matrizTransp) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTransp [j][i] = matriz[i][j];
			}
		}
		for (int i = 0; i < matrizTransp.length; i++) {
			for (int j = 0; j < matrizTransp[i].length; j++) {
				System.out.print(matrizTransp [i][j]);
				
			}
		System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el número de filas de la matriz: ");
		int f = s.nextInt();
		System.out.println("Introduce el número de columnas de la matriz: ");
		int c = s.nextInt();
		
		int [][] matriz = new int [f][c];
		int [][] matrizTransp = new int [c][f];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce la cifra de la fila " + (i+1) +
						" columna " + (j+1));
				matriz[i][j] = s.nextInt();
			}
		}
		traspuesta(matriz, matrizTransp);
		s.close();

	}

}

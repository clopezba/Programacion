package Tema4;


import java.util.Scanner;

public class Ejercicio16 {

	public static boolean todosNum(int [][] matriz, int [] valores) {
		boolean todos=true;
		int cont=0;
				
		for (int h = 0; h < valores.length; h++) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (matriz[i][j] == valores[h])
						cont++;
				}
			}	
			if (cont > 1)
				todos = false;
			cont = 0;
		}
		return todos;
	}
	
	public static boolean suma(int [][] matriz) {
		boolean igual = true;
		int cuadrMagico = 0, sumaDia1=0, sumaDia2=0; 
		
		for (int i = 0; i < matriz.length; i++) {
			cuadrMagico += matriz[0][i];
		}
		
		for (int i = 0; i < matriz.length; i++) {
			int sumaFil=0, sumaCol=0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFil += matriz[i][j];
				sumaCol += matriz[j][i];
			}
			if (sumaFil != cuadrMagico || sumaCol != cuadrMagico)
				igual = false;
				
			sumaDia1 += matriz[i][i];
			sumaDia2 += matriz[matriz.length-1-i][i];
		}
			
		if (sumaDia1 != cuadrMagico || sumaDia2 != cuadrMagico)
			igual= false;
		
		return igual;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		System.out.println("Introduce el número de filas: ");
		int n = s.nextInt();
		
		int [][] matriz = new int [n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Introduce el valor de la fila " + (i+1) +
						" columna " + (j+1));
				matriz[i][j] = s.nextInt();
				if (matriz[i][j] < 1 || matriz[i][j] > n*n) {
					System.out.println("Número fuera del rango de la matriz mágica");
					System.exit(0);
				}
			}
		}
		int [] valores = new int[n*n];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = i+1;
		}
		boolean magico = false;
		if (suma(matriz) == todosNum(matriz, valores))
			magico = true;
		System.out.println("¿Es el cuadrado mágico? --> " + magico);
		s.close();
	}

}

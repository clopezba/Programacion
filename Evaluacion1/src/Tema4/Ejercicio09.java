package Tema4;

import java.util.Scanner;

public class Ejercicio09 {
	static int cont = 0;
	
	public static double media(double[] notas) {
		double suma = 0;
		for (int i = 0; i < cont; i++) {
			suma = suma + notas[i];
		}
		return (suma/cont);
	}
	
	public static int suspensos(double[] notas) {
		int susp = 0;
		for (int i = 0; i < cont; i++) {
			if (notas[i] < 5)
				susp++;
		}
		return susp;
	}
	
	public static void max(double [] notas) {
		
		double max = notas[0];
		
		for (int i = 0; i < cont; i++) 
			if (notas[i] > max)
				max = notas[i];
	
		System.out.println("La nota máxima es: " + max);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double[] notas = new double [30];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i+1) + " -->");
			notas[i] = s.nextDouble();
			cont++;
			if (notas[i] < 0) {
				cont--;
				break;
			}
		}
		
		
		System.out.println("Nota	Media	Aprobados	Suspensos");
		for (int i = 0; i < cont; i++) {
			System.out.println(notas[i] + "	" + (float)media(notas) + " 	  " + 
				(cont - suspensos(notas)) + "		" + suspensos(notas));
						
		}
		max(notas);
		s.close();
	}

}

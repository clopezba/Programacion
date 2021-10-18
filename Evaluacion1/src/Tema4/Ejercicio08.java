package Tema4;

import java.util.Scanner;

public class Ejercicio08 {

	public static double media(double[] notas) {
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}
		return (suma/notas.length);
	}
	
	public static int suspensos(double[] notas) {
		int susp = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5)
				susp++;
		}
		return susp;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double[] notas = new double [10];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i+1) + " -->");
			notas[i] = s.nextDouble();
		}
		System.out.println("Nota	Media	Aprobados	Suspensos");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + "	" + media(notas) + " 	  " + 
				(notas.length - (int)suspensos(notas)) + "		" + (int)suspensos(notas));
		}
		s.close();
	}

}

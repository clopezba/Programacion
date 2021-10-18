package soluciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void leerCalificaciones(double [] notas) {
		Scanner s= new Scanner(System.in);
		System.out.println("Introducción de notas de los alumnos");
		for (int i =0; i<notas.length; i++) {
			System.out.print("Nota " +(i+1)+":");
			notas[i]=s.nextDouble();
		}
	}
	
	public static void imprimirCalificaciones(double [] notas) {
		System.out.println("Notas de los alumnos");
		for (int i =0; i<notas.length; i++) {
			System.out.println("Nota " +(i+1)+":"+ notas[i]);
		}
	}
	public static double media(double [] notas) {
		double suma=0, media;
		for (int i =0; i<notas.length; i++) {
			suma=suma+notas[i];
		}
		media=suma/(notas.length);
		return media;
	}
	public static int suspensos(double [] notas) {
		int contador=0;
		for (int i =0; i<notas.length; i++) {
			if (notas[i]<5)
				contador++;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		double [] notas = new double[3];
		double mediaAsignatura;
		int numeroSuspensos;
		leerCalificaciones(notas);
		mediaAsignatura= media(notas);
		numeroSuspensos=suspensos(notas);
		System.out.println("Nota Media Suspensos Aprobados");
		for (int i =0; i<notas.length; i++) {
			System.out.println(notas[i] + "  " + mediaAsignatura + "   " 
					+ numeroSuspensos + "   "+ (notas.length-numeroSuspensos) );
		}

	}

}

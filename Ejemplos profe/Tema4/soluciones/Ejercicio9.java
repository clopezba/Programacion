package soluciones;
import java.util.Scanner;

public class Ejercicio9 {

	
	public static int leerCalificaciones(double [] notas) {
		// Lee el vector y además
		// Devuelve el número de notas "bueno" o real
		// Este tamaño es el que se toma en lugar de la longitud
		// del vector
		int contador =0;
		Scanner s= new Scanner(System.in);
		System.out.println("Introducción de notas de los alumnos");
		for (int i =0; i<notas.length; i++) {
			System.out.print("Nota " +(i+1)+":");
			notas[i]=s.nextDouble();
			if (notas[i]>=0)
				contador++;
			else
				break;
		}
		return contador;
		
	}
	
	public static void imprimirCalificaciones(double [] notas, int tOcupado) {
		System.out.println("Notas de los alumnos");
		for (int i =0; i<tOcupado; i++) {
			System.out.println("Nota " +(i+1)+":"+ notas[i]);
		}
	}
	public static double media(double [] notas, int tOcupado) {
		double suma=0, media;
		for (int i =0; i< tOcupado; i++) {
			suma=suma+notas[i];
		}
		media=suma/(tOcupado);
		return media;
	}
	public static int suspensos(double [] notas, int tOcupado)  {
		int contador=0;
		for (int i =0; i<tOcupado; i++) {
			if (notas[i]<5)
				contador++;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		int tamanyo =30;
		int tamanyoOcupado;
		double [] notas = new double[tamanyo];
		double mediaAsignatura;
		int numeroSuspensos;
		tamanyoOcupado= leerCalificaciones(notas);
		imprimirCalificaciones(notas, tamanyoOcupado);
		mediaAsignatura= media(notas, tamanyoOcupado);
		numeroSuspensos=suspensos(notas, tamanyoOcupado);
		System.out.println("Nota Media Suspensos Aprobados");
		for (int i =0; i<tamanyoOcupado; i++) {
			System.out.println(notas[i] + "  " + mediaAsignatura + "   " 
					+ numeroSuspensos + "   "+ (tamanyoOcupado-numeroSuspensos));
		}
	

	}

}

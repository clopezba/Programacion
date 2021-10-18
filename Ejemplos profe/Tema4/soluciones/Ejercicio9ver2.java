package soluciones;
import java.util.Scanner;

public class Ejercicio9ver2 {
	static int tamanyoOcupado;
	// CON VARIABLE GLOBAL A TODA LA CLASE
	// Contendrá el número de notas "bueno" o real
	public static int leerCalificaciones(double [] notas) {
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
	
	public static void imprimirCalificaciones(double [] notas) {
		System.out.println("Notas de los alumnos");
		for (int i =0; i<tamanyoOcupado; i++) {
			System.out.println("Nota " +(i+1)+":"+ notas[i]);
		}
	}
	public static double media(double [] notas) {
		double suma=0, media;
		for (int i =0; i< tamanyoOcupado; i++) {
			suma=suma+notas[i];
		}
		media=suma/(tamanyoOcupado);
		return media;
	}
	public static int suspensos(double [] notas)  {
		int contador=0;
		for (int i =0; i<tamanyoOcupado; i++) {
			if (notas[i]<5)
				contador++;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		int tamanyo =10;
		double [] notas = new double[tamanyo];
		double mediaAsignatura;
		int numeroSuspensos;
		tamanyoOcupado= leerCalificaciones(notas);
		imprimirCalificaciones(notas);
		mediaAsignatura= media(notas);
		numeroSuspensos=suspensos(notas);
		System.out.println("Nota Media Suspensos Aprobados");
		for (int i =0; i<tamanyoOcupado; i++) {
			System.out.println(notas[i] + "  " + mediaAsignatura + "   " 
					+ numeroSuspensos + "   "+ (tamanyoOcupado-numeroSuspensos));
		}
	

	}

}

package Tema4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void alumno(double [][] notas) {
						
		for (int i = 0; i < notas.length; i++) { 
			double max = notas[i][0];
			double min = notas[i][0];
			double suma = 0;
			for (int j = 0; j< notas[i].length; j++) {
				suma = suma + notas[i][j];
				if (notas[i][j] > max)
					max = notas[i][j];
				else if (notas[i][j] < min)
					min = notas[i][j];
			}
			System.out.println("Alumno " + (i+1) + " --> Media: " + suma/notas[i].length
					+ " | Nota máxima: " + max + " | Nota mínima: " + min);
		}
	}
	
	public static void asignatura(double [][] notas) {
		
		for (int i = 0; i < notas[0].length; i++) { 
			double max = notas[0][i];
			double min = notas[0][i];
			double suma = 0;
			for (int j = 0; j < notas.length; j++) {
				suma = suma + notas[j][i];
				if (notas[j][i] > max)
					max = notas[j][i];
				if (notas[j][i] < min)
					min = notas[j][i];
			}
			System.out.println("Asignatura " + (i+1) + " --> Media: " + suma/notas.length
					+ " | Nota máxima: " + max + " | Nota mínima: " + min);
		}
	}
	
	public static void curso(double [][] notas) {
		double max = notas[0][0];
		double min = notas[0][0];
		double suma = 0;
		for (int i = 0; i < notas.length; i++) { 
			for (int j = 0; j< notas[i].length; j++) {
				suma = suma + notas[i][j];
				if (notas[i][j] > max)
					max = notas[i][j];
				else if (notas[i][j] < min)
					min = notas[i][j];
			}
		}
		System.out.println("Media: " + suma/(notas.length*notas[0].length)
					+ " | Nota máxima: " + max + " | Nota mínima: " + min);
		}
	
	public static void buscar(double [][] notas) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la nota que deseas buscar: ");
		double nota = s.nextDouble();
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j< notas[i].length; j++)
				if (nota == notas[i][j])
					System.out.println("La nota corresponde al alumno " + (i+1)
					+ " en la asignatura " + (j + 1));
		}
		s.close();
	}
	
	
	public static void main(String[] args) {
		
		double notas [][]= {{5.6, 9.4, 6.8, 7},
							{6.9, 5.2, 5.7, 6.3},
							{9.8, 8, 7.6, 8.5}
							};

		alumno(notas);
		asignatura(notas);
		curso(notas);
		buscar(notas);
	}

}

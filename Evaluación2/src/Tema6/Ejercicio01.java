package Tema6;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		Caballos Pegaso = new Caballos("Pegaso", "Raza1", "obst�culos", 520, 60.95);
		Caballos Perdig�n = new Caballos("Perdig�n", "Raza2", "carrera", 540, 70.76);
		
		Pegaso.galopa();
		System.out.println("Dale de comer a Perdig�n");
		System.out.println("�Qu� le ofreces: heno, zanahoria, terr�n?");
		String comida = s.next();
		Perdig�n.come(comida);
		System.out.println("\n");
	
		Pegaso.setRaza("alado");
		Perdig�n.setRaza("juguete");
		
		System.out.println("CARRERAS:");
		System.out.println("Pegaso contra Perdig�n");
		Pegaso.carreraContra(Perdig�n);
		System.out.println("\n");
		System.out.println("Perdig�n contra Pegaso");
		Perdig�n.carreraContra(Pegaso);
		
		System.out.println("\n");
		System.out.println("CIRCUITO OBST�CULOS:");
		System.out.println("Pegaso contra Perdig�n");
		Pegaso.circuitoContra(Perdig�n);
		System.out.println("\n");
		System.out.println("Perdig�n contra Pegaso");
		Perdig�n.circuitoContra(Pegaso);
		
		System.out.println("\n");
		System.out.println("DATOS CABALLOS:");
		System.out.println(Pegaso);
		System.out.println(Perdig�n);
		s.close();
	}
}

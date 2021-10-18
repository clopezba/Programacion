package Tema6;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		Caballos Pegaso = new Caballos("Pegaso", "Raza1", "obstáculos", 520, 60.95);
		Caballos Perdigón = new Caballos("Perdigón", "Raza2", "carrera", 540, 70.76);
		
		Pegaso.galopa();
		System.out.println("Dale de comer a Perdigón");
		System.out.println("¿Qué le ofreces: heno, zanahoria, terrón?");
		String comida = s.next();
		Perdigón.come(comida);
		System.out.println("\n");
	
		Pegaso.setRaza("alado");
		Perdigón.setRaza("juguete");
		
		System.out.println("CARRERAS:");
		System.out.println("Pegaso contra Perdigón");
		Pegaso.carreraContra(Perdigón);
		System.out.println("\n");
		System.out.println("Perdigón contra Pegaso");
		Perdigón.carreraContra(Pegaso);
		
		System.out.println("\n");
		System.out.println("CIRCUITO OBSTÁCULOS:");
		System.out.println("Pegaso contra Perdigón");
		Pegaso.circuitoContra(Perdigón);
		System.out.println("\n");
		System.out.println("Perdigón contra Pegaso");
		Perdigón.circuitoContra(Pegaso);
		
		System.out.println("\n");
		System.out.println("DATOS CABALLOS:");
		System.out.println(Pegaso);
		System.out.println(Perdigón);
		s.close();
	}
}

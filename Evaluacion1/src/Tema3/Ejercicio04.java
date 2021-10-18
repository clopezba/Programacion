package Tema3;

import java.util.Scanner;

public class Ejercicio04 {

	public static double area(double radio, double PI) {
		
		double resultado = Math.pow(radio, 2) * PI;
		return resultado;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radio, PI = (Math.PI);
		
		System.out.println("Introduce el radio: ");
		radio = s.nextDouble();
		
		System.out.println("El área del cículo es: " + area(radio, PI));

		s.close();
	}

}

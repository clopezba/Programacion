package Tema3;

import java.util.Scanner;

public class Ejercicio03 {

	public static double conver(double dolares, double dolEur) {
		double euros = dolares * dolEur;
		return euros;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dolares, dolEur;
		
		System.out.println("Introduce la cantidad de dólares: ");
		dolares = s.nextDouble();
		System.out.println("Introduce la cotización del dólar sobre el euro: ");
		dolEur = s.nextDouble();
		
		
		System.out.println(dolares + " dólares son " + (conver(dolares, dolEur)) + " euros");

		s.close();
	}

}

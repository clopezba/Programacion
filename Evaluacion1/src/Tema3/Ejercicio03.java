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
		
		System.out.println("Introduce la cantidad de d�lares: ");
		dolares = s.nextDouble();
		System.out.println("Introduce la cotizaci�n del d�lar sobre el euro: ");
		dolEur = s.nextDouble();
		
		
		System.out.println(dolares + " d�lares son " + (conver(dolares, dolEur)) + " euros");

		s.close();
	}

}

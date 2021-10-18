package Tema3Previo;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float consumo;
		System.out.println("Introduce los metros cúbicos consumidos: ");
		consumo = Float.parseFloat(s.nextLine());
		
		if (consumo <= 100)
			System.out.println("El coste total es de " + consumo*0.15 + " euros");
		else if (consumo > 100 && consumo <= 500) {
			consumo = consumo - 100;
			System.out.println("El coste total es de " + (consumo*0.20 + 15) + " euros");
		}
		else if (consumo > 500 && consumo <= 1000) {
			consumo = consumo - 500;
			System.out.println("El coste total es de " + (consumo*0.35 + 95) + " euros");
	
		}
		else if (consumo > 1000) {
			consumo = consumo - 1000;
			System.out.println("El coste total es de " + (consumo*0.8 + 270) + " euros");
		}
		
	}

}

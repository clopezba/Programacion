package Tema3Previo;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, cont = 0, min, max;
		float suma = 0;
		
		System.out.println("Introduce el número deseado (para finalizar escribe"
				+ " un número negativo): ");
		num = Integer.parseInt(s.nextLine());
		
		min = num;
		max = num;
		
		if (num < 0)
			System.out.println("No has introducido un númeor válido. "
					+ "Debes introducir un número positivo");
		else {
			while (num >= 0) {
				cont = cont + 1;
				suma = suma + num;
				if (num < min)
					min = num;
				if (num > max)
					max = num;
				System.out.println("Introduce otro número (para finalizar escribe"
						+ " un número negativo): ");
				num = Integer.parseInt(s.nextLine());
			}
		System.out.println("El mínimo es: " + min);
		System.out.println("El máximo es: " + max);
		System.out.println("La media es: " + suma/cont);
		}
	}

}

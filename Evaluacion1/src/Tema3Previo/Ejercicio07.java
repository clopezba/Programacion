package Tema3Previo;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, cont = 0, min, max;
		float suma = 0;
		
		System.out.println("Introduce el n�mero deseado (para finalizar escribe"
				+ " un n�mero negativo): ");
		num = Integer.parseInt(s.nextLine());
		
		min = num;
		max = num;
		
		if (num < 0)
			System.out.println("No has introducido un n�meor v�lido. "
					+ "Debes introducir un n�mero positivo");
		else {
			while (num >= 0) {
				cont = cont + 1;
				suma = suma + num;
				if (num < min)
					min = num;
				if (num > max)
					max = num;
				System.out.println("Introduce otro n�mero (para finalizar escribe"
						+ " un n�mero negativo): ");
				num = Integer.parseInt(s.nextLine());
			}
		System.out.println("El m�nimo es: " + min);
		System.out.println("El m�ximo es: " + max);
		System.out.println("La media es: " + suma/cont);
		}
	}

}

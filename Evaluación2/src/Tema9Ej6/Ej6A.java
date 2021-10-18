package Tema9Ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Introduce un número entero: ");
		int num = s.nextInt();
		}
		catch(InputMismatchException exc){
			System.out.println(exc.getMessage());
			System.out.println("No has introducido un entero");
		}
		s.close();

	}

}

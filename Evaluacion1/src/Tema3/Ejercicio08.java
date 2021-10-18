package Tema3;

import java.util.Scanner;

public class Ejercicio08 {

	public static int delReves (String num) {
		String invertir = "";
		for (int i = num.length() - 1; i >= 0; i--)
			invertir = invertir + num.charAt(i);
		return Integer.parseInt(invertir);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		String num = s.nextLine();
		
		System.out.println(delReves(num));
		
		s.close();		
	}

}

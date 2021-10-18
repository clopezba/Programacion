package Tema4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce los caracteres deseados:");
		String texto = s.nextLine();
		
		
		int a = 0, e= 0, i=0, o=0, u=0;
		
		for (int j = 0; j < texto.length(); j++) {
			if (texto.charAt(j) == 'a' || texto.charAt(j) == 'A')
				a++;
			else if (texto.charAt(j) == 'e' || texto.charAt(j) == 'E')
				e++;
			else if (texto.charAt(j) == 'i' || texto.charAt(j) == 'I')
				i++;
			else if (texto.charAt(j) == 'o' || texto.charAt(j) == 'O')
				o++;
			else if (texto.charAt(j) == 'u' || texto.charAt(j) == 'U')
				u++;
			
		}
		int [] vocal = {a, e, i, o, u};
		
		System.out.println("Frecuencia de aparición de la vocales:");
		System.out.println("A  E  I  O  U");
		for (int j = 0;  j< vocal.length; j++)
			System.out.print(vocal[j] + "  ");
		
		s.close();

	}

}

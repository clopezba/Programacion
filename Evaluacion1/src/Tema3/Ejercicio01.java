package Tema3;

import java.util.Scanner;

public class Ejercicio01 {

	public static boolean par(int num) {
		boolean respuesta; 
		
		if (num % 2 == 0)
			respuesta = true;
		else
			respuesta = false;
		
		return respuesta;
	}
	
	
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce el número deseado: ");
		num = Integer.parseInt(s.nextLine());
		
		//boolean resultado = par(num);
		System.out.println(par(num));
		
		s.close();
	}

}

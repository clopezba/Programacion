package Tema3Previo_Ejemplos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numero, anterior;
		boolean esCreciente = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el n�mero");
		//numero = Integer.parseInt(s.nextLine());
		numero = s.nextInt();
		if (numero==0) {
			System.out.println("No has introducido ning�n n�mero!!!!!");
			System.exit(-1);
		}
		anterior = numero;
		while (numero !=0) {
			if (numero < anterior) {
				esCreciente=false;
			}
			anterior = numero;
			System.out.println("Introduzca el n�mero");
			numero = s.nextInt();
		} // fin While
		if (esCreciente) //(esCreciente)=true
			System.out.println("Es creciente");
		else
			System.out.println("NO es creciente");
		
		
		s.close();
			
	}
}

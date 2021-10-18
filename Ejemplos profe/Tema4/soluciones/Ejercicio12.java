package soluciones;
import java.util.Scanner;

/*
 * 12.	Implementa un programa que determine la frecuencia de aparici�n de cada vocal en una cadena de 
 * caracteres introducida por teclado. Comenzar� solicitando la cadena y, posteriormente, construir� un array 
 * con las frecuencias de cada vocal. Finalmente, imprimir� el array de frecuencias por pantalla. 
NOTA: No debe ser sensible a may�sculas/min�sculas.

 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadena;
		int [] frecuencias= {0,0,0,0,0};
		System.out.println("Introduce una cadena");
		cadena=s.nextLine();
		// Recorrido Cadena
		for (int i=0; i<cadena.length();i++ ) {
			 if(cadena.charAt(i)=='a' || cadena.charAt(i)=='A')
			 		frecuencias[0]++;
			 if(cadena.charAt(i)=='e' || cadena.charAt(i)=='E')
			 		frecuencias[1]++;
			 if(cadena.charAt(i)=='i' || cadena.charAt(i)=='I')
			 		frecuencias[2]++;
			 if(cadena.charAt(i)=='o' || cadena.charAt(i)=='O')
			 		frecuencias[3]++;
			 if(cadena.charAt(i)=='u' || cadena.charAt(i)=='U')
			 		frecuencias[4]++;	
		}
		System.out.println("\nFrecuencias de aparici�n");
		System.out.println("\n=========================");
		System.out.println("A(a) --> "+ frecuencias[0] + " veces");
		System.out.println("E(e) --> "+ frecuencias[1] + " veces");
		System.out.println("I(i) --> "+ frecuencias[2] + " veces");
		System.out.println("O(o) --> "+ frecuencias[3] + " veces");
		System.out.println("U(u) --> "+ frecuencias[4] + " veces");
	}

}

package boletin3;
import java.util.Scanner;

// Utilizando cadenas

public class Ejercicio08Ver2 {
	
public static int invertir (String num){
	String invertido="";
	for (int i=num.length()-1; i>=0; i--) 
			invertido=invertido + num.charAt(i);
	
	return Integer.parseInt(invertido);
		
} // de invertir
//
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Introduzca una cifra:");
	String numero = s.nextLine();
	int alReves= invertir (numero);
	System.out.println(alReves);
	
} // del main
}

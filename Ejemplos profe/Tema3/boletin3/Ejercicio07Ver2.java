package boletin3;
import java.util.Scanner;

public class Ejercicio07Ver2 {
	
public static void cifras (String num){
		for (int i= num.length()-1; i>=0; i--)
			System.out.println("cifra: "+ num.charAt(i));
	} // de cifras
//
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Introduzca una cifra:");
	String numero = s.next();
	cifras (numero);
	
}
}

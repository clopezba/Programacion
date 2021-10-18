package boletin3;
import java.util.Scanner;

public class Ejercicio07ConMetodos {
	
public static void cifras (int num){
		while (num!=0) {
			System.out.println("cifra: "+ num%10);
			num=num/10;
		}
	} // de cifras
//
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Introduzca una cifra:");
	int numero = s.nextInt();
	cifras (numero);
	
}
}

package boletin3;
import java.util.Scanner;

public class Ejercicio07_SinMetodos {
	
//
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Introduzca una cifra:");
	int numero = s.nextInt();
	while (numero!=0) {
		System.out.println("cifra: "+ numero%10);
		numero=numero/10;
	}
}
}

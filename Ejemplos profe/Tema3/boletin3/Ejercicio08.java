package boletin3;
import java.util.Scanner;

public class Ejercicio08 {
	
public static int invertir (int num){
	int resto, invertido=0;	
	while(num!=0) {
        resto=num%10;
        num=num/10;         
        invertido=invertido*10+resto;         
     }
	return invertido;
		
} // de invertir
//
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Introduzca una cifra:");
	int numero = s.nextInt();
	int alReves= invertir (numero);
	System.out.println(alReves);
	
} // del main
}

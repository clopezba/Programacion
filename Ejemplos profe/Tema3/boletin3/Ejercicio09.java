package boletin3;
import java.util.Scanner;
public class Ejercicio09 {
	public static void cifra (int n) {
		int suma=0;
		for (int i=1; i<=n; i++) {
			for (int j=i;j<=i*n;j=j+i) {
				System.out.print(j+"\t");
				suma = suma + j;
			}
			System.out.println(suma);
			suma=0;
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int num=s.nextInt();
		cifra(num);		
	}
}

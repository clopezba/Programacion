package pruebas_tablas;

import java.util.Scanner;

public class PruebaTablas1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Introduce tamaño del vector");
		size = s.nextInt();
		int [] x = new int [size];
		tablas.Vectores.escribirArray(x);
		tablas.Vectores.leerArray(x);

	}

}

package pruebas_tablas;

import java.util.Scanner;

public class PruebaTablas2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size, aleatorioMaximo;
		System.out.println("Introduce tamaño del vector");
		size = s.nextInt();
		int [] x = new int [size];
		System.out.println("Introduce valor aleatorio máximo");
		aleatorioMaximo=s.nextInt();
		tablas.Vectores.escribirArrayAleatorio(x, aleatorioMaximo);
		tablas.Vectores.leerArray(x);

	}

}

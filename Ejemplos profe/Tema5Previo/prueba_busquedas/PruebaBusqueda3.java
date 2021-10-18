package prueba_busquedas;

import java.util.Scanner;

public class PruebaBusqueda3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size, aleatorioMaximo,valorBuscado;
		System.out.println("Introduce tamaño del vector");
		size = s.nextInt();
		int [] x = new int [size];
		System.out.println("Introduce valor aleatorio máximo");
		aleatorioMaximo=s.nextInt();
		tablas.Vectores.escribirArrayAleatorio(x, aleatorioMaximo);
		System.out.println("Introduce valor a buscar");
		valorBuscado=s.nextInt();
		int resultado= busquedas.Buscar.busca3(x, valorBuscado);
		System.out.println(valorBuscado + " encontrado: " + resultado +" veces");
		tablas.Vectores.leerArray(x);

	}

}

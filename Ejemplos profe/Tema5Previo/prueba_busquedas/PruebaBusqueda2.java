package prueba_busquedas;

import java.util.Scanner;

public class PruebaBusqueda2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size, aleatorioMaximo,valorBuscado;
		System.out.println("Introduce tama�o del vector");
		size = s.nextInt();
		int [] x = new int [size];
		System.out.println("Introduce valor aleatorio m�ximo");
		aleatorioMaximo=s.nextInt();
		tablas.Vectores.escribirArrayAleatorio(x, aleatorioMaximo);
		System.out.println("Introduce valor a buscar");
		valorBuscado=s.nextInt();
		boolean resultado= busquedas.Buscar.busca2(x, valorBuscado);
		System.out.println(resultado);
		tablas.Vectores.leerArray(x);

	}

}

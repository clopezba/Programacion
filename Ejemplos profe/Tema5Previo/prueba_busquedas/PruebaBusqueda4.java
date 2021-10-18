package prueba_busquedas;

import java.util.Scanner;

public class PruebaBusqueda4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size, aleatorioMaximo,valorBuscado;
		System.out.println("Introduce tamaño del vector");
		size = s.nextInt();
		int [] x = new int [size];
		int [] posiciones = new int [size]; // ¡DEBERÍA INICIALIZARLO A 0!!
		System.out.println("Introduce valor aleatorio máximo");
		aleatorioMaximo=s.nextInt();
		tablas.Vectores.escribirArrayAleatorio(x, aleatorioMaximo);
		System.out.println("Introduce valor a buscar");
		valorBuscado=s.nextInt();
		int resultado= busquedas.Buscar.busca4(x, valorBuscado, posiciones );
		System.out.println(valorBuscado + " encontrado: " + resultado +" veces");
		if (resultado >0) {
			System.out.println("Encontrado en las posiciones:");
			for (int i =0; i< posiciones.length;i++)
				if (posiciones[i]==1)
					System.out.print(i+"-");
		}
		System.out.println("");
		tablas.Vectores.leerArray(x);

	}

}

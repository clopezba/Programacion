package busquedas;

public class Buscar {

	public static boolean busca1(int [] x, int valorBuscado) {
		boolean busca=false;
		for (int i =0; i<x.length;i++)
			if (x[i]== valorBuscado)
				busca=true;
		return busca;
	}// de busca1
	//
	//
	// Ídem de la anterior pero sin recorrer todo el vector
	public static boolean busca2(int [] x, int valorBuscado) {
		boolean busca=false, seguir=true;
		int i=0;
		while (i<x.length && seguir) { // seguir==true
			if (x[i]== valorBuscado) {
				busca=true;
				seguir=false;
			}
			i++;
		}// del while
			return busca;
	} // de busca2
	//
	//
	// Ahora que devuelva el número de veces que aparece
	public static int busca3(int [] x, int valorBuscado) {
		int cuenta=0;
		for (int i =0; i<x.length;i++)
			if (x[i]== valorBuscado)
				cuenta++;
		return cuenta;
	}
	//
	// Ahora número de veces y posición
	public static int busca4(int [] x, int valorBuscado, int[] posiciones) {
		int cuenta=0;
		for (int i =0; i<x.length;i++)
			if (x[i]== valorBuscado) {
				cuenta++;
				posiciones[i]=1;
			}
		return cuenta;
	}
	
} // de Busca

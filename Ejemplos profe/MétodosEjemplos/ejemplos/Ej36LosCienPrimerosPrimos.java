package ejemplos;
import varios.Matematicas;

public class Ej36LosCienPrimerosPrimos {

	public static void main(String[] args) {
		int contadorPrimos =0;
		int numero = 1;
		while (contadorPrimos <= 100) {
			if (varios.Matematicas.NumeroPrimo(numero)) {
				System.out.print(numero + "-");
				contadorPrimos++;
			}
			numero++;
		} // del while
	}

}

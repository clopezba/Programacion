package Tema3Previo;


public class Ejercicio11 {

	public static boolean NumeroPrimo (int num) {
		boolean esPrimo = true;
		for (int i = 2; i <= (Math.sqrt(num)); i++) 
			if ((num % i) == 0) {
				esPrimo = false;
				break;
			}
		return esPrimo;
	}
	
	public static void main(String[] args) {
		
		int cont=0, num=2;
		
		while (cont <= 100) {
			if (NumeroPrimo(num)) {
				System.out.println(num + " - ");
				cont++;
			}
			num++;	
								
		
		}
	}

}

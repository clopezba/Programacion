package varios;

public class Matematicas {

	public static boolean NumeroPrimo (int n) {
	boolean esPrimo = true;
    for (int i = 2; i <= Math.sqrt(n); i++) 
    	if ((n % i) == 0) {
    		esPrimo = false;
    		break;
    	}
    return esPrimo;
	} // de NumeroPrimo
	
	public static long Factorial (int n) {
    long factorial=1;
	for (int i=1;i<=n;i++) {
		factorial = factorial * i;
	}	
	return factorial;
	}// de Factorial
}// de Matematicas
package Tema3Previo_Ejemplos;
/*
 * Ampliación ejemplos Alberto octubre 2019
 * Ver detrás de Ej18For, Ejercicio16, Ejercicio17, Ej18For2
 */
public class Ej18For3 {
  public static void main(String[] args) {
        
    for (int i=1; i<=1000 ; i++) {
    // Nooooor !!!!! . No recomendable. Se pierde legibilidad
    	System.out.println("Vuelta número: " + i);
    	if (i==21)
    		break;
    
    }
  }
}

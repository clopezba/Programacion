package ejemplos;
import java.util.Scanner;
// Quinta Versi�n
// Utilizando variable booleana
// Es la m�s �ptima de las 5 pues es la que menos instrucciones ejecuta.

public class Ej32NumeroPrimoVer5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un n�mero entero positivo: ");
    int n = s.nextInt();

    boolean esPrimo = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if ((n % i) == 0) {
        esPrimo = false;
        break;
      }
    }
      
    if (esPrimo) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
  }
}

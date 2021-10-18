package ejemplos;
import java.util.Scanner;

// Segunda versi�n
// Contamos las veces que es divisible
// Pero empezando en 2 y acabando en el anterior. El 1 sigue siendo primo

public class Ej29NumeroPrimoVer2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un n�mero entero positivo: ");
    int n = s.nextInt();
    int cuenta =0;
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        cuenta++;
      }
    }
    
    if (cuenta==0) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
  }
}

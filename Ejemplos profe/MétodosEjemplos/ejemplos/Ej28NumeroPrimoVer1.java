package ejemplos;
import java.util.Scanner;

// Primera versión
// Contamos las veces que es divisible
// Tal y como está resuelto el 1 es primo

public class Ej28NumeroPrimoVer1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    int n = s.nextInt();
    int cuenta =0;
    for (int i = 1; i <= n; i++) {
      if ((n % i) == 0) {
        cuenta++;
      }
    }
    
    if (cuenta==2) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
  }
}

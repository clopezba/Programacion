package ejemplos;
import java.util.Scanner;

// Cuarta versión
// Contamos las veces que es divisible
// Pero empezando en 2 y acabando en la su raíz cuadrada. El 1 sigue siendo primo

public class Ej31NumeroPrimoVer4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    int n = s.nextInt();
    int cuenta =0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
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

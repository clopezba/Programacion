package DoWhile;
import java.util.Scanner;

public class EjDoWhile03
{
    public static void main(String[] args)
    {
        char opcion;
        Scanner teclado = new Scanner(System.in);

        do {
            mostrarMenu();

            do {
                System.out.printf("\nIntroduzca opci�n (1-4): ");
                opcion = teclado.next().charAt(0);
            }
            while(opcion < '1' || opcion > '4');

            System.out.printf("\n");

            switch(opcion) {
                case '1': System.out.println("Has elegido la opci�n primera");
                          break;
                case '2': System.out.println("Has elegido la opci�n segunda");
                          break;
                case '3': System.out.println("Has elegido la opci�n tercera");
            }
        }
        while(opcion != '4');
    }// del main

    private static void mostrarMenu()
    {
        System.out.printf("\n>>> MEN� DE OPCIONES <<<");
        System.out.printf("\n1. Opci�n primera.");
        System.out.printf("\n2. Opci�n segunda");
        System.out.printf("\n3. Opci�n tercera.");
        System.out.printf("\n4. Salir.");
    }
}
   
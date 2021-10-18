package DoWhile;
import java.util.Scanner;

public class EjDoWhile02
{
    public static void main(String[] args)
    {
        int dato;
        Scanner teclado = new Scanner(System.in);

            do {
                System.out.printf("\nIntroduzca un entero entre 1 y 10: ");
                dato= teclado.nextInt();
                
            }
            while (dato < 1 || dato > 10);
            //
            System.out.println ("FIN");

    }     // del main 
 
}
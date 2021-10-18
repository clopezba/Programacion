package Tema3Previo_Ejemplos;

import java.util.Scanner;

/**
 * Sentencia if
 
 */

public class Ej13SentenciaIf03 {
  public static void main(String[] args) {   
    System.out.print("¿Cuál es la capital de España? ");
    Scanner s = new Scanner(System.in);
    String respuesta=s.nextLine();
    if (respuesta.equals("Madrid")) {
    	System.out.println("¡Acertaste!");
    } else {
        System.out.println("Lo siento, es Madrid");
    }
  }
}

package tablas;

import java.util.Scanner;

public class Vectores {
	public static void escribirArray(int [] x) {
    	Scanner s = new Scanner(System.in);
		System.out.println("Introducción de elementos en el array");
    	for (int i=0; i<x.length; i++) {
    		System.out.print("Introduce el " + i +": " );
    		x[i]=s.nextInt();
    	}
    s.close();
    } // de escribirArray

 public static void leerArray (int [] x) {
	 System.out.println("El array x contiene los siguientes elementos:");
     for (int i = 0; i < x.length; i++) 
    	System.out.println("Elemento nº " + i + " --> "+x[i]);
  } // de leerArray
 
 public static void escribirArrayAleatorio(int [] x, int numeroMaximo) {
	 for (int i=0; i<x.length; i++) 
 	      x[i]= (int) (Math.random()*(numeroMaximo+1));
	 
 } // de escribirArrayAleatorio
}

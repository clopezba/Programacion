package soluciones;

import java.util.Scanner;

/* Alberto Carrera
 * 20 Octubre 2017
 */
public class Ejercicio4_13 {
  public static void main(String[] args) {
        
 /* Cada fila (de las 3) representa las notas de un alumno
    Cada columna (de las 4) representa las notas de una asignatura
 */
	
	double notas [][]= { {5.6, 9.4, 6.8, 7}, 
			  			 {6.9, 5.2, 5.7, 6.3}, 
			  			 {9.8, 8, 7.6, 8.5}
			  		   };
	//apartadoA(notas);
	//apartadoB(notas);
	//apartadoC(notas);
	apartadoD(notas);
  }// del main
  
  public static void apartadoA(double [][] n) {
	  double minimo, maximo, suma;
	  for (int i=0; i<n.length;i++) {
		  minimo=n[i][0]; maximo=n[i][0]; suma=0;
		  for (int j=0; j<n[i].length;j++) {
			  if (n[i][j]<minimo) {
				  minimo=n[i][j];
			  }
			  if (n[i][j]>maximo) {
				  maximo=n[i][j];
			  }
			  suma=suma+n[i][j];	  
		  }// del for interno
		  System.out.println("Estadísticas Alumno: "+ (i+1));
		  System.out.println("Nota mínima: "+ minimo);
		  System.out.println("Nota máxima: "+ maximo);
		  System.out.println("Nota media: "+ suma/n[i].length);
	  } // del for externo
  }// de apartadoA
  
  public static void apartadoB(double [][] n) {
	  double minimo, maximo, suma;
	  for (int j=0; j<n[0].length;j++) {
		  minimo=n[0][j]; maximo=n[0][j]; suma=0;
		  for (int i=0;i<n.length;i++) {
			 if (n[i][j]<minimo) {
					  minimo=n[i][j];
			  }
			  if (n[i][j]>maximo) {
					  maximo=n[i][j];
			  }
			  suma=suma+n[i][j]; 
		  }
		  System.out.println("Estadísticas Modulo: "+ (j+1));
		  System.out.println("Nota mínima: "+ minimo);
		  System.out.println("Nota máxima: "+ maximo);
		  System.out.println("Nota media: "+ suma/n.length);
	  }
  }// de apartado B
  
  public static void apartadoC(double [][] n) {
	  double minimo=n[0][0], maximo=n[0][0], suma=0;
	  
	  for (int i=0;i<n.length;i++) {
		  for (int j=0; j<n[i].length;j++) {
			  if (n[i][j]<minimo) {
				  minimo=n[i][j];
			  }
			  if (n[i][j]>maximo) {
				  maximo=n[i][j];
			  }
			  suma=suma+n[i][j]; 
		  }
	  }
	  System.out.println("Estadísticas del curso");
	  System.out.println("Nota mínima: "+ minimo);
	  System.out.println("Nota máxima: "+ maximo);
	  System.out.println("Nota media: "+ suma/((n.length)*n[0].length));
  } // de apartadoC
  public static void apartadoD(double [][] n) {
	  Scanner s = new Scanner(System.in);
	  double nota;
	  System.out.print("Introduce la nota a buscar: ");
	  nota=s.nextDouble();
	  for (int i=0;i<n.length;i++) {
		  for (int j=0; j<n[i].length;j++) {
			  if (n[i][j]==nota) {
				  System.out.println("Alumno: " +i + "  Asignatura :" +j);
			  }
		  }
	  }  
	  
	  
  }// de apartadoD
  
}

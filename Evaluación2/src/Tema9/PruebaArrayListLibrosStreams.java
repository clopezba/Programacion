package Tema9;
// PruebaListaLibros.java: prueba de la clase ArrayListLibros

import java.util.ArrayList; 
import Tema7.Libro;
import ejemplos.Fecha;
import ejemplos.Persona;

public class PruebaArrayListLibrosStreams {
  public static void main(String args[]) {
  	Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Fecha f1 = new Fecha(16,11,2001);
    Libro l1 = new Libro("Introducci�n a Java",p1, 
                         "0-13-031997-X",56,3,"Prentice-Hall","Madrid-Espa�a",f1);
                         
    Libro l2 = new Libro("Beginning Java",p1, 
                         "0-13-031997-X",547,3,"Addison","Madrid-Espa�a",f1);                     
    Libro l3 = new Libro("Avanzado Java",p1, 
                         "0-13-031997-X",328,3,"McGraw-Hill","Madrid-Espa�a",f1);
    
                     
    
    ArrayList<Libro> a= new ArrayList<Libro>();
    a.add(l1);
    a.add(l2);
    a.add(l3);
    
   
    //Ordenar por p�ginas
    System.out.println("Ordenar por p�ginas con stream:");
    a.stream().sorted((x,y) -> x.damePaginas()- y.damePaginas()).forEach(y -> y.mostrarLibros());
    System.out.println("\n---------------------------------------------\n");
    //Ordenar por titulo
    System.out.println("Ordenar por t�tulo con stream:");
    a.stream().sorted((x,y) -> x.dameTitulo().compareToIgnoreCase(y.dameTitulo())).forEach(y -> y.mostrarLibros());
    
    
    

  }
}
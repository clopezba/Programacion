package Tema9;
// PruebaListaLibros.java: prueba de la clase ArrayListLibros

import java.util.ArrayList;
import java.util.Collections;

import Tema7.Libro;
import ejemplos.Fecha;
import ejemplos.Persona;

public class PruebaArrayListLibros {
  public static void main(String args[]) {
  	Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Fecha f1 = new Fecha(16,11,2001);
    Libro l1 = new Libro("Introducción a Java",p1, 
                         "0-13-031997-X",56,3,"Prentice-Hall","Madrid-España",f1);
                         
    Libro l2 = new Libro("Beginning Java",p1, 
                         "0-13-031997-X",547,3,"Addison","Madrid-España",f1);                     
    Libro l3 = new Libro("Avanzado Java",p1, 
                         "0-13-031997-X",328,3,"McGraw-Hill","Madrid-España",f1);
    
                     
    
    ArrayList<Libro> a= new ArrayList<Libro>();
    a.add(l1);
    a.add(l2);
    a.add(l3);
    
   // System.out.println(a);
    //Ordenar por páginas
    Collections.sort(a, new PaginasComparator());
    System.out.println("Ordenar por páginas:\n" + a);
    
    //Ordenar por Título
    Collections.sort(a,  new TituloComparator());
    System.out.println("Ordenar por título:\n" + a);
    
    
    

  }
}
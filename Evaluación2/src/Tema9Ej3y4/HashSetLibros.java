package Tema9Ej3y4;

import java.util.HashSet; 

import Tema7.Libro;
import ejemplos.Fecha;
import ejemplos.Persona;

public class HashSetLibros {

	public static void main(String[] args) {
		HashSet<Libro> libros = new HashSet<Libro>();
		
		Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
	    Fecha f1 = new Fecha(16,11,2001);
	    Libro l1 = new Libro("Introducci�n a Java",p1, 
	                         "0-13-031997-X",56,3,"Prentice-Hall","Madrid-Espa�a",f1);
	                         
	    Libro l2 = new Libro("Beginning Java",p1, 
	                         "0-13-031997-X",547,3,"Addison","Madrid-Espa�a",f1);                     
	    Libro l3 = new Libro("Avanzado Java",p1, 
	                         "0-13-031997-X",328,3,"McGraw-Hill","Madrid-Espa�a",f1);
	    
	                     
	    libros.add(l1);
	    libros.add(l2);
	    libros.add(l3);
	    
	    //N�mero libros
	    System.out.println("N�mero de libros: " + libros.size());
	    
	    //Insertar nuevo libro
	    libros.add(new Libro("Aprendiendo a programar",p1, 
	                         "0-25-031997-X",814,4,"Espasa","Huesca-Espa�a",f1));
	   
	    //Eliminar libro
	    libros.remove(l2);
	    	    
	    //Averiguar si la colecci�n tiene un libro
	    System.out.println(libros.contains(l3));
	    
	    //Buscar libro por parte de t�tulo
	    for (Libro s: libros) {
	    	if (s.dameTitulo().toUpperCase().contains("JaVa".toUpperCase()))
	    		System.out.println (s);
	    }
        
	}

}

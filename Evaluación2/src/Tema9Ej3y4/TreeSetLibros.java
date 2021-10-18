package Tema9Ej3y4;

import java.util.TreeSet;

import ejemplos.Fecha;
import ejemplos.Persona;

public class TreeSetLibros {
	public static void main(String[] args) {
		
		TreeSet <LibroTreeSet> libros = new TreeSet<LibroTreeSet>();
		
		Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
	    Fecha f1 = new Fecha(16,11,2001);
	    LibroTreeSet l1 = new LibroTreeSet("Introducci�n a Java",p1, 
	                         "0-13-031997-X",56,3,"Prentice-Hall","Madrid-Espa�a",f1);
	                         
	    LibroTreeSet l2 = new LibroTreeSet("Beginning Java",p1, 
	                         "0-13-031997-X",547,3,"Addison","Madrid-Espa�a",f1);                     
	    LibroTreeSet l3 = new LibroTreeSet("Avanzado Java",p1, 
	                         "0-13-031997-X",328,3,"McGraw-Hill","Madrid-Espa�a",f1);
	    
	                     
	    libros.add(l1);
	    libros.add(l2);
	    libros.add(l3);
	    
	    //N�mero libros
	    System.out.println("N�mero de libros: " + libros.size());
	    
	    //Insertar nuevo libro
	    libros.add(new LibroTreeSet("Aprendiendo a programar",p1, 
	                         "0-25-031997-X",814,4,"Espasa","Huesca-Espa�a",f1));
	   
	    //Eliminar libro
	    libros.remove(l3);
	    	    
	    //Averiguar si la colecci�n tiene un libro
	    System.out.println(libros.contains(l1));
	    
	    //Buscar libro por parte de t�tulo
	    for (LibroTreeSet l: libros) {
	    	if (l.dameTitulo().toUpperCase().contains("JaVa".toUpperCase()))
	    		System.out.println (l);
	    }
        
	   
	}

}


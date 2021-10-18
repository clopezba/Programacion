package Tema10_1;

import java.util.StringTokenizer;

public class Ej4 {

	public static void main(String[] args) {
		
		String nombre = "Cristina L�pez Bachiller";
		
		//a-Utilizando la clase StringTokenizer
		StringTokenizer st = new StringTokenizer(nombre);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

		//b-Utilizando el m�todo split 
		String [] separar = nombre.split( "\\s");
		for(String nomb: separar)
			System.out.println(nomb);
	}

}

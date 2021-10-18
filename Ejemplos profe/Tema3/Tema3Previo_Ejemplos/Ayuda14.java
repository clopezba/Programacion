package Tema3Previo_Ejemplos;

import java.util.Scanner;

public class Ayuda14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un carácter: ");
		
		char c = (char)s.nextLine().charAt(0);
		
		int codigoAscii = (int)c;
		String respuesta;
		if((codigoAscii >=48 && codigoAscii <=57) ||
		   (codigoAscii >=65 && codigoAscii <=90) ||
		   (codigoAscii >=97 && codigoAscii <=122)) {
				respuesta= (c+ " es un carácter alfanumérico");
				if((codigoAscii >= 65 && codigoAscii <=90) ||
				   (codigoAscii >= 97 && codigoAscii <=122)){
						respuesta=respuesta + ", es una letra";
						if (codigoAscii >=65 && codigoAscii <=90)
							respuesta = respuesta + " y además está en mayúsculas";
						else 
							respuesta = respuesta + " y además esta en minúsculas";
				}
				else 
					respuesta = respuesta +  " y es un número";
		}
		else 
			respuesta= (c+ " NO es un carácter alfanumérico");
		System.out.println(respuesta);
	}
}

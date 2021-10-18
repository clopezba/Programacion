package Tema9Ej6;

import java.util.Scanner;

public class Ej6B {
		
		public static void enviarMensaje(String correo) throws DirCorreoIncorrectaException {
		
			int arroba = correo.indexOf('@');
			int punto = correo.indexOf('.');
			if (!correo.contains("@") || !correo.contains(".") || (arroba >= (punto-1))|| arroba == 0 || punto == correo.length()-1)
				throw new DirCorreoIncorrectaException();
			else
				System.out.println("Enviando el mensaje");
		}

	
		public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe la dirección de correo del destinatario:");
		String  correo = s.next();
		
		try {
			enviarMensaje(correo);
		} 
		catch (DirCorreoIncorrectaException e) {	
		System.out.println(e.getMessage());
		}
	}

}

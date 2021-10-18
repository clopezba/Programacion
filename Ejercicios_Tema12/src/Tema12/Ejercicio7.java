package Tema12;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		try {
			DataOutputStream salida = new DataOutputStream(new FileOutputStream("Ficheros\\Temperaturas.dat"));
			salida.writeUTF("10 Agosto 2019");
			
			for (int i = 0; i < 24; i++) {
				salida.writeInt(i);
				salida.writeDouble((Math.random()*10)+15);
			}
			
		
			salida.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
		}
		

	}

}

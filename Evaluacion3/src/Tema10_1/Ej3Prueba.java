package Tema10_1;

import java.util.Scanner;

public class Ej3Prueba {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cronometro c = new Cronometro();
		
		//Prueba con currentTimeMillis	
		c.inicioCrono();
		System.out.println("Pulsa una tecla + Intro para parar el cronómetro");
		String parar = s.next();
		c.finCrono();
		System.out.println("Han transcurrido " + c.tiempoTotalMicro() + " microsegundos");
		System.out.println("Han transcurrido " + c.tiempoTotalNano() + " nanosegundos");
	
		//Otra forma con nanoTime
		c.inicioNano();
		System.out.println("Pulsa una tecla + Intro para parar el cronómetro");
		parar = s.next();
		c.finNano();
		System.out.println("Han transcurrido " + c.totalMicro() + " microsegundos");
		System.out.println("Han transcurrido " + c.totalNano() + " nanosegundos");
	
		s.close();
	}

}

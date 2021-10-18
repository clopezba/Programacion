package Tema4;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int [] numAle = new int[20];
		for (int i=0; i<=numAle.length - 1; i++) {
			numAle[i] = ((int)(Math.random()*100));
			System.out.print(numAle[i] + " - ");
			
		}
	}

}

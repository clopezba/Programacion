package Tema4;

public class Ejercicio05 {

	public static void main(String[] args) {
		int [] num = new int[20];
		int [] cuad = new int[20];
		int [] cubo = new int[20];
		
		System.out.println("Num | Cuadrado | Cubo");
		for (int i=0; i<= num.length - 1; i++) {
			num[i] = ((int)(Math.random()*101));
			cuad[i] = (int)Math.pow(num[i], 2);
			cubo[i] = (int)Math.pow(num[i], 3);
			System.out.println(num[i] + "    " + cuad[i] + "    " + cubo[i]);
		}	
	}
}

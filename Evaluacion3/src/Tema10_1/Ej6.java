package Tema10_1;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//a-n�mero tel�fono nacional (9 d�gitos)
		System.out.println("N�mero de tel�fono:");
		String tlfn = s.next();
		
		if (tlfn.matches("\\d{9}"))
			System.out.println("V�lido");
		else
			System.out.println("Inv�lido");
		
		
		//b-n�mero tel�fono internacional ej. (+34)232356895
		System.out.println("N� tel�fono internacional:");
		String tlfInt = s.next();
		
		if (tlfInt.matches("\\(\\+\\d{2,3}\\)\\d{9}"))
			System.out.println("V�lido");
		else
			System.out.println("Inv�lido");
		
		
		//c-c�digo postal (5 d�gitos)
		System.out.println("C�digo postal:");
		String cp = s.next();
		
		if (cp.matches("\\d{5}"))
			System.out.println("V�lido");
		else
			System.out.println("Inv�lido");
		
		
		//d-fecha formato dd/mm/aaaa
		System.out.println("Fecha:");
		String fecha = s.next();
		
		if (fecha.matches("[0-3][0-9]/[0-1][0-9]/\\d{4}"))
			System.out.println("V�lida");
		else
			System.out.println("Inv�lida");
		
		s.close();
	}

}

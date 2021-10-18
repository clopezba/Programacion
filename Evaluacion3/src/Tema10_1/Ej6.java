package Tema10_1;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//a-número teléfono nacional (9 dígitos)
		System.out.println("Número de teléfono:");
		String tlfn = s.next();
		
		if (tlfn.matches("\\d{9}"))
			System.out.println("Válido");
		else
			System.out.println("Inválido");
		
		
		//b-número teléfono internacional ej. (+34)232356895
		System.out.println("Nº teléfono internacional:");
		String tlfInt = s.next();
		
		if (tlfInt.matches("\\(\\+\\d{2,3}\\)\\d{9}"))
			System.out.println("Válido");
		else
			System.out.println("Inválido");
		
		
		//c-código postal (5 dígitos)
		System.out.println("Código postal:");
		String cp = s.next();
		
		if (cp.matches("\\d{5}"))
			System.out.println("Válido");
		else
			System.out.println("Inválido");
		
		
		//d-fecha formato dd/mm/aaaa
		System.out.println("Fecha:");
		String fecha = s.next();
		
		if (fecha.matches("[0-3][0-9]/[0-1][0-9]/\\d{4}"))
			System.out.println("Válida");
		else
			System.out.println("Inválida");
		
		s.close();
	}

}

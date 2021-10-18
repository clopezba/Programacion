package soluciones;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tamanyo =5, minimo, maximo;
		String mensaje="";
		Scanner s = new Scanner(System.in);
		int []  n = new int[tamanyo];
		
		for (int i=0; i<n.length;i++) {
			System.out.println("Introduce el número: " + (i+1));
			n[i]= s.nextInt();			
		}
		minimo=n[0]; 
		maximo=n[0];
		for (int i=0; i<n.length;i++) {//Realmente empezamos en 1
				if (n[i]< minimo)
					minimo=n[i];
				if (n[i]> maximo)
					maximo=n[i];
		}
		for (int i=0; i<n.length;i++) {
			if (n[i]==maximo)
				mensaje=mensaje+" máximo";
			if (n[i]==minimo)
				mensaje=mensaje+"-minimo";
			System.out.println(n[i] + mensaje);
			mensaje="";
		}
	}

}

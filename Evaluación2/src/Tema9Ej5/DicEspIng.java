package Tema9Ej5;
import java.util.HashMap;
import java.util.Scanner;

public class DicEspIng {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("azul", "blue");
		dic.put("verde", "green");
		dic.put("rojo", "red");
		dic.put("amarillo", "yellow");
		dic.put("naranja", "orange");
		dic.put("morado", "purple");
		dic.put("rosa", "pink");
		dic.put("marron", "brown");
		dic.put("negro", "black");
		dic.put("blanco", "white");
		dic.put("gris", "grey");
		dic.put("violeta", "violet");
		dic.put("beige", "beige");
		dic.put("dorado", "gold");
		dic.put("plata", "silver");
		dic.put("salmon", "salmon");
		dic.put("ocre", "ochre");
		dic.put("turquesa", "turquoise");
		dic.put("fusia", "fuchsia");
		dic.put("carmesi", "crimson");

		//Recibe una palabra en esp y se muestra la traducción a ing
		System.out.println("Indica la palabra que quieres traducir: ");
		String palabra = s.next();
		System.out.println("La traducción es: ");
		System.out.println(palabra + " - " + dic.get(palabra));
		
		//5 palabras al azar, teclear traducción, comprobar aciertos/errores
		String array [] = new  String[dic.size()];
		
		int i= 0;
		for (String entrada: dic.keySet()) {
			array[i] = entrada;
			i++;
		}
		System.out.println("\n\nEscribe la traducción de las siguientes palabras:");
		
		int aciertos = 0, errores=0;
		for (int j = 0; j < 5; j++) {
			int p = (int)(Math.random()*dic.size());
			System.out.println(array[p] + " - ");
			String pal = s.next();
			if(pal.equals(dic.get(array[p])))
				aciertos++;
			else
				errores++;
		}
				
		System.out.println("Aciertos: " + aciertos);
		System.out.println("Errores: " + errores);
		
		s.close();
	}
	
}

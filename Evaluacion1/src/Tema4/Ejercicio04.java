package Tema4;

public class Ejercicio04 {

	public static void main(String[] args) {
		char [] caract = new char[10];
		caract[0]='a';
		caract[1]='x';
		caract[4]='@';
		caract[6]=' ';
		caract[7]='+';
		caract[8]='Q';
		
		for (int i=0; i<= caract.length - 1; i++)
			System.out.print(caract[i] + " - ");
		
		//Los elementos no incializados toman el valor de 
		//"espacio en blanco"
		
	}

}

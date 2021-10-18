package Tema13;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Introduce la base", JOptionPane.QUESTION_MESSAGE);
		while(!isDouble(base)) {
			base = JOptionPane.showInputDialog("N�mero inv�lido para la base. Int�ntelo otra vez", JOptionPane.QUESTION_MESSAGE);
		}
		double numBase = Double.parseDouble(base);
		
		String altura = JOptionPane.showInputDialog("Introduce la altura", JOptionPane.QUESTION_MESSAGE);
		while(!isDouble(altura)) {
			altura = JOptionPane.showInputDialog("N�mero inv�lido para la altura. Int�ntelo otra vez", JOptionPane.QUESTION_MESSAGE);
		}
		double numAlt = Double.parseDouble(altura);
		
		
		JOptionPane.showMessageDialog(null, "El �rea de la base " + base + " por la altura " + altura + " es " + ((numBase*numAlt)/2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	private static boolean isDouble(String n) {
		try {
			double num = Double.parseDouble(n);
			return true;
		}
		catch (NumberFormatException nfe){
			return false;
		}
		
	}

}

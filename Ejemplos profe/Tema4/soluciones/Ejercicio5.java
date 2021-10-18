package soluciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tamanyo =20;
		int []  numero = new int[tamanyo];
		int []  cuadrado= new int[tamanyo];
		int []  cubo= new int[tamanyo];
		for (int i=0; i<numero.length;i++) {
			numero[i]= (int) (Math.random()*101);
			cuadrado[i]= numero[i]*numero[i]; // o Math.pow...
			cubo[i]=numero[i]*numero[i]*numero[i]; // o Math.pow...
		}
		for (int i=0; i<numero.length;i++) {
			System.out.print(numero[i]+ " - "+ cuadrado[i]+ " - " + cubo[i]+"\n");
		}
	}

}

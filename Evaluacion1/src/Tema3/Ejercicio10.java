package Tema3;

public class Ejercicio10 {

	public static void numCubo(int num) {
				
		while (num < 1000) {
			int suma = 0;
			int aux = num;
			for (int i= 0; i<3; i++) {
				suma = suma + ((aux%10) * (aux%10) * (aux%10));
				aux = aux/10;
			}
			if (num == suma)
				System.out.print(num + " - ");
			num++;
		}
	}
	public static void main(String[] args) {
	int num = 100;	
	numCubo(num);
	}

}

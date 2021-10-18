package boletin3;
public class Ejercicio10 {
	public static void calculo(int x) {
	int cifra1=x/100, cifra2=((x/10)%10), cifra3=x%10;
	if (x == cifra1*cifra1*cifra1 + cifra2*cifra2*cifra2+cifra3*cifra3*cifra3)
		System.out.print(x + " - ");
	}
	public static void main(String[] args) {
		for (int i =100; i<1000; i++)
			calculo(i);	
	}

}

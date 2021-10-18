package Tema6;

import java.util.Scanner;

public class VentaEntradas {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion;
		
		Zona salaPrincipal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona(25);
				
		do {
			menu();
			do {
				System.out.println("Seleccione un opción del menú (1-3):");
				opcion = s.nextInt();
			}
			while(opcion < 1 || opcion > 3);
			System.out.println();
			
			switch(opcion) {
				case 1: 
					int entradasDisp = salaPrincipal.getEntradasPorVender() + compraVenta.getEntradasPorVender()
					+ vip.getEntradasPorVender();
					System.out.println("En total quedan " + entradasDisp + " entradas disponibles");
					System.out.println("=========================");
					System.out.println();
					break;
				case 2: 
					System.out.println("Indica la zona deseada: ");
					System.out.println("1. Sala principal");
					System.out.println("2. Compra-venta");
					System.out.println("3. Zona vip");
					int zona = s.nextInt();
					
					System.out.println("Indica el número de entradas deseadas:");
					int n = s.nextInt();
					
					if (zona == 1)
						salaPrincipal.vender(n);
					if (zona == 2)
						compraVenta.vender(n);
					if (zona == 3)
						vip.vender(n);
				
					System.out.println("=========================");
					System.out.println();
					break;
			}			
		}
		while (opcion != 3);
		System.out.println("Sesión finalizada");
	}
	private static void menu() {
		System.out.println("<< Venta de entradas >>");
		System.out.println(" 1. Mostrar número de entradas libres");
		System.out.println(" 2. Vender entradas");
		System.out.println(" 3. Salir");
	}
}

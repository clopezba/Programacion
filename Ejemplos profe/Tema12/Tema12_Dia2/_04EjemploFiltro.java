package Tema12_Dia2;

import java.io.*;
public class _04EjemploFiltro {
	public static void main(String[] args) {
		String nombreArchivo = "Ficheros\\ejemplo.txt";
		FileReader fr;
		BufferedReader filtro;
		String linea;
		try {
			fr = new FileReader(nombreArchivo);
			filtro=new BufferedReader(fr);
			linea=filtro.readLine();
			while (linea !=null) {
				System.out.println(linea);
				linea=filtro.readLine();
			}
		    filtro.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo para lectura");
	}
  }
}


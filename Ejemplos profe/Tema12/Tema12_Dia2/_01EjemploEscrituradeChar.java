package Tema12_Dia2;

// 23 enero 2020
// Alberto Carrera Mart�n
import java.io.*;

public class _01EjemploEscrituradeChar {
	public static void main(String[] args) throws IOException
	{
		if (args.length==0) {
			System.out.println("No has enviado ning�n argumento");
			System.exit(-1);
		}
		FileWriter fw = fw = new FileWriter(args[0]);
		fw.write('A'); fw.write('l');fw.write('b');fw.write('e');fw.write('r');fw.write('t');
		fw.write('o');fw.write(' ');fw.write('C');fw.write('a');fw.write('r');fw.write('r');
		fw.write('e');fw.write('r');fw.write('a');
		fw.close();
		
	}// del main
} // de la clase


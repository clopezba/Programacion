package Tema14_c;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.thoughtworks.xstream.XStream;

import Tema14.Departamentos;

public class EscribirDep {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream leerDat = new ObjectInputStream(new FileInputStream("Ficheros\\departamentos.dat"));
		ListaDepar lista= new ListaDepar(); 
		try {
			while(true) {
				Departamentos dep = (Departamentos) leerDat.readObject();
				lista.add(dep);
			}
		} catch (EOFException eof) {} 
		leerDat.close();
		try {
		XStream xstream = new XStream();
		xstream.alias("ListaDepartamentos", ListaDepar.class);
		xstream.alias("Departamento", Departamentos.class);
		xstream.addImplicitCollection(ListaDepar.class, "listaD");
		xstream.toXML(lista, new FileOutputStream("Ficheros\\departamentos2.xml"));
		}
		catch(Exception e){System.out.println(e.getMessage()); e.printStackTrace();}
	}

}

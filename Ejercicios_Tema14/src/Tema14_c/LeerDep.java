package Tema14_c;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import Tema14.Departamentos;

public class LeerDep {

	public static void main(String[] args) throws IOException {
		XStream xstream = new XStream();
		xstream.alias("ListaDepartamentos", ListaDepar.class);
		xstream.alias("Departamento", Departamentos.class);
		xstream.addImplicitCollection(ListaDepar.class, "listaD");
		
		ListaDepar lista = (ListaDepar)xstream.fromXML(new FileReader("Ficheros\\departamentos2.xml"));
		
		System.out.println("Número de departamentos: " + lista.getListaDep().size());
		
		List<Departamentos> listaDep = new ArrayList<Departamentos>();
		listaDep = lista.getListaDep();
		
		Iterator it = listaDep.listIterator();
		while(it.hasNext()) {
			Departamentos dep = (Departamentos)it.next();
			System.out.println("Nº Departamento: " + dep.getNumDepartamento() 
			+ ", nombre: " + dep.getNombre() + ", localidad: " + dep.getLocalidad());
		}
	}

}

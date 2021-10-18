package Tema14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearDepartamentos {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream depart = new ObjectOutputStream(new FileOutputStream ("Ficheros\\departamentos.dat"));
			Departamentos dep;
			String [] nombre = {"Finanzas", "Comercial", "Administración", "Recursos Humanos", "Contabilidad"};
			String [] localidad = {"Madrid", "Alcobendas", "Guadalajara", "Parla", "Alcorcón"};
			
			for (int i = 0; i < localidad.length; i++) {
				dep = new Departamentos(i+1, nombre[i], localidad[i]);
				depart.writeObject(dep);
			}
			depart.close();
		} 
		catch (FileNotFoundException e) {	} 
		catch (IOException e) {	} 

	}

}

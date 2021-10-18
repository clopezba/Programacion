package tema11;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {
		lista = new ArrayList<Multimedia>();
	}
	//Añadir objetos a la lista
	public void añadir(Multimedia m) {
		lista.add(m);
	}
	//Conocer tamaño de la lista
	public int tamaño() {
		return lista.size();
	}
	//Mostrar listaa por pantalla
	/*@Override
	public String toString() {
		return "ListaMultimedia \n----------------\n" + lista;
	}*/
	@Override
	public String toString() {
		String cad = "Elementos de la lista:\n";
		for(Multimedia m: lista)
			cad += m.toString() + "\n";
		return cad;
	}
	
	
	//Duración total de los elementos de la lista
	public double duracionTotal() {
		double durTotal=0;
		for (Multimedia m:lista)
			durTotal += m.getDuracion();
		return durTotal;
	}
	//Cuántos discos de genero
	public int numeroGenero(String genero) {
		int cont=0;
		for(Multimedia li: lista) {
			if(li instanceof Disco && ((Disco) li).getGenero().equalsIgnoreCase(genero))
				cont++;	
		}
		return cont;
	}
	//Películas sin actriz ppal
	public int noActriz() {
		int cont = 0;
		for(Multimedia lis: lista) {
			if(lis instanceof Pelicula && ((Pelicula) lis).getActrizPpal() == null)
				cont++;
		}
		return cont;
	}
	
}

package tema11;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {
		lista = new ArrayList<Multimedia>();
	}
	//A�adir objetos a la lista
	public void a�adir(Multimedia m) {
		lista.add(m);
	}
	//Conocer tama�o de la lista
	public int tama�o() {
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
	
	
	//Duraci�n total de los elementos de la lista
	public double duracionTotal() {
		double durTotal=0;
		for (Multimedia m:lista)
			durTotal += m.getDuracion();
		return durTotal;
	}
	//Cu�ntos discos de genero
	public int numeroGenero(String genero) {
		int cont=0;
		for(Multimedia li: lista) {
			if(li instanceof Disco && ((Disco) li).getGenero().equalsIgnoreCase(genero))
				cont++;	
		}
		return cont;
	}
	//Pel�culas sin actriz ppal
	public int noActriz() {
		int cont = 0;
		for(Multimedia lis: lista) {
			if(lis instanceof Pelicula && ((Pelicula) lis).getActrizPpal() == null)
				cont++;
		}
		return cont;
	}
	
}

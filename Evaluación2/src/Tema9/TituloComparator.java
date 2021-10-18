package Tema9;
import java.util.Comparator;
import Tema7.Libro;

public class TituloComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		
		return l1.dameTitulo().compareToIgnoreCase(l2.dameTitulo());
	}

}

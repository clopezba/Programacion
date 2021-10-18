package Tema9;
import java.util.Comparator;
import Tema7.Libro;

public class PaginasComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro lib1, Libro lib2) {
		
		return lib1.damePaginas()-lib2.damePaginas();
	}

}

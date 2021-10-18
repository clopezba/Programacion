package tema11_2;

import java.util.ArrayList;

public class PrestamoBiblioteca {

	public static void main(String[] args) {
		ArrayList<Biblioteca> biblio = new ArrayList<Biblioteca>();
		
		Libro l1 = new Libro(132, "Título 1", 1977);
		Libro l2 = new Libro(548, "título 2", 2011);
		Revista r1 = new Revista(4859, "Revista 1", 1968, 25);
		Revista r2 = new Revista(1569, "Revista 2", 2005, 48);
		
		biblio.add(l1);
		biblio.add(l2);
		biblio.add(r1);
		biblio.add(r2);
		
		l1.prestar();
		System.out.println(biblio.toString());
		System.out.println("-----------------");
		System.out.println("Libros prestados: " + cuentaPrestados(biblio));
		System.out.println("-----------------");
		System.out.println("Lecturas anteriores a 1980: " + publicacionesAnterioresA(biblio, 1980));
		
		

	}
	public static int cuentaPrestados(ArrayList<Biblioteca> lista) {
		int cont=0;
		for(Biblioteca b: lista) {
			if(b instanceof Libro && ((Libro) b).prestado())
					cont++;
		}
		return cont;
	}
	public static int publicacionesAnterioresA(ArrayList<Biblioteca> lista, int anyo) {
		int cont = 0;
		for(Biblioteca bi: lista)
			if(bi.getAnyoPubli()<anyo)
				cont++;
		return cont;
	}

	
}

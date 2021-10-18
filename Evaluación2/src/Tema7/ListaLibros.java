package Tema7;

public class ListaLibros {
	final static int MAX = 100;
	private Libro [] libros;
	private int cont =0;
	
	public ListaLibros() {
		libros = new Libro[MAX];
	}
	
	//Conocer número de libros
	public int numLibros() {
		return cont;
	}
	
	//Insertar libro por orden alfabético
	public boolean insertar(Libro l) {
		if(cont == MAX) return false;
		int i = 0;
		boolean encontrado = false;
		while (i<cont && !encontrado) {
			encontrado = libros[i].dameTitulo().toUpperCase().compareTo(l.dameTitulo().toUpperCase())>0;
			if(!encontrado) i++;
		}
		for (int j = cont; j > i; j--) 
			libros[cont] = libros[cont-1];
		libros[i]=l;
		cont++;
		return true;
	}
	
	//Eliminar libro de determinada posición
	public boolean eliminarLibro(int pos) {
		if (pos <1 || pos> cont || cont==0) return false;
		for (int i = pos; i < cont; i++) 
			libros[pos-1] = libros[pos];
		cont--;
		return true;
	}
	
	//Buscar libro por posición
	public Libro buscarPos(int pos) {
		if(pos<1 || pos>cont) return null;
		return libros[pos-1];
	}
	
	//Buscar libro por titulo
	public String buscarTitulo(String titulo) {
		String pos = "";
		for (int i = 0; i < cont; i++) {
			if(libros[i].dameTitulo().toUpperCase().contains(titulo.toUpperCase()))
				pos += i+1 + "\n";
		}
		if (pos == "") return "-1";
		return pos;
	}
	
	
	//Información de la lista
	public String listaInfo() {
		String info = "\n\nListado de libros:\n";
		for (int i = 0; i < cont; i++) 
			info += libros[i].toString() + "\n\n";
		return info;
	}
	
}

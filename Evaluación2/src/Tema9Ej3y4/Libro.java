
package Tema9Ej3y4;
import ejemplos.Persona;
import ejemplos.Fecha;

public class Libro {
	private String titulo;
	private Persona autor;
	private String isbn;
	private int paginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fechaEdic;
	
	//constructor libro completo
	public Libro(String titulo, Persona autor, String isbn, int paginas, int edicion, 
			String editorial, String lugar, Fecha fechaEdic) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fechaEdic = fechaEdic;
	}
	//constructor predeterminado
	public Libro() {
		
	}
	public String dameTitulo() {
		return titulo;
	}
	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Persona dameAutor() {
		return autor;
	}
	public void ponAutor(Persona autor) {
		this.autor = autor;
	}
	public String dameIsbn() {
		return isbn;
	}
	public void ponIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int damePaginas() {
		return paginas;
	}
	public void ponPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int dameEdicion() {
		return edicion;
	}
	public void ponEdicion(int edicion) {
		this.edicion = edicion;
	}
	public String dameEditorial() {
		return editorial;
	}
	public void ponEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String dameLugar() {
		return lugar;
	}
	public void ponLugar(String lugar) {
		this.lugar = lugar;
	}
	public Fecha dameFechaEdic() {
		return fechaEdic;
	}
	public void ponFechaEdic(Fecha fechaEdic) {
		this.fechaEdic = fechaEdic;
	}
	
	public String toString() {
		
		return "\nTitulo: " + titulo + "\n" + edicion +"a. edición" + "\nAutor: " + autor.dameApellidos()+ ", " + autor.dameNombre() + "\nISBN: " + isbn 
				+ "\n" + editorial + ", " + lugar + ", " + fechaEdic.dameLarga() + "\n" + paginas + " páginas"+"\n";
	}
	
	public void mostrarLibros() {
		System.out.println("\nTitulo: " + titulo + "\n" + edicion +"a. edición" + "\nAutor: " + autor.dameApellidos()+ ", " + autor.dameNombre() + "\nISBN: " + isbn 
				+ "\n" + editorial + ", " + lugar + ", " + fechaEdic.dameLarga() + "\n" + paginas + " páginas"+"\n");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + paginas;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (paginas != other.paginas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
}

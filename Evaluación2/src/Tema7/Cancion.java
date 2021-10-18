package Tema7;

public class Cancion {
	private String cancion;
	private String autor;
	
	public Cancion(String cancion, String autor) {
		this.cancion = cancion;
		this.autor = autor;
	}
	public Cancion() {
	}
	public String dameTitulo() {
		return cancion;
	}
	public void ponTitulo(String cancion) {
		this.cancion = cancion;
	}
	public String dameAutor() {
		return autor;
	}
	public void ponAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Cancion: " + cancion + "\nAutor: " + autor;
	}
	
	
}

package tema11;

public class Multimedia {

	private String titulo;
	private String autor;
	private String formato;
	private double duracion;
	
	
	//Constructor vacío
	public Multimedia() {
		
	}
	
	//Constructor parametrizado
	public Multimedia(String titulo, String autor, String formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	//Getters
	public String getTitulo() {return titulo;}

	public String getAutor() {return autor;}

	public String getFormato() {return formato;}

	public double getDuracion() {return duracion;}
	
	//Método para comparar objetos por título y autor
	public boolean equals(Multimedia m) {
		return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
	}

	@Override
	public String toString() {
		return "\nTítulo = " + titulo + ", \nAutor = " + autor + ", \nFormato = " + formato + ", \nDuracion = " + duracion;
	}
	
	
	
	
	
	
	
	
}

package tema11_2;

public class Biblioteca {
	private int codigo;
	private String titulo;
	private int anyoPubli;
	
	//Constructor parametrizado
	public Biblioteca(int codigo, String titulo, int anyoPubli) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyoPubli = anyoPubli;
	}
	//Getters
	public int getCodigo() {return codigo;}
	public int getAnyoPubli() {return anyoPubli;}
	
	//toString
	@Override
	public String toString() {
		return "\nCódigo: " + codigo + ", \nTítulo: " + titulo + ", \nAño publicación: " + anyoPubli;
	}
	
	
}

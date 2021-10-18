package tema11_3;

import tema11.Disco;
import tema11_2.Prestable;

public class DiscoPrestable extends Disco implements Prestable{
	private boolean prestado;

	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion, genero);
		prestado=false;
	}

	@Override
	public void prestar() {
		if(prestado==false)
			prestado = true;
		else
			System.out.println("Ya está prestado");
		
	}

	@Override
	public void devolver() {
		if(prestado==true)
			prestado=false;
		else
			System.out.println("El disco no estaba prestado");
		
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	
	
}

package tema11_3;
import java.util.ArrayList;

import tema11.Disco;

public class PruebaPrestamoDisco {

	public static void main(String[] args) {
		ArrayList<Disco> disc = new ArrayList<Disco>();
		
		DiscoPrestable cdp1 = new DiscoPrestable("Título 1", "Autor 1", "mp3", 60, "pop");
		DiscoPrestable cdp2 = new DiscoPrestable("Título 2", "Autor 2", "wav", 48, "pop");
		DiscoPrestable cdp3 = new DiscoPrestable("Título 3", "Autor 3", "mp3", 72, "rock");
		
		disc.add(cdp1);
		disc.add(cdp2);
		disc.add(cdp3);
		
		cdp2.prestar();
		cdp3.prestar();
		System.out.println("Discos prestados: " + cuentaPrestados(disc));
		
	}
	
	public static int cuentaPrestados(ArrayList<Disco> disc) {
		int cont = 0;
		for(Disco cd: disc)
			if(((DiscoPrestable) cd).prestado()==true)
				cont++;
				
		return cont;
	}
}

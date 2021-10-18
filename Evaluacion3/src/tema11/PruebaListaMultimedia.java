package tema11;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		//Crear lista multimedia
		ListaMultimedia listaM = new ListaMultimedia();
		
		//Crear 3 discos y a�adir a la lista
		Disco cd1 = new Disco("T�tulo 1", "Autor 1", "mp3", 59.15, "rock");
		Disco cd2 = new Disco("T�tulo 2", "Autor 2", "mp3", 52.20, "funk");
		Disco cd3 = new Disco("T�tulo 3", "Autor 3", "wav", 50.50, "rock");
		listaM.a�adir(cd1);
		listaM.a�adir(cd2);
		listaM.a�adir(cd3);
		
		//Crear 3 pel�culas y a�adir a la lista
		listaM.a�adir(new Pelicula("Pel�cula 1", "AutorPeli 1", "avi", 120, "Actor 1", null));
		listaM.a�adir(new Pelicula("Pel�cula 2", "AutorPeli 2", "mpeg", 150, "Actor 2", null));
		listaM.a�adir(new Pelicula("Pel�cula 3", "AutorPeli 3", "avi", 110, "Actor 3", "Actriz 3"));
		
		//Mostrar lista por pantalla
		System.out.println(listaM.toString());
		
		//Duraci�n total
		System.out.println("\n\nDuraci�n total: " + listaM.duracionTotal());
		
		//Discos rock
		System.out.println("\nDiscos de rock: " + listaM.numeroGenero("Rock"));
		
		//N�mero pel�culas sin actriz principal
		System.out.println("\nPel�culas sin actriz principal: " + listaM.noActriz());
		
		
	}

}

package tema11;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		//Crear lista multimedia
		ListaMultimedia listaM = new ListaMultimedia();
		
		//Crear 3 discos y añadir a la lista
		Disco cd1 = new Disco("Título 1", "Autor 1", "mp3", 59.15, "rock");
		Disco cd2 = new Disco("Título 2", "Autor 2", "mp3", 52.20, "funk");
		Disco cd3 = new Disco("Título 3", "Autor 3", "wav", 50.50, "rock");
		listaM.añadir(cd1);
		listaM.añadir(cd2);
		listaM.añadir(cd3);
		
		//Crear 3 películas y añadir a la lista
		listaM.añadir(new Pelicula("Película 1", "AutorPeli 1", "avi", 120, "Actor 1", null));
		listaM.añadir(new Pelicula("Película 2", "AutorPeli 2", "mpeg", 150, "Actor 2", null));
		listaM.añadir(new Pelicula("Película 3", "AutorPeli 3", "avi", 110, "Actor 3", "Actriz 3"));
		
		//Mostrar lista por pantalla
		System.out.println(listaM.toString());
		
		//Duración total
		System.out.println("\n\nDuración total: " + listaM.duracionTotal());
		
		//Discos rock
		System.out.println("\nDiscos de rock: " + listaM.numeroGenero("Rock"));
		
		//Número películas sin actriz principal
		System.out.println("\nPelículas sin actriz principal: " + listaM.noActriz());
		
		
	}

}

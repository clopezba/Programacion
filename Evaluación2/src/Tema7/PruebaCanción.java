package Tema7;

public class PruebaCanción {

	public static void main(String[] args) {
		Cancion c1 = new Cancion("Entre poetas y presos", "La Raíz");
		Cancion c2 = new Cancion("Rueda la corona", "La Raíz");
		Cancion c3 = new Cancion("Human", "Rag'n'Bone");
		Cancion c4 = new Cancion("No", "Meghan Trainor");
		
		Cancion c5 = new Cancion();
		System.out.println(c3.dameTitulo());
		System.out.println(c2.dameAutor());
		c5.ponTitulo("La hoguera de los continentes");
		c5.ponAutor("La Raíz");
		
		System.out.println(c1 + "\n\n");
		System.out.println(c2 + "\n\n");
		System.out.println(c3 + "\n\n");
		System.out.println(c4 + "\n\n");
		System.out.println(c5 + "\n\n");
		
		CD cd1 = new CD();
		
		cd1.agrega(c1);
		cd1.agrega(c2);
		cd1.agrega(c5);
		System.out.println(cd1.numeroCanciones());
		System.out.println(cd1.dameCancion(2));
		System.out.println(cd1.grabaCancion(1, c3));
		System.out.println(cd1.elimina(3));
		System.out.println("\n" + cd1.datosCD());

	}

}

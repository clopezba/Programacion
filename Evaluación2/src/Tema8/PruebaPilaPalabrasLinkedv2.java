package Tema8;

public class PruebaPilaPalabrasLinkedv2 {

	public static void main(String[] args) {
		PilaPalabrasLinkedListv2 ppal = new PilaPalabrasLinkedListv2();
		//método para saber si está vacía
		System.out.println(ppal.pilaPalabrasVacia());
		
		
		//añadimos palabras a la pila
		ppal.apilarPalabra("En");
		ppal.apilarPalabra("un");
		ppal.apilarPalabra("lugar");
		ppal.apilarPalabra("de");
		ppal.apilarPalabra("la");
		ppal.apilarPalabra("Mancha");
		ppal.apilarPalabra("de");

		System.out.println(ppal.pilaPalabrasVacia());
		System.out.println(ppal);
		
		//Indica el último elemento de la pila
		System.out.println(ppal.obtenerPalabraCima());
		
		//Se elimina el último elemento de la pila y nos lo devuelve
		System.out.println(ppal.desapilarPalabra());
		System.out.println(ppal.desapilarPalabra());
		System.out.println(ppal);
	}

}

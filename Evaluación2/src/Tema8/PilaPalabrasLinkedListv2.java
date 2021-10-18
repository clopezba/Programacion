package Tema8;

import java.util.LinkedList;

//con los métodos exclusivos de LinkedList

public class PilaPalabrasLinkedListv2 {
	private LinkedList<String> pila;
	
	public PilaPalabrasLinkedListv2() {
		pila = new LinkedList<String>();
	}
	
	//apilar al final
	public boolean apilarPalabra (String palabra) {
		// return pila.add(palabra);
		pila.addLast(palabra); 
		return true; //o no poner esto y cambiar el método a void
	}	
	
	//elimina la última palabra y la muestra
	public String desapilarPalabra() {
		if (!pilaPalabrasVacia()) {
			return pila.removeLast();
		}
		else
			return "La pila está vacía";
	}
	
	public String obtenerPalabraCima() {
		if(!pilaPalabrasVacia())
			return pila.getLast();
		else
			return "";
		
	}
	
	public boolean pilaPalabrasVacia() {
		//if (pila.size() == 0); preguntando tamaño de la pila
		return pila.isEmpty();
		
	}
	@Override
	public String toString() {
		return "PilaPalabrasLinkedList [pila=" + pila + "]";
	}
	
	
}

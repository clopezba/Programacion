package Tema8;

import java.util.LinkedList;

//copia y pega de ArrayList Cambiando array por Linked
public class PilaPalabrasLinkedList {
	private LinkedList<String> pila;
	
	public PilaPalabrasLinkedList() {
		pila = new LinkedList<String>();
	}
	
	//apilar al final
	public boolean apilarPalabra (String palabra) {
		return pila.add(palabra); 
	}
	
	//elimina la última palabra y la muestra
	public String desapilarPalabra() {
		String aux;
		if (!pilaPalabrasVacia()) {
			aux = obtenerPalabraCima();
			pila.remove(pila.size()-1);
			return aux;
		}
		else
			return "La pila está vacía";
	}
	
	public String obtenerPalabraCima() {
		if (!pilaPalabrasVacia())
			return pila.get(pila.size()-1);
		else
			return "La pila está vacía";
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

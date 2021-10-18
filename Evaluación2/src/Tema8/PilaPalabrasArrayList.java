package Tema8;

import java.util.ArrayList;

//las pilas son FIFO (First In, First Out)
public class PilaPalabrasArrayList {
	private ArrayList<String> pila;
	
	public PilaPalabrasArrayList() {
		pila = new ArrayList<String>();
	}
	
	//apilar al final
	public boolean apilarPalabra (String palabra) {
		return pila.add(palabra); 
	}
	
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
		return "PilaPalabrasArrayList [pila=" + pila + "]";
	}
	
	
}

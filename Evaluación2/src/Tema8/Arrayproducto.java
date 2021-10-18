package Tema8;

import java.util.ArrayList;

public class Arrayproducto {
	private ArrayList<Producto> lista;
	
	
	public Arrayproducto() {
		lista = new ArrayList<Producto>();
	}
	//tamaño lista
	public int tamañoLista() {
		return lista.size();
	}
	//agregar un producto
	public boolean agregarProducto(Producto p) {
		return lista.add(p);
	}
		
	//buscar producto por posición
	public Producto buscarPosicion(int pos) {
		return lista.get(pos-1);
	}
		
	//buscar por código
	public Producto buscarCodigo(int cod) {
		int i =0;
		boolean encontrado = false;
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getCodigo() == cod)
				encontrado = true;
			else i++;				
		}
		if (encontrado) return lista.get(i);
		else
			return null;
	}
	
	
	//eliminar producto por código
	public String eliminarCodigo(int cod) {
		int i =0;
		boolean encontrado = false;
		String aux  ="";
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getCodigo() == cod) {
				encontrado = true;
				aux = "" + lista.get(i);
				lista.remove(i);
			}
			else i++;				
		}
		if (encontrado)
			return aux;
		else
			return "No se encuentra el producto";
	
	}
	//cambiar precio a producto (mediante código y nuevo precio)
	public boolean cambiarPrecio(int cod, double p) {
		int i =0;
		boolean encontrado = false;
		while (i < lista.size() && !encontrado) {
			if (lista.get(i).getCodigo() == cod)
				encontrado = true;
			else i++;				
		}
		if (encontrado) {
			lista.get(i).setPrecio(p); 
			return true;}
		else
			return false;
	}
	
		
	//imprimir lista
	public String imprimirLista() {
	    String cad = "\n" + lista.size() + " Elementos de la lista:\n\n";
	    for(int i = 0; i < lista.size(); i++)
	      cad += lista.get(i) + "\n";
	    return cad;
	  }
	
	
	
}

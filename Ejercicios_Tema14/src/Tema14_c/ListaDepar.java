package Tema14_c;

import java.util.ArrayList;
import java.util.List;

import Tema14.Departamentos;

public class ListaDepar {
	private List<Departamentos> listaD = new ArrayList<Departamentos>();
	public ListaDepar() {
	}
	public void add(Departamentos dep) {
		listaD.add(dep);
	}
	public List<Departamentos> getListaDep(){
		return listaD;
	}
}

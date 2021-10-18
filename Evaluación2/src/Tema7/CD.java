package Tema7;

public class CD {
	private final static int MAX=100;
	private Cancion [] canciones;
	private int cont = 0;
	
	
	public CD() {
		canciones = new Cancion[MAX];
	}

	//devuleve el valor del contador de canciones
	public int numeroCanciones() {
		return cont;
	}
	
	//devolver canción de la posición indicada
	public Cancion dameCancion(int pos) {
		if ((pos<1)||(pos>cont)) return null;
		return canciones[pos-1];
	}
	//sobreescribir canción
	public boolean grabaCancion(int pos, Cancion c) {
		if ((pos<1)||(pos>cont)) return false;
		canciones[pos-1] = c;
		return true;
	}
	//agregar canción al final del array
	public boolean agrega(Cancion c) {
		if (cont == MAX) return false;
		canciones[cont]=c;
		cont++;
		return true;
	}
	//eliminar canción de posición indicada
	public boolean elimina(int pos) {
		if ((pos<1)||(pos>cont)||(cont==0)) return false;
		for (int i = pos; i < cont; i++) {
			canciones[i-1]=canciones[i];
		}
		cont--;
		return true;
	}

	public String datosCD() {
		String cd = "Canciones del cd: \n\n";
		for (int i = 0; i < cont; i++) {
			cd += canciones[i].toString() + "\n\n";
		}
		return cd;
	}
	
	
}

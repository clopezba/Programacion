package ejemplos;

// Lista.java: una lista de Personas

public class Lista {
  private final static int MAX = 100;
  private Persona _array[];
  private int _cont = 0; // Indica la primera posición libre
  // del array. Igual al número de elementos

  public Lista() {
    _array = new Persona[MAX];
  }

  public boolean llena() { return _cont == MAX; }

  public boolean vacia() { return _cont == 0; }

  public int length() { return _cont; }

  public boolean insertar(Persona p) {
  // Devuelve true si se inserta; false si lista llena
    if(_cont == MAX) return false;
    _array[_cont] = p;
    _cont++;
    return true;
  }

  public Persona recuperar(int pos) {
  // true si tiene éxito; false si posición no válida
  // pos variará de 1 al número de elementos
    if((pos < 1) || (pos > _cont)) return null;
    return _array[pos-1];
  }

  public String toString() {
    String cad = "Elementos de la lista:\n\n";
    for(int i = 0; i < _cont; i++)
      cad += _array[i].toString() + "\n";
    return cad;
  }
  // 
  // AÑADIDO
  //
  public boolean borrarPersonaPosicion(int pos) { // Borrar Persona por la POSICIÓN: La primera es la 1, .....
		if ((pos<1) || (pos>_cont) || (_cont==0)) return false;
	  	for (int i=pos;i<_cont;i++) 
	  		_array[i-1]=_array[i];
	  	_cont--;
	  	return true;
	  	
	}
  //
  public int buscarPorDni (long num) { // Busca Persona por DNI (-1 si no la encuentra)
		 for(int i = 0; i < _cont; i++) 
			 	if (_array[i].dameNif().dameDni()==num) 
			 			return i+1;
		 return -1;// No lo ha encontrado
  
  }
  //
  public boolean borrarPersonaPorDni(long num) { // Borrar Persona por su Dni
		int posNumeroPersona = buscarPorDni(num);
		if (posNumeroPersona!=-1)
			return borrarPersonaPosicion(posNumeroPersona);
		else
			return false;
	
	}
  //Otra forma, UNA SOLA LÍNEA: return borrarPersonaPosicion(buscarPorDni(num));
	// 
  
  public String buscarPorApellido (String apellido) { // Buscar Personas por Apellido
	  String encontrados=""; 
	  for(int i = 0; i < _cont; i++) 
			 	if (_array[i].dameApellidos().toUpperCase().contains(apellido.toUpperCase()))
			 			encontrados=encontrados + _array[i] + "\n";
		 return encontrados;

}
  public Persona[] buscarPorApellido2 (String apellido) { // Buscar Personas por Apellido
	  Persona[] encontrados = new Persona[_cont];
	  int indice=0;
	  for(int i = 0; i < _cont; i++) 
			 	if (_array[i].dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
			 		encontrados[indice]=_array[i];
			 		indice ++;
			 	}
			 			
	  return encontrados;
}
  
}// de la clase lista
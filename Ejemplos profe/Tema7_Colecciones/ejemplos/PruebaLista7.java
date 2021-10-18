package ejemplos;

// PRUEBA DE BUSQUEDA POR APELLIDOS pero UTILIZANDO UN ARRAY

public class PruebaLista7 {
  public static void main(String args[]) {
    
    Lista lista = new Lista();
    lista.insertar(new Persona(1234567, 31, "Luis", "Aldea Navarro"));
    lista.insertar(new Persona(2345678, 39, "Belén", "Carrera Sausán"));
    lista.insertar(new Persona(3456789, 61, "Antonino", "Lasierra Gardena"));
    lista.insertar(new Persona(4567890, 42, "Alberto", "Carrera Martín"));
    lista.insertar(new Persona(5678901, 38, "Ana", "Ereza Ferrer"));
    lista.insertar(new Persona(6789012, 37, "Ana", "Galán Latorre"));
    Persona [] encontrados = new Persona[lista.length()];
    //
    encontrados=lista.buscarPorApellido2("laa");
    if (encontrados[0]==null)
    	System.out.println("No hay nadie con ese apellido");
    else {
    	int i=0;
    	while (encontrados[i]!=null) {
    		System.out.println(encontrados[i]);
    		i++;
    	}
    }
    	
    	
    
    
    
    
  }
}
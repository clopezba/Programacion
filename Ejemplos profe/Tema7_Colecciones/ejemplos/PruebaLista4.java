package ejemplos;

// PRUEBA DE BUSQUEDA POR DNI

public class PruebaLista4 {
  public static void main(String args[]) {
    
    Lista lista = new Lista();
    lista.insertar(new Persona(1234567, 31, "Luis", "Aldea Navarro"));
    lista.insertar(new Persona(2345678, 39, "Belén", "Carrera Sausán"));
    lista.insertar(new Persona(3456789, 61, "Antonino", "Lasierra Gardena"));
    lista.insertar(new Persona(4567890, 42, "Alberto", "Carrera Martín"));
    lista.insertar(new Persona(5678901, 38, "Ana", "Ereza Ferrer"));
    lista.insertar(new Persona(6789012, 37, "Ana", "Galán Latorre"));
    
    System.out.println(lista.buscarPorDni(4567890));
    System.out.println(lista.recuperar(lista.buscarPorDni(4567890)));
    //
    //  o también
    //  int pos = lista.buscarPorDni(4567890);
    //  System.out.println(lista.recuperar(pos));
    
    
    
  }
}
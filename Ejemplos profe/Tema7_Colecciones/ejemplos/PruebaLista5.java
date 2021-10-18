package ejemplos;

// PRUEBA DE BORRADO por DNI

public class PruebaLista5 {
  public static void main(String args[]) {
    
    Lista lista = new Lista();
    lista.insertar(new Persona(1234567, 31, "Luis", "Aldea Navarro"));
    lista.insertar(new Persona(2345678, 39, "Belén", "Carrera Sausán"));
    lista.insertar(new Persona(3456789, 61, "Antonino", "Lasierra Gardena"));
    lista.insertar(new Persona(4567890, 42, "Alberto", "Carrera Martín"));
    lista.insertar(new Persona(5678901, 38, "Ana", "Ereza Ferrer"));
    lista.insertar(new Persona(6789012, 37, "Ana", "Galán Latorre"));
    lista.borrarPersonaPorDni(2345678);
    System.out.println(lista.length());
    System.out.println(lista);
    
  }
}
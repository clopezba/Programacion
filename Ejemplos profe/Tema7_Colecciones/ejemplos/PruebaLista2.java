package ejemplos;

// ¿Qué cambia?

public class PruebaLista2 {
  public static void main(String args[]) {
    
    Lista lista = new Lista();
    lista.insertar(new Persona(435762, 31, "Javier", "Hernandez Perez"));
    lista.insertar(new Persona(1234567, 23, "Juan", "Lopez Segura"));
    lista.insertar(new Persona(435762, 31, "Javier", "Hernandez Perez"));
    System.out.println(lista);
    Persona per1 = lista.recuperar(1);
    per1.ponNombre("Pedro");
    System.out.println(lista);
  }
}
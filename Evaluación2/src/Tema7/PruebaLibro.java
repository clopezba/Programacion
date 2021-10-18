
package Tema7;
import ejemplos.Persona;
import ejemplos.Fecha;

public class PruebaLibro {

	public static void main(String[] args) {
		Libro l1 = new Libro();
		
		Persona p1 = new Persona(41256984, 35, "Marçia", "General");
		Fecha f1 = new Fecha(12,05,2010);
		l1.ponAutor(p1);
		l1.ponLugar("Cuenca (ESP)");
		l1.ponEdicion(2);
		l1.ponEditorial("Mi casa");
		l1.ponIsbn("465-FE54-54");
		l1.ponPaginas(584);
		l1.ponTitulo("Mi mejor libro");
		l1.ponFechaEdic(f1);
		
		//System.out.println(l1);
		
		Persona p2 = new Persona();
		p2.ponApellidos("Liang");
		p2.ponNombre("Y. Daniel");
		Fecha f2 = new Fecha(16, 11, 2001);
		Libro l2 = new Libro("Introduction to Java Programming", p2, "0-13-031997-X",
				784, 3, "Prentice-Hall", "New Jersey (USA)", f2);
		
		//System.out.println(l2);
		
		ListaLibros ls1 = new ListaLibros();
		ls1.insertar(l1);
		ls1.insertar(l2);
		System.out.println(ls1.numLibros());
		System.out.println(ls1.listaInfo());
		ls1.eliminarLibro(1);
		
		System.out.println(ls1.buscarTitulo("java"));
		System.out.println(ls1.buscarPos(1));	
		
	}

}

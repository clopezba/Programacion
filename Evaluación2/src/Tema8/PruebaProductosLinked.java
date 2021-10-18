package Tema8;

public class PruebaProductosLinked {

	public static void main(String[] args) {
		LinkedProducto prod = new LinkedProducto();
		
		System.out.println(prod.tamañoLista());
		Producto p1 = new Producto(12584, "Cerillas", "Encendedor", 5.25, 50);
		Producto p2 = new Producto(15423, "Mechero", "Encendedor", 5.75, 28);
		Producto p3 = new Producto(48596, "Lanzallamas", "Encendedor", 27.80, 17);
		
		prod.agregarProducto(p1);
		prod.agregarProducto(p3);
		System.out.println(prod.tamañoLista());
		
		System.out.println(prod.buscarPosicion(1));
		System.out.println(prod.buscarCodigo(48596) + "\n");
		
		System.out.println(prod.eliminarCodigo(12584));
		
		System.out.println(prod.imprimirLista());
		prod.agregarProducto(p2);
		prod.cambiarPrecio(15423, 5.00);
		System.out.println(prod.imprimirLista());

	}

}

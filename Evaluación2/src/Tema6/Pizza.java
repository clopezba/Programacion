package Tema6;

public class Pizza {
	private String tama�o;
	private String tipo;
	private String estado = "pedida";
	public static int totalPedidas = 0;
	public static int totalServidas = 0;
		
	public Pizza(String tipo, String tama�o) {
		this.tipo = tipo;
		this.tama�o = tama�o;
		totalPedidas++;
	}
		
	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public void sirve() {
		if (estado.equals("pedida")) {
			estado = "servida";
			totalServidas++;
		}
		else if (estado.equals("servida"))
			System.out.println("esa pizza ya se ha servido");
	}
	public static int getTotalServidas() {
		return totalServidas;
	}

	@Override
	public String toString() {
		return ("Pizza " + tipo + " " + tama�o + ", " + estado);
	}

	
		
	
}

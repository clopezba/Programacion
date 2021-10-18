package Tema6;

public class Caballos {
	private String nombre;
	private String raza;
	private String disciplina;
	private double peso;
	private double velocidad;
	private boolean gana = false;
	
	//constructor vacío
	public Caballos() {
		
	}
	//contructor
	public Caballos(String nom, String raz, String disc, double pes, double vel) {
		nombre = nom;
		raza = raz;
		disciplina = disc;
		peso = pes;
		velocidad = vel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nom) {
		nombre = nom;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raz) {
		raza = raz;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disc) {
		disciplina = disc;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double pes) {
		peso = pes;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double vel) {
		velocidad = vel;
	}
	public boolean isGana() {
		return gana;
	}
	public void carreraContra(Caballos contrincante) {
		if (disciplina.equals("carrera") && (contrincante.getDisciplina()!= "carrera")) {
			gana=true;
			System.out.println("¡Ha ganado!");
		}
		else {
			gana=false;
			System.out.println("Oh... Ha perdido");
		}
	}
	public void circuitoContra(Caballos contrincante) {
		if (disciplina.equals("obstáculos") && (contrincante.getDisciplina()!= "obstáculos")) {
			gana=true;
			System.out.println("¡Ha ganado!");
		}
		else {
			gana=false;
			System.out.println("Oh... Ha perdido");
		}
	}
	public void galopa() {
		System.out.println("Tocotó tocotó tocotó");
	}
	public void come(String comida) {
		if (comida.equals("zanahoria"))
			System.out.println("Mmm...deliciosa");
		if (comida.equals("terrón"))
			System.out.println("¡Mi favorito!");
		if (comida.equals("heno"))
			System.out.println("¿No había nada mejor para comer?");
	}
	
	@Override
	public String toString() {
		return "Caballos [nombre=" + nombre + ", raza=" + raza + ", disciplina=" + disciplina + ", peso=" + peso
				+ ", velocidad=" + velocidad + ", gana=" + gana + "]";
	}
	
	
	
	
	
}

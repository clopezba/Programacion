package Tema10_1;

public class Cronometro {

	private long tInicio = 0; 
	private long tFin = 0;
	
	//Método para contar los microsegundos transcurridos
	public void inicioCrono(){
		tInicio = System.currentTimeMillis();
	}
	public void finCrono() {
		tFin = System.currentTimeMillis();
	}
	public long tiempoTotalMicro() {
		return (tFin - tInicio)*1000;
	}
	//Método para contar los nanosegundos transcurridos 
	public long tiempoTotalNano() {
		return (tFin - tInicio)*1000000;
	}
	
	//Otra forma
	public void inicioNano() {
		tInicio = System.nanoTime();
	}
	public void finNano() {
		tFin = System.nanoTime();
	}
	public long totalNano() {
		return tFin - tInicio;
	}
	public long totalMicro() {
		return (tFin-tInicio)/1000;
	}
	
	
}

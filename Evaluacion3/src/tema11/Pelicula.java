package tema11;

public class Pelicula extends Multimedia{
	private String actorPpal;
	private String actrizPpal;
	
	public Pelicula(String titulo, String autor, String formato, double duracion, String actorPpal, String actrizPpal) {
		super(titulo, autor, formato, duracion);
		this.actorPpal = actorPpal;
		this.actrizPpal = actrizPpal;
		if(actorPpal == null && actrizPpal == null)
			throw new IllegalArgumentException("No pueden quedar nulos los dos actores ppales");
	}

	public String getActorPpal() {return actorPpal;}

	public String getActrizPpal() {return actrizPpal;}

	@Override
	public String toString() {
		return "\nPelicula: " + super.toString() + ", \nActorPpal = " + actorPpal + ", \nactrizPpal = " + actrizPpal;
	}
	
	
	
	
	
	
}

package praticaFusion;
public class Mascota {
	
	private String nombre;
	private double peso;
	public Mascota(String nombre) {
		this.nombre = nombre;

	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Hola equipo!, Soy " + this.nombre + " y te voy a contar algo o no");
	}

}

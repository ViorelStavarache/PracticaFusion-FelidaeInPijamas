package praticaFusion;

public class Marmota {

	private String color;


	public Marmota(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void MandarMensaje() {
		
		System.out.println("Soy " + super.getNombre() + " y soy una marmota y me gusta dormir mucho zZzZzZzZzZzZ");
	}
	
}

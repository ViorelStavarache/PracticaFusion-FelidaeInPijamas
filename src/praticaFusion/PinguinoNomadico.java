package praticaFusion;

public class PinguinoNomadico extends Mascota{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PinguinoNomadico(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	public void mandarMensaje() {
		System.out.println("Hola soy " + super.getNombre() + " feo");
	}
}

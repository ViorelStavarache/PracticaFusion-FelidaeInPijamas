package praticaFusion;

public class PinguinoNomadico extends Mascota{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PinguinoNomadico(String nombre, String color,int patas) {
		super(nombre);
		this.color = color;
		this.setPatas(patas);
		
	}
	public void mandarMensaje() {
		System.out.println("Hola soy " + super.getNombre() + " feo y tengo " + super.getPatas() + " patas");
	}
}

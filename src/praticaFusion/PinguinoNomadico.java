package praticaFusion;

public class PinguinoNomadico extends Mascota{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PinguinoNomadico(String nombre, String sexo, String color) {
		super(nombre, sexo);
		this.color = color;
	}

}

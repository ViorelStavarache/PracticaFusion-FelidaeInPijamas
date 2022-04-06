package praticaFusion;

public class Marmota extends Mascota{

	private String color;


	public Marmota(String nombre, String sexo, String color) {
		super(nombre, sexo);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}

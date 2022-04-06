package praticaFusion;

public class Gato extends Mascota{

	// Atr
	
	private boolean likeWater;
	private int eye;
	private String color;

	// Con
	
	public Gato(String nombre, String sexo, boolean water, int eye, String color) {
		super(nombre, sexo);
		this.likeWater = water;
		this.eye = eye;
		this.color = color;
	}

	// S&G
	
	public boolean isLikeWater() {
		return likeWater;
	}

	public void setLikeWater(boolean likeWater) {
		this.likeWater = likeWater;
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void send() {
		System.out.println("Soy " + this.getColor() + " y el agua es " + this.isLikeWater() + " y tengo " + 
				this.eye + " ojos");
	}
	
}

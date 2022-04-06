package praticaFusion;
public class Mascota {
	
	private String nombre;
	private int patas;
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public Mascota(String nombre) {
		this.nombre = nombre;

	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre,int patas) {
		this.nombre = nombre;
		this.setPatas(patas);
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no");
	}

}

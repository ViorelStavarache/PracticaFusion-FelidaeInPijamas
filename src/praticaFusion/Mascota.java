package praticaFusion;
public class Mascota {
	
	private String sexo;
	private String nombre;
	
	public Mascota(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;

	}
	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no, mi sexo es " + this.sexo);
	}

}

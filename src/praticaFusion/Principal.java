package praticaFusion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato animal = new Gato("Miriam", "Hembra", false, 2, "Blanca");
		animal.MandarMensaje();
		
		Marmota marmo = new Marmota("Haku", "Hembra", "Marron");
		marmo.MandarMensaje();
		
		PinguinoNomadico pinguino = new PinguinoNomadico("Manuel", "Hembra", "verde");
		pinguino.MandarMensaje();

	}

}

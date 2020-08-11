enum Transporte {
	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);

	private int Velocidad;

	private Transporte(int s) {
		Velocidad = s;

	}

	public int getVelocidad() {
		return Velocidad;
	}

}

public class Enumerador {

	public static void main(String[] args) {
		Transporte tp;
		System.out.println(
				"La velocidad tipica para un avion es: " + Transporte.AVION.getVelocidad() + " millas por hora.\n");

		System.out.println("Todas las velocidades de transporte: ");
		for (Transporte t : Transporte.values())
			System.out.println(t + ": velocidad tipica es " + t.getVelocidad() + " millas por hora.");

	}

}
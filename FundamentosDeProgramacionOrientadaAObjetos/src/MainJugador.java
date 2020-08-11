public class MainJugador {

	public static void main(String[] args) {
		Jugador j1 = new Jugador();
		j1.nombre = "Silius";
		
		Jugador j2 = new Jugador();
		j2.nombre = "Cesar";
		
		System.out.println(" Vida j1: " + j1.vida);
		System.out.println(" Vida j2: " + j2.vida);
		
		j1.golpear (j2);
		System.out.println(" Vida j1: " + j1.vida);
		System.out.println(" Vida j2: " + j2.vida);
		
		
		

	}

}
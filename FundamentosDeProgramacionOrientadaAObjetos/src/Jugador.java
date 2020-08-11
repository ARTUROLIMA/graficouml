
public class Jugador {
	public String nombre;
	public int vida = 5;
	private int localizacion;
	private int  [] inventario = new int  [12];
	
	public void AtaqueRecibido() {
		if(vida>0)
		vida = vida -1; 
		else
		System.out.println("El jugador esta murido");
	}
	
	public void saltar() {
		System.out.println("Saltando");
	}
	public void mover() {
		System.out.println("Moviendo");
	}
	public void golpear(Jugador jugador) {
		jugador.AtaqueRecibido();
		System.out.println("Golpenado al jugador" + jugador.nombre);
	}
	public void nadar() {
		System.out.println("Nadando");
	}

	

}
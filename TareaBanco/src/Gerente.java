public class Gerente extends Empleados {
	public Gerente(String nombre, int numeroIdentifi, int codigoArea, int sueldo) {
		super(nombre, numeroIdentifi, codigoArea, sueldo);
	}

	public void Sueldo(double sueldo) {
		
		this.sueldo=sueldo+(sueldo*((getAño()*0.05))+getBono());
		
}
}


public class Supervisores extends Empleados{
	public Supervisores(String nombre, int numeroIdentifi, int codigoArea, int sueldo) {
		super(nombre, numeroIdentifi, codigoArea,sueldo);
	}

	public void Sueldo(double salario) {
		this.sueldo+=(sueldo*(getAño()*0.05));
	}

}

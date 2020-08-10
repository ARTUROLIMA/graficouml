public abstract class Empleados extends Main1{
	String nombre;
	int numeroIdentifi;
	int codigoArea;
	double sueldo, año, bono;

	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumeroIdentifi() {
		return numeroIdentifi;
	}



	public void setNumeroIdentifi(int numeroIdentifi) {
		this.numeroIdentifi = numeroIdentifi;
	}



	public int getCodigoArea() {
		return codigoArea;
	}



	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}




	public double getAño() {
		return año;
	}



	public void setAño(double año) {
		this.año = año;
	}



	public double getBono() {
		return bono;
	}



	public void setBono(double bono) {
		this.bono = bono;
	}


	
	public Empleados(String nombre, int numeroIdentifi, int codigoArea, int sueldo2) {
	
	}


	public abstract void Sueldo(double sueldo);

}

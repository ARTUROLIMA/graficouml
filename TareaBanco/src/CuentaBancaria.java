import java.util.Scanner;
public abstract class CuentaBancaria {
	
	private String propietario;
	protected double saldo;
	
	public String getPropietario() {
	return  propietario;
}
	
public void setPropietario(String propirtario) {
	this.propietario = propietario;
}



public double getSaldo() {
	return saldo;
}

public abstract void deposito(double dinero);

public void retiro(double dinero) {
	saldo -= dinero;
}


}
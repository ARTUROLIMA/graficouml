
public class CuentaCorriente extends CuentaBancaria {

	
	public void deposito(double dinero) {
		double unoPorCiento = 0;
		if(dinero <= 1000){
			unoPorCiento = dinero*0.01;
		}
		
		double totalDeposito = dinero + unoPorCiento;
//		this.saldo += totalDeposito;

	//super.deposito(totalDeposito);

}

	}


public class CuentaAhorro extends CuentaBancaria {

	@Override
	public void deposito(double dinero) {
	
double totalDeposito = dinero < 1000 ? dinero +  dinero * 0.02 : dinero;

this.saldo += totalDeposito;
//super.deposito(totalDeposito);
}
public void imprimerSaldo() {
	System.out.println("Saldo: " + getSaldo());

}

}


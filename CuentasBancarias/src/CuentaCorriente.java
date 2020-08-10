public class CuentaCorriente extends CuentaBancaria {
	double aumentoCc = 0;
	public void deposito(double dinero) {
		
		if(dinero <= 1000) {
			aumentoCc = (dinero*0.01);
			saldo +=(dinero +aumentoCc);
			
		}else {
			saldo+= dinero;
		}	
		}
}
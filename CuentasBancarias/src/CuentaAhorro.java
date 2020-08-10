public class CuentaAhorro extends CuentaBancaria {
	double aumentoCa = 0;
	public void deposito(double dinero) {
		
		if(dinero < 1000) {
			aumentoCa = dinero*0.02;
			saldo +=(dinero + aumentoCa);
		
		}else {
			saldo+= dinero;
		}	
		}
}
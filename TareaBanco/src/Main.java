
public class Main {
public static void multiplesDeposito(CuentaBancaria cta) {
if(cta instanceof CuentaAhorro) {
	cta.deposito(100);
	cta.deposito(200);
	cta.deposito(300);
}
}
	public static void main(String[] args) {
		CuentaBancaria cta1 = new CuentaAhorro();
		CuentaBancaria cta2 = new CuentaCorriente();
		
		
		cta1.deposito(800);
		cta2.deposito(500);
		
		//multiplesDeposito(cta1);
		//multiplesDeposito(cta2);
		
		//cata1.imprimerSaldo();
		
		//System.out.println(cta1 instanceof CuentaBancaria);
		System.out.println(cta1.getSaldo());
		System.out.println(cta2.getSaldo());
}
}

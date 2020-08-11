import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		CuentaCorriente cta1 = new CuentaCorriente();
		CuentaCorriente cta2 = new CuentaCorriente();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresar cantidad de deposito para cta1");
		double dinero =in.nextDouble();
		cta1.depositar(dinero);
		
		System.out.println("Ingresar cantidad de deposito para cta2");
		dinero =in.nextDouble();
		cta2.depositar(dinero);
		
		System.out.println("Saldo cta1: "+ cta1.getSaldo());
		System.out.println("Saldo cta2: "+ cta2.getSaldo());
		/*
		double r = 100;
		cta1.depositar(r);
		cta1.depositar(200);
		System.out.println(cta1.getSaldo());
		*/
		

	}

}
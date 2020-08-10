import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	CuentaCorriente cuentaC = new CuentaCorriente(); 
	
	CuentaAhorro cuentaA = new CuentaAhorro();
	

	boolean salir = false;
	while(!salir) {
		System.out.println("       CUENTA BANCARIA ");
		System.out.println("\n     CARLOS ARTURO LIMA MEDINA ");
		System.out.println("\n   MENÚ  ");
		System.out.println("1. DEPOSITAR EN LA CUENTA CORRIENTE");
		System.out.println("2. RETIRAR DE LA CUENTA CORRIENTE ");
		System.out.println("3. DEPOSITAR EN LA CUENTA DE AHORRO ");
		System.out.println("4. RETIRAR DE LA CUENTA DE AHORRO");
		System.out.println("5. CONSULTAR SALDO TOTAL");
		System.out.println("6. SALIR ");
		System.out.println("\nDIGITE LA OPCIÓN PORFAVOR: ");
	
		
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		
		Scanner din = new Scanner(System.in);
		switch (opcion) {
		
		case 1 : System.out.println("CANTIDAD A DEPOSITAR EN CUENTA CORRIENTE: ");
		int dinero = din.nextInt(); 
		cuentaC.deposito(dinero);break;
		
		case 2 : System.out.println("CANTIDAD A RETIRAR EN CUENTA CORRIENTE: ");
		int dinero1 = din.nextInt(); 
		cuentaC.retiro(dinero1);break;
		
		case 3 : System.out.println("CANTIDAD A DEPOSITAR EN CUENTA DE AHORRO: ");
		int dinero2 = din.nextInt(); 
		cuentaA.deposito(dinero2);break;
		
		case 4 : System.out.println("CANTIDAD A RETIRAR EN CUENTA DE AHORRO: ");
		int dinero3 = din.nextInt(); 
		cuentaA.retiro(dinero3);break;
		
		case 5 :
			System.out.println("SALDO TOTAL DE LA CUENTA CORRIENTE: " + cuentaC.getSaldo());
			System.out.println("SALDO TOTAL DE LA CUENTA DE AHORRO: " + cuentaA.getSaldo());
			
		case 6 :
			salir = true;break;
			
		default:
			System.out.println("\nOPCIÓN INCORRECTA ");
	
        }
	}
	
	}

}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main1 {

	public static double  diaDePago(ArrayList<Empleados>empleados) {
		double sueldo=0;
		for(int i = 0; i<empleados.size();i++) {
			Empleados empleado1 = empleados.get(i);
			sueldo +=empleado1.getSueldo();
		}
		return sueldo;
	}

	public static void main(String[] args) {
		double sueldo, año, bono;
		ArrayList<Empleados>empleados = new ArrayList<>();

		System.out.println("SALARIO :");
		Scanner entrada = new Scanner(System.in);
		sueldo = entrada.nextInt();
		Scanner in = new Scanner(System.in);
		
		System.out.println("AÑOS DE SERVICIO :");
		Scanner entrada1 = new Scanner(System.in);
		año = entrada.nextInt();
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("BONO EXTRA:");
		Scanner entrada2 = new Scanner(System.in);
		bono = entrada.nextInt();
		Scanner in2 = new Scanner(System.in);
		
		
		
		System.out.println(diaDePago(empleados));
		
	}
	
}
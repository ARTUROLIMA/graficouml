import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {

		int numero;
		
		//Ingresar nùmero 
		System.out.println("Leer nùmero: ");
		Scanner in = new Scanner(System.in);
		numero = in.nextInt(); 
		
		if(numero%2==0)  {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
		
		String result = "" + numero;
	    result = Integer.toString(numero);   

	}
	
	
}
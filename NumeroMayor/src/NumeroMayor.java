import java.util.Scanner;
public class NumeroMayor {

	public static void main(String[] args) {
				int n1 = 100;
				int n2 = 50;
				int n3 = 10;
				
				String mensaje = "";
				
				if((n1 > n2 && n1 > n3)) {
					mensaje = n1 + " es el mayor ";
					//System.out.println(n1 + " es el mayor");
			} else if(n2 > n1 && n2 > n3) {
				mensaje = n2 + " es el mayor";
				//System.out.println(n2 + "es el mayor");
			} else {
				mensaje =3 + " es el mayor";
				//System.out.println(n3 + " es el mayor ");
			}
			System.out.println(mensaje);

	}

}

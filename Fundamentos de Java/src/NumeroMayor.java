
public class NumeroMayor {

	public static void main(String[] args) {
		// Numero mayor entre tres numeros 
		
		int n1 = 15;
		int n2 = 11;
		int n3 = 12;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el mayor");
			//mensaje = n1 + " es el mayor";
		
		} else
			
		if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es el mayor");
			//mensaje = n2 + " es el mayor";
		} else {
			System.out.println(n3 + " es el mayor");
		    //mensaje = n3 + " es el mayor";
		} 
		    //System.out.println(mensaje);
	}

}
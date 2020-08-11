public class ContarPositivosNegativos {

	public static void main(String[] args) {
		
		int[] numeros = new int[]{
			0,-3,6,80,-90,19,-20,0,17,200
		};
		
		System.out.println(numeros.length);
		int ceros = 0, positivos = 0, negativos = 0;
		int sumaPositivos= 0, sumaNegativos = 0;
		
		for (int i=0; i<numeros.length;i++) {
			if(numeros[i]==0) 
				   ceros++;
			
			else if(numeros[i]>0) {
				positivos++;
			    sumaPositivos += numeros[i];
			
			} else {
				negativos++;
				 sumaNegativos += numeros[i];
			}
		}
		System.out.println("la cantidad de ceros es: "+ ceros);
		System.out.println("la cantidad de negativos es: "+ negativos);
		System.out.println("la cantidad de positivos es: "+ positivos);
		System.out.println("la suma de los negativos es: "+ sumaNegativos);
		System.out.println("la suma de los positivos es: "+ sumaPositivos);
	}

}

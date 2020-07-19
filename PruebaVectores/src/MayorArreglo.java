
public class MayorArreglo {

	public static void main(String[] args) {
		int[] numeros = new int[] {
				1,-3,6,8,-9,19,-20, 0, 17, 200
		};
		
		
		int max = numeros[0];
		int position = 0;
		
		for(int i = 0; i< numeros.length;i++) {
			if(max < numeros[i]) {
				max = numeros[i];
				position = i;
			}
		}
		
		System.out.println("Posición del n. mayor: " + position);
		System.out.println("Número mayor: " + max);
		
		
	}
	
}

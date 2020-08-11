
public class SumaVectores {

	public static void main(String[] args) {
		int[] v1 = new int[] {
				1,-3,6,8,-9,19,-20,0,200,200
		};
		int[] v2 = new int[] {
				1,-3,1,80,9,19,-20,0,-50,200
		};
		int totalV1= 0, totalV2= 0;
		for(int i=0;i<v1.length;i++) {
			totalV1 +=v1[i];
			totalV1 +=v2[i];
		}
		if(totalV1 > totalV2) {
			System.out.println("El vector 1 es mayor: " + totalV1);
		}else if(totalV2 > totalV1) {
		System.out.println("El vector 2 es mayor: " + totalV2);
		
		} else {
			System.out.println("El vector1 y el vector 2 son iguales: " + totalV1);
			
	}

}
}
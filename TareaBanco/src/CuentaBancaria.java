import java.util.Scanner;


public class CuentaBancaria {
	
   //atributos
	static String propietario,DepRet;
	static double Saldo,Ret,Dep;
	static char D ,C,A;
	

/*CuentaBancaria(){ 
	propietario = p ;
	saldo = s ;
}*/
  public static void Deposito(double Dep){
	 if (Saldo>0){
		 Saldo += Dep ;
		 System.out.print("Su saldo es de: " +  Saldo);
	 }
  }
  public static void Retiro(double R){
	  
	  if (Saldo - Ret <0){
	  //Saldo = 0;
		 System.out.print("No hay saldo suficiente ");
	  }else{
		  Saldo -= Ret ; 
		  System.out.print("Su saldo es de: " +  Saldo);
	  }
	  

  }
  
  
	public static void main(String[] args) {
		Scanner pro = new Scanner(System.in);
		 System.out.println("      Banco Arturo Lima" ); 
	    System.out.print("Ingrese el nombre del Cliente: ");
	    propietario = pro.nextLine();
	    
	    System.out.print("Ingrese el saldo: ");
	    Saldo = pro.nextDouble();
	    
	    System.out.print("tipo de transaccion: "  );
	    D = pro.next().charAt(0);
	    
	    System.out.print("Tipo de cuenta: " );
	    C = pro.next().charAt(0);
	    if(C == 'c'){
	    	
	    }else if(A == 'a'){
	    	
	    }else{
	    	
	    }
	 
	    
	   if(D == 'd'){
	    	System.out.print("Monto del deposito: ");
	    	Dep = pro.nextDouble();
	    	Deposito(Dep);
	    }else if(D == 'r') {
	    	System.out.print(" Monto del retiro: "  );
	    	Ret = pro.nextDouble();
	    	Retiro(Ret);
	    	
	    	
	    	System.out.print("Su saldo es: " );
	    }else{
	    	System.out.print("Transaccion no permitida: " );
	    }
	}

}
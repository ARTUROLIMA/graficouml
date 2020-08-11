// Clase 
// objeto, instancia --> objeto --> instancia --> variables por referencia
// herencia, polimorfirsmo, abstracción, encapsulamiento
// Variables de clase  ---> Variables y métodos estáticos
// Variables primitivas int , float.... 
 
public class Main5 {
	
	void sumarContadorMain() {   // no tiene static - se hace un new para una instancia
		CuentaCorriente.contador +=100;
	}
	
	static void sumaContadorMain1() {  //se llama directamente
		CuentaCorriente.contador +=100; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Main5 main = new Main5();   //variable de instancia
		main.sumarContadorMain();
		
		Main5.sumaContadorMain1();  //va directamente sin new
		sumaContadorMain1(); 
		
		
		CuentaCorriente.sumarContador();
		System.out.println(CuentaCorriente.contador);
		//CuentaCorriente.contador = 100;
		
		//variable no estatica, es una variable por referencia, variable de instancia o objeto
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo = 100;
		
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.saldo = 1000;
	}

}
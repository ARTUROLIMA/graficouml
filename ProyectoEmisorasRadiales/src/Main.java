
public class Main {

	public static void main(String[] args) {
		
		Emisora ef1 = new Emisora(80.0);
		Emisora ef2 = new Emisora(108.0);
		Emisora ef3 = new Emisora(84.5);
		
		ef1.encender();
		ef1.avanzarCanal();
		ef1.display();
		
		ef2.encender();
		ef2.avanzarCanal();
		ef2.apagar();   
		ef2.avanzarCanal();
		ef2.display();
		
		ef3.encender();
		ef3.avanzarCanal();
		ef3.display();
}
}
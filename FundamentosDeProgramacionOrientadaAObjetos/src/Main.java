public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv1;    //instanciar
		tv1 = new Tv(); 
		
		tv1.encender();
		System.out.println("Encendido: " + tv1.encendido);

		tv1.SubirVolumen();
		tv1.SubirVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		tv1.bajarVolumen();
		
		System.out.println("Volumen: " + tv1.volumen);
		
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		tv1.apagar();
		tv1.avanzarCanal();
		tv1.avanzarCanal();
		
		System.out.println("Canal: " + tv1.canal);
		
		Tv tv2= new Tv();  //instanciar --crear
		tv2.encender();    //encender antes de dar volumen
		tv2.SubirVolumen();
		tv2.SubirVolumen();
		
		System.out.println("Volumen tv2: " + tv2.volumen);
	}

}
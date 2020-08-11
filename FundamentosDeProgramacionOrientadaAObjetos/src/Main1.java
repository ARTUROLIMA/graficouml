public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia o objetos
		//variables por referencia 
		
        Tv tv1 = new Tv();    //mismo espacio en la memoria
        Tv tv2 = new Tv();
        
        //llamar método
        tv1.encender(); 
        tv1.SubirVolumen();
        tv1.SubirVolumen();
        tv1.SubirVolumen();
        tv1.SubirVolumen();
        
        tv2 = tv1;
        tv2.SubirVolumen();
        tv2.SubirVolumen();
        
        System.out.println("Tv1 volumen: " + tv1.volumen);
        System.out.println("Tv2 volumen: " + tv2.volumen);
        

        
	}

}
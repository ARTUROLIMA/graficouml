public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Distancia entre dos puntos
		
		Punto pt1 = new Punto();
		pt1.x = 1;
		pt1.y = 2;
				
		Punto pt2 = new Punto();
		pt2.x = 10;
		pt2.y = 5;
		
		double distancia = pt1.distancia(pt2);
		System.out.println(distancia);
		
		pt1.x = 1;
		pt1.y =2;
		pt2.x = 3;
		pt2.y =3;
		Punto r = pt1.suma(pt2);
		System.out.println(r.x + ", " + r.y);
		
		
		/*
		// Normal sin poo
	    double x1 = 1, y1 = 2;
	    double x2 = 10, y2 = 5;
	    
	    double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	    System.out.println(distancia);
	*/
		
		
	}

}
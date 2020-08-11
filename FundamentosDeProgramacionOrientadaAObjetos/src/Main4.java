public class Main4 {
	
	public static void subirVolumen(int volumen) {
		volumen = volumen + 10;
	}
	public static void subirVolumen(Tv tv) {
		tv.SubirVolumen();
	}

	public static void main(String[] args) {
		//variables por valor o primitivas int, float, double, char
		//Variables por referencias u objetos (se crean con new)
		int volumen = 100;
		Tv tv1 = new Tv();
		tv1.encender();
		tv1.SubirVolumen();
		tv1.SubirVolumen();
		
		subirVolumen(volumen);
		subirVolumen(tv1.volumen);
		subirVolumen(tv1);
		
		System.out.println(volumen);
		System.out.println(tv1.volumen);
		
		}
	}
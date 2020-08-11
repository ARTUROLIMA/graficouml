
//estado-característica-Variables
// comportamiento-funciones o métodos

	public class Tv {
	//atributos
	public boolean encendido;
	public int volumen;
	public int canal;
	
	//métodos
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
}
	public void avanzarCanal() {
		if(encendido) 
			canal++;			
}
	public void SubirVolumen() {
		if(encendido && volumen <100) 
			volumen++;	
	}
	public void bajarVolumen() {
		if(encendido && volumen <0) 
			volumen--;	
	}
}
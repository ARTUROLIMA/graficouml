
import java.util.Scanner;
public class Arreglov {
	public static void ingresarDatos(int edad[],int LIMITE){
		Scanner entrada = new Scanner(System.in);
		int e;
		for(int indice=0; indice<edad.length; indice++)
		{
			System.out.print("ingrese edad en casilla "+ indice +" : ");
			e = entrada.nextInt();
			edad[indice] = e;
		}
	}
    public static void mostrarDatos(int edad[],int LIMITE){
		System.out.println("Mostrar los datos del vector....");
		for(int posicion =0 ;posicion <LIMITE; posicion++ )
			System.out.print(edad[posicion] + " ");
	}
    public static void cargarDatosAleatorios(int edad[]){
            //cargar datos del vector de numeros aleatorios entre 0 y 100
            for(int indice = 0; indice < edad.length; indice++){
                int numero = (int)(Math.random()*10);
                edad[indice] = numero;
            }
        }
    public static void ordenarVector(int []edad ){
        int i, j, aux;
        for(i=0;i<edad.length-1;i++)
             for(j=0;j<edad.length-i-1;j++)
                  if(edad[j+1]<edad[j]){
                     aux=edad[j+1];
                     edad[j+1]=edad[j];
                     edad[j]=aux;
    	    }
       }
    public static void consultarDatos(int []edad ){
    	Scanner entrada = new Scanner(System.in);
    	boolean encontrado = false;
    	int  posicion = -1, indice = 0, dato_a_buscar =-1;
    	System.out.println("ingrese el dato a buscar:");
    	dato_a_buscar = entrada.nextInt() ;
    	while (indice < edad.length && encontrado == false ){
    	if (edad[indice] == dato_a_buscar){
    		posicion = indice ;
    		encontrado =true;
    	}
        indice++;
     }
     if(encontrado== true)
    	 System.out.println("el dato "+ dato_a_buscar + " se encontro es casilla "+ posicion);
     else
    	 System.out.println("el dato "+ dato_a_buscar + " no se encontro el vector ");
    }

    

    
    public static void quiebreDeControl(int []e) {
        int anterior = e[0], contador = 0, indice = 0;
        System.out.println("\n QUIEBRE DE CONTROL ");
        while(indice<e.length){
            if(anterior == e[indice]){
                contador++;
            }
            else{
                System.out.println("EL NUMERO "+ anterior +" SE REPITIO " + contador + " VECES ");
                contador = 1;
            }
            indice++;
        }
        System.out.println("EL NUMERO "+ anterior +" SE REPITIO "+ contador + " VECES ");
    }
        public static void menu(int [] edad, int LIMITE) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("MENU PRINCIPAL");
            System.out.println("************");
            System.out.println("1. CARGAR DATOS");
            System.out.println("2. MOSTRAR DATOS");
            System.out.println("3. ORDENAR DATOS");
            System.out.println("4. CONSULTAR DATOS");
            System.out.println("5. QUIEBRE DE CONTROL");
            System.out.println("6. SALIR");
            System.out.println("DIGITE OPCIÓN");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1: cargarDatosAleatorios(edad);menu(edad,LIMITE);break;
                case 2: mostrarDatos(edad, LIMITE);menu(edad,LIMITE);break;
                case 3: ordenarVector(edad);menu(edad,LIMITE);break;
                case 4: consultarDatos(edad);menu(edad,LIMITE);break;
                case 5: quiebreDeControl(edad);menu(edad,LIMITE);break;
            }
        }
	public static void main(String[] args) {
	    final int LIMITE =20;
		int[] edad = new int [LIMITE];
                menu(edad,LIMITE);
		//ingresarDatos(edad,LIMITE);
                mostrarDatos(edad,LIMITE);
                cargarDatosAleatorios(edad);
		ordenarVector(edad);
		consultarDatos(edad);
                quiebreDeControl(edad);
	}
}

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void mostrar(ArrayList<Inventario> l) {
		for( int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	static Scanner sc = new Scanner(System.in);
	
	public static void actualizarIventario() {
		int codigo;
		int cantidadExis; 
		int libroCant;
		int respuesta;
		System.out.println("\nIngresar cantidad existente de libros: ");
		cantidadExis = sc.nextInt();
		
		System.out.println("\nIngresar el codigo del libro: ");
		codigo = sc.nextInt();
		
		if(codigo == 1) {
			System.out.println("LIBRO: Peter Pan y Wendy     AUTOR: Francis Donkin Bedford    PRECIO: $70" );
		} else if(codigo == 2){ 
			System.out.println("LIBRO: LA PASION DE CRISTO   AUTOR: Mel Gibson    PRECIO: $100" );
		} else if(codigo == 3){
			System.out.println("LIBRO: HARRY POTHER     AUTOR: J. K. Rowling    PRECIO: $80 " );
		} else if(codigo == 4){
			System.out.println("LIBRO: NARNIA     AUTOR: C. S. Lewis    PRECIO: $90 " );
		} else { System.out.println("Código incorrecto");}
					
		System.out.println("\nIngrese la cantidad del libro: ");
		libroCant = sc.nextInt();
	
		if(libroCant == 0)
			System.out.println("Agotado");
		if(libroCant !=0)
			System.out.println("\n¿DESEA COMPRAR EL LIBRO? " + "\n Digite 1 para SI o digite 2 para NO: ");
			respuesta = sc.nextInt();
			if(respuesta == 1) {
				libroCant = libroCant-1;
				cantidadExis = cantidadExis-1;
				System.out.println("El libro esta vendido con exito");
				System.out.println("Cantidad de ese libro: " + libroCant);
				System.out.println("Cantidad de libros total: " + cantidadExis);
			}else {
				System.out.println("Compra no Realizada");
			}
			}
	public static void librosCostosos() {
		System.out.println("\n  LIBROS MÁS CAROS\n");
		System.out.println("1.- CÓDIGO: 2   LIBRO:LA PASION DE CRISTO   AUTOR: Mel Gibson   PRECIO: $100  ");
		System.out.println("2.- CÓDIGO: 3   LIBRO:HARRY POTHER    AUTOR: J. K. Rowling    PRECIO: $80 ");
		System.out.println("3.- CÓDIGO: 4   LIBRO:NARNIA    AUTOR: C. S. Lewis    PRECIO: $90 ");
	}
	public static void main(String[] args) {
		
		ArrayList<Inventario> lib = new ArrayList<Inventario>();
		System.out.println("\nLIBRERIA CARLOS ARTURO LIMA MEDINA\n");
		System.out.println("\nLIBROS:\n");
		Inventario lib1 = new Inventario(1, "Peter Pan y Wendy", " Francis Donkin Bedford", 70 );
		Inventario lib2 = new Inventario(2, "LA PASION DE CRISTO", "Mel Gibson" , 100 );
		Inventario lib3 = new Inventario(3, "HARRY POTHER", " J. K. Rowling" , 80 );
		Inventario lib4 = new Inventario(4, "NARNIA", " C. S. Lewis" , 90 );
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		mostrar(lib);
		actualizarIventario();
		librosCostosos();		
	}

}
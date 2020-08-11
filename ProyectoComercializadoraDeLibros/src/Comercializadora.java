import java.util.ArrayList;

public class Comercializadora {
	

	
	public static void mostrar1(ArrayList<Libros> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaL(ArrayList<Libros> p ) {
		double precio;
		double iva;
		double precioIva;
		double descuento;
		double precioTotal;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.04;
			descuento = precio*0.2;
			precioTotal = precio + iva - descuento;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			p.get(i).setPrecioTotal(precioTotal);
			}
	}
	
	public static void mostrar2(ArrayList<Cd> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaC(ArrayList<Cd> p ) {
		double precio;
		double iva;
		double precioIva;
		double descuento;
		double precioTotal;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			descuento = precio*0.1;
			precioTotal = precio + iva - descuento;
			p.get(i).setPrecioTotal(precioTotal);
			
			
			}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Libros> lib = new ArrayList<Libros>();
		System.out.println("       COMERCIALIZADORA\n");
		Libros lib1 = new Libros(12345, "NARNIA", " C. S. Lewis", 1943, "C. S. Lewis" , 987655655 , 20 );
		Libros lib2 = new Libros(54321, "LA PASION DE CRISTO", "Mel Gibson", 1872, "Mel Gibson" , 789245874 , 45.50 );
		Libros lib3 = new Libros(89562, "HARRY POTHER", " J. K. Rowling", 1988, "J. K. Rowling" , 1238465 , 33.99 );
		Libros lib4 = new Libros(78945, "Peter Pan y Wendy", " Francis Donkin Bedford", 1605, " Francis Donkin Bedford" , 587497865 , 45 );
		
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		
		
		
		ArrayList<Cd> cd = new ArrayList<Cd>();
		Cd cd1 = new Cd(69862, "SALSA", "ABC", 2001, 35);
		Cd cd2 = new Cd(78958, "REG", "NICKY", 2002, 22);
		Cd cd3 = new Cd(12557, "MEREN", "HUGOL", 2020, 45);
		Cd cd4 = new Cd(12647, "RASTA", "KAPOOR", 2014, 62);
		
		cd.add(cd1);
		cd.add(cd2);
		cd.add(cd3);
		cd.add(cd4);
		
		mostrar1(lib);
		mostrar2(cd);
		
		
		
		PrecioIvaL(lib);
		System.out.println("\nPRECIO DEL LIBRO:\n");
		System.out.println("Libro1 con iva: " + lib1.getPrecioIva() + "$" +  " - Descuento = Precio Venta: "  + lib1.getPrecioTotal() + "$" );
		System.out.println("Libro2 con iva: " + lib2.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib2.getPrecioTotal() + "$" );
		System.out.println("Libro3 con iva: " + lib3.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib3.getPrecioTotal() + "$" );
		System.out.println("Libro4 con iva: " + lib4.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib4.getPrecioTotal() + "$" );
		
		PrecioIvaC(cd);
		System.out.println("\nPRECIO DE CD:\n");
		System.out.println("CD1 con iva: " + cd1.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " +  cd1.getPrecioTotal() + "$" );
		System.out.println("CD2 con iva: " + cd2.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd2.getPrecioTotal()+ "$" );
		System.out.println("CD3 con iva: " + cd3.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd3.getPrecioTotal() + "$" );
		System.out.println("CD4 con iva: " + cd4.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd4.getPrecioTotal() + "$" );
		
		
		
	}
		
		
		
	
}

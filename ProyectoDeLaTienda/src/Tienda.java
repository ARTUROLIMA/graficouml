import java.util.ArrayList;

public class Tienda {
	private int codigo;
	private double precio;
	private double iva;
	private double precioIva;
	private String producto;
	private String descripcion;
	private String fecha;
	
	
	public Tienda(int codigo, double precio, String producto, String descripcion, String fecha) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.producto = producto;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getPrecioIva() {
		return precioIva;
	}



	public void setPrecioIva(double precioIva) {
		this.precioIva = precioIva;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "  Productos [CÓDIGO: " + codigo + "   PRECIO: "+  "$"  + precio + "     PRODUCTO: "
				+ producto + "     DESCRIPCIÓN: " + descripcion + "    Fecha: " + fecha + "]";
	}
	
	
	public static void PrecioIva(ArrayList<Tienda> p ) {
		double precio;
		double iva;
		double precioIva;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			}
	}

	
	public static void mostrar(ArrayList<Tienda> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	

	public static void main(String[] args) {
		ArrayList<Tienda> productos = new ArrayList<Tienda>();
		
		System.out.println("\nPRODUCTOS:\n");
		Tienda produ1 = new Tienda(1, 15, "Cap","Blanca","1-01-20");
		Tienda produ2 = new Tienda(2, 12, "chompa","naranja","23-02-20");
		Tienda produ3 = new Tienda(3, 30, "Pantalón","negro","12-02-20");
		Tienda produ4 = new Tienda(4, 18, "medias", "blancas","22-03-20");
		Tienda produ5 = new Tienda(5, 10, "zapatos", " negros","15-11-20");
		
		
		productos.add(produ1);
		productos.add(produ2);
		productos.add(produ3);
		productos.add(produ4);
		productos.add(produ5);
		mostrar(productos);
		
		PrecioIva(productos);
		System.out.println("\nPRECIO CON IVA:\n");
		System.out.println("Cap: "+ "$" + produ1.getPrecioIva() );
		System.out.println("chompa: "+ "$" + produ1.getPrecioIva());
		System.out.println("Pantalón: "+ "$" + produ3.getPrecioIva());
		System.out.println("medias: " + "$"+ produ4.getPrecioIva());
		System.out.println("zapatos: " + "$"+ produ5.getPrecioIva());
	}

}
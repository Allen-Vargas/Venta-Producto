
public class Producto {
	protected String name;
	protected int precio;
	
	public Producto(String name, int precio) {
		this.name = name;
		this.precio = precio;
	}
	
	public String getName() {
		return name;
	}

	public int getPrecio() {
		return precio;
	}
	
	public int calcularTarifa() {
		return precio;
	}
}

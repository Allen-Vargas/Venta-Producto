
public class Articulo extends Producto {
	private int saldo;
	
	public Articulo(String name, int precio) {
		super(name,precio);
		this.saldo = 10;
	}
	
	@Override
	public int calcularTarifa() {
		int tarifa=precio*saldo;
		return tarifa;
	}
}

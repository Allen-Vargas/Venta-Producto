
public class Servicio extends Producto {

	public Servicio(String name, int precio) {
		super(name, precio);
	}
	
	@Override
	public int calcularTarifa() {
		int tarifa = precio;
		return tarifa;
	}
}


import org.junit.Test;
import org.junit.Assert;

public class VentaTest {

	@Test
	public void debeRetornarElnombreDelProducto() {
		Producto producto = new Producto("", 0);
		Assert.assertEquals("", producto.getName());
	}
	
	@Test
	public void debeRetornarElnombreDelProductorRefresco() {
		Producto producto = new Producto("CocaCola", 0);
		Assert.assertEquals("CocaCola", producto.getName());
	}

	@Test
	public void debeRetornarElPrecioDelProducto() {
		Producto producto = new Producto("CocaCola", 10);
		Assert.assertEquals(10, producto.getPrecio());
	}
	
	@Test
	public void debeRetornarElNombreDelArticulo() {
		Producto producto = new Articulo("Sprite", 10);
		Assert.assertEquals("Sprite", producto.getName());
	}
	
	@Test
	public void debeRetornarElNombreDelServicio() {
		Producto producto = new Servicio("Masaje", 10);
		Assert.assertEquals("Masaje", producto.getName());
	}
}

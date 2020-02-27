import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class VentaTest {

	@Test
	public void debeRetornarElnombreDelProducto() {
		Producto producto = new Producto("");
		Assert.assertEquals("", producto.getName());
	}
	
	@Test
	public void debeRetornarElnombreDelProductorRefresco() {
		Producto producto = new Producto("CocaCola");
		Assert.assertEquals("CocaCola", producto.getName());
	}

}

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class VentaTest {

	@Test
	public void debeRetornarElnombreDelProducto() {
		Producto producto = new Producto();
		String name="";
		Assert.assertEquals(name, producto.getName());
	}

}

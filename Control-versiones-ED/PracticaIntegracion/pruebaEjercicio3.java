package tareaPrueba;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class pruebaEjercicio3 {

	@Test
	
	public void testeito3() {
		Ej3_BaseDeDatosProductos basePepinos = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos pepinos= new Ej3_GestorProductos(basePepinos);
		
		pepinos.registrarProducto("pepino amarillo");
		assertTrue(pepinos.productoRegistrado("pepino amarillo"));
		
	}
	
	
}

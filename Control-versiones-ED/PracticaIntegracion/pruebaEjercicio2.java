package tareaPrueba;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class pruebaEjercicio2 {
	@Test
	public void testeito2() {
		Ej2_ServicioEnvio envio1= new Ej2_ServicioEnvio();
		Ej2_ServicioPedido pedido1= new Ej2_ServicioPedido(envio1);
		
		assertTrue(pedido1.crearYEnviarPedido("Pedido123"));
	}
}

package tareaPrueba;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class pruebaEjercicio4 {
	@Test
    public void testeito4() {
		Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);
        boolean resultado = servicioOrdenes.procesarOrden(48);
        assertTrue(resultado); 
    }
}

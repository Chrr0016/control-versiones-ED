package tareaPrueba;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class prueabEjercicio1 {
	
	
	
	@Test
	public void testeito() {
		Ej1_BaseDeDatos baseDatos1 = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios servicio1= new Ej1_ServicioUsuarios(baseDatos1);
		servicio1.registrarUsuario("JozeJuan");
		assertTrue(servicio1.usuarioRegistrado("JozeJuan"));
	}
	
	
	
	                         
}

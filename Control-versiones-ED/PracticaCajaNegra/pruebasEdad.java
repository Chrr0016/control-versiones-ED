package trabajoCajaNegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class pruebasEdad {
    @Test
    void testNumeroPositivoEnRango() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(20);
        assertEquals(true, resultado, "Error en el testeo de un numero positivo en rango");
    }
    
    @Test
    void testNumeroPositivoFuera() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(5);
        assertEquals(false, resultado, "Error en el testeo de un numero positivo fuera de rango");
    }
    
    @Test
    void testNumeroCero() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(0);
        assertEquals(false, resultado, "Error en el testeo de un numero 0");
    }
    
    @Test
    void testNumeroNegativo() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(-5);
        assertEquals(false, resultado, "Error en el testeo de un numero negativo");
    }
    
    @Test
    void testMinimoValor() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(Integer.MIN_VALUE);
        assertEquals(false, resultado, "Error en el testeo del numero minimo");
    }
   @Test
    void testMaximoValor() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(Integer.MAX_VALUE);
        assertEquals(false, resultado, "Error en el testeo del numero maximo");
    }
}

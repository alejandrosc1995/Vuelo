package TestAirlines;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import seguridad.airlines.Vuelo;

public class VueloTest {

    @Test
    public void testVuelosCreacion() {
        Vuelo vuelo = new Vuelo("AA123", 100);
        Assertions.assertNotNull(vuelo);
    }

    @Test
    public void testInvalidFlightNumber() {
        assertThrows(RuntimeException.class,
                 () -> {
                    Vuelo flight = new Vuelo("AA12", 100);
                }
        );
    }
}

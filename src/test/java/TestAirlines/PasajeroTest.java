package TestAirlines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seguridad.airlines.Pasajero;
@DisplayName("Pruebas Pasajero")
public class PasajeroTest {
    @DisplayName("Creacion de pasajero con los parametros correcto")
    @Test
    public void testPasajeroCreacion(){
        Pasajero pasajero = new Pasajero("123-45-6789", "John Smith", "US"); 
        assertNotNull(pasajero); //
    }
    
    @DisplayName("Lanza Excepcion con codigo no valido")
    @Test
    public void testInvalidCountryCode(){
        assertThrows(RuntimeException.class, 
                ()->{  Pasajero pasajero = new Pasajero("900-45-6789", "John Smith", "GJ"); 
 }); 
    }
    
    @DisplayName("Comprueba metodo ToString")
    @Test 
    public void testPasajeroToString(){
        Pasajero pasajero = new Pasajero("123-45-6789","Brayan Cabrera","US");
        assertEquals("Passenger Brayan Cabrera with identifier: 123-45-6789 from US", pasajero.toString());
    }
}

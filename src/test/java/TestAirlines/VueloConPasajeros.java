/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAirlines;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import seguridad.airlines.Pasajero;
import seguridad.airlines.Vuelo;

/**
 *
 * @author PC
 */
public class VueloConPasajeros {
    private Vuelo vuelo = new Vuelo("AA123", 1);
    
    @Test
    public void testAddAndRemovePasajeros() throws IOException{
        Pasajero pasajero = new Pasajero("124-56-7890", "Michael Johnson", "US");
        assertTrue(vuelo.addPasajeros(pasajero));
        assertEquals(1,vuelo.getNumeroPasajeros());
        
        assertTrue(vuelo.removerPasajero(pasajero));
        assertEquals(0, vuelo.getNumeroPasajeros());
    }
    
    @Test
    public void testNumeroDeAsientos(){
        Pasajero pasajero1 = new Pasajero("124-56-7890", "Michael Johnson", "US");
        vuelo.addPasajeros(pasajero1);
        assertEquals(1, vuelo.getNumeroPasajeros());
        
        //Pasajero pasajero2 = new Pasajero
    }
    
}

package seguridad.airlines;

import java.util.Arrays;
import java.util.Locale;

public class Pasajero {
    private final String identificador;
    private final String name;
    private final String codigoCiudad;
    private Vuelo vuelo;
    
    
    public Pasajero(final String identificador, final String name, final String codigoCiudad){
        if(!Arrays.asList(Locale.getISOCountries()).contains(codigoCiudad)){
            throw new RuntimeException("Codigo de ciudad Invalido");
        }
        this.identificador = identificador;
        this.name = name;
        this.codigoCiudad = codigoCiudad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getName() {
        return name;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public void joinFlight(Vuelo vuelo){
        Vuelo vueloPrevio = this.vuelo;
        if(null !=vueloPrevio){
            if(!vueloPrevio.removerPasajero(this)){
                throw new RuntimeException("No puede remover pasajeros");
            }
        }
        setVuelo(vuelo);
        if(null != vuelo){
            if(!vuelo.addPasajeros(this)){
                throw new RuntimeException("No puede agregar pasajeros");
            }
        }
    }
    
    

    @Override
    public String toString() {
        return "Passenger " + getName() + " with identifier: " +  getIdentificador()+ " from " + getCodigoCiudad();
    }
    
    
}

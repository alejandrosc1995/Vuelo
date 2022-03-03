package seguridad.airlines;

import java.util.Arrays;
import java.util.Locale;

public class Pasajero {
    private final String identificador;
    private final String name;
    private final String codigoCiudad;
    
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

    @Override
    public String toString() {
        return "Passenger " + getName() + " with identifier: " +  getIdentificador()+ " from " + getCodigoCiudad();
    }
    
    
}

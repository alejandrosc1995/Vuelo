/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.airlines;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class Vuelo {

    private final String numeroVuelo;
    private final int asientos;
    private Set<Pasajero> pasajeros = new HashSet<>();

    private final static String flightNumberRegex = "^[A-Z]{2}\\d{3,4}$";
    private final static Pattern pattern = Pattern.compile(flightNumberRegex);

    public Vuelo(final String numeroVuelo, final int asientos) {
        Matcher matcher = pattern.matcher(numeroVuelo);
        if (!matcher.matches()) {
            throw new RuntimeException("Invalid flight number");
        }
        this.numeroVuelo = numeroVuelo;
        this.asientos = asientos;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getNumeroPasajeros() {
        return this.pasajeros.size();
    }

    public boolean addPasajeros(final Pasajero pasajero) {
        if (getNumeroPasajeros() >= this.asientos) {
            throw new RuntimeException("No hay suficientes asientos para el vuelo " + getNumeroVuelo());
        }
        return pasajeros.add(pasajero);
    }

    public boolean removerPasajero(Pasajero pasajero) {
        return pasajeros.remove(pasajero);
    }

}

package model;

import util.InvalidRutException;

/**
 * La clase rut permite validar y almacenar el Rol Unico tributario de la persona
 *
 */
public class Rut {

    private String rut;

    public Rut(String rut) throws InvalidRutException {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}

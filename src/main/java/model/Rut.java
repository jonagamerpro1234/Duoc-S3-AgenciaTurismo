package model;

import util.InvalidRutException;

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

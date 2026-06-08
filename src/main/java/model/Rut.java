package model;

import org.jetbrains.annotations.NotNull;
import util.InvalidRutException;

/**
 * La clase rut permite validar y almacenar el RUT de la persona
 *
 */
public class Rut {

    private final String numero;

    /**
     * Contractor base que permite añadir el RUT
     */
    public Rut(@NotNull String rut)  {
        if(!rut.matches("[0-9]+-[0-9kK]")){
            throw new InvalidRutException("El rut no es valido");
        }
        this.numero = rut;
    }

    /**
     * Retorna el RUT almacenado
     */
    public String getRut() {
        return numero;
    }

}

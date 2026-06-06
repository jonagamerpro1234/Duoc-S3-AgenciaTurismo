package util;

public class InvalidRutException extends RuntimeException {

    public InvalidRutException(String message) {
        super(
                "Rol Unico Tributario invalido \n" +
                message);
    }
}

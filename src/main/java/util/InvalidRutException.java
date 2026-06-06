package util;

/**
 * Como su nombre lo menciona al encontrarce una excepcion
 * del rol unico tributario arroja un error indicando que no es válido
 * esto puede ser por varios motivos principalmente no cumplir con el patters que verifica si
 * está dentro de cierto rango de numeros y letras como tal seria est [0-9] - [kK] esto sería lo que define el formato en si
 *
 */
public class InvalidRutException extends RuntimeException {

    public InvalidRutException(String message) {
        super(
                "Rol Unico Tributario invalido \n" +
                message);
    }
}

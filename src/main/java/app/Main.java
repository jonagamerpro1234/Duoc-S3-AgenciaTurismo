package app;

import model.Direccion;
import model.Empleado;

/**
 * Clase principal del programa con se encuentra el metodo main.
 */
public class Main {

    /**
     * Metodo principal que permite la ejecucion del programa
     * @param args
     */
    public static void main(String[] args) {

        //Primer objeto empleado
        Empleado empleado = new Empleado("Pedro", "Martinez",
                new Direccion("Buin","Los laureles", "Santiago"), "Jardinero");

        //Segundo objeto empleado

        //tercer objeto empleado

        //Mensajes a mostrar en consola

        //------> 1.
        System.out.println(empleado.toString());
        //------> 2.
        System.out.println(empleado.toString());
        //------> 3.
        System.out.println(empleado.toString());

    }

}

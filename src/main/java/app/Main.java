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
                new Direccion("Buin","Los laureles 690", "Santiago"), "Jardinero");

        //Segundo objeto empleado
        Empleado empleado2 = new Empleado("Juan", "Tomillo",
                new Direccion("San Bernardo","Los laureles 020", "Santiago"), "Supervisor");
        //tercer objeto empleado
        Empleado empleado3 = new Empleado("Maxwell", "Rodriguez",
                new Direccion("Paine","Arrecife 002", "Maipo"), "Guia Turístico");
        //Mensajes a mostrar en consola

        //------> 1.
        System.out.println(empleado.toString());
        //------> 2.
        System.out.println(empleado2.toString());
        //------> 3.
        System.out.println(empleado3.toString());

    }

}

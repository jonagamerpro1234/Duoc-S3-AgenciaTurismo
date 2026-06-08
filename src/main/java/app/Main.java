package app;

import model.Direccion;
import model.Empleado;
import model.Rut;

/**
 * Clase principal utilizada para demostrar
 * el funcionamiento del sistema.
 * <p>
 * Se crean instancias de empleados y se muestran
 * sus datos mediante la consola.
 */
public class Main {

    /**
     * Método principal que permite la ejecución del programa
     */
    public static void main(String[] args) {

        //Primer objeto empleado
        Empleado empleado = new Empleado("Pedro", "Martinez", new Rut("12345678-9"),
                new Direccion("Buin","Los laureles 690", "Santiago"), "Jardinero");

        //Segundo objeto empleado
        Empleado empleado2 = new Empleado("Juan", "Tomillo", new Rut("21345689-9"),
                new Direccion("San Bernardo","Los laureles 020", "Santiago"), "Supervisor");

        //tercer objeto empleado
        Empleado empleado3 = new Empleado("Maxwell", "Rodriguez",new Rut("23545678-k"),
                new Direccion("Paine","Arrecife 002", "Maipo"), "Guia Turístico");

        //Mensajes a mostrar en consola

        //1.
        System.out.println(empleado.toString() + "\n------------------");
        //2.
        System.out.println(empleado2.toString() + "\n------------------");
        //3.
        System.out.println(empleado3.toString());

    }

}

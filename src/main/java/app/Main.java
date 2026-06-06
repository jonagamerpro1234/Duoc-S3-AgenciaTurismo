package app;

import model.Direccion;
import model.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pedro", "Martinez",
                new Direccion("Buin","Los laureles", "Santiago"), "Jardinero");




        System.out.println(empleado.toString());

    }

}

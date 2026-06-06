package model;

public class Empleado extends Persona {

    private String especialidad;

    public Empleado(String nombre, String apellido, Direccion direccion, String especialidad) {
        super(nombre, apellido, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                super.toString() +
                ",\nespecialidad='" + especialidad + '\'' +
                '}';
    }
}

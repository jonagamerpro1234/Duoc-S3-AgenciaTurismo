package model;

/**
 * La clase Empleado representa a un trabajador
 * de la agencia de turismo.
 * <p>
 * Esta clase hereda de Persona, por lo que
 * dispone de nombre, apellido, RUT y dirección.
 */
public class Empleado extends Persona {

    /**
     * Especialidad o cargo del empleado.
     */
    private final String especialidad;

    /**
     * Constructor principal de la clase Empleado.
     *
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param numeroRut rut del empleado
     * @param direccion dirección del empleado
     * @param especialidad especialidad o cargo
     */
    public Empleado(String nombre, String apellido, Rut numeroRut, Direccion direccion, String especialidad) {
        super(nombre, apellido, numeroRut,  direccion);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad o cargo del empleado.
     * @return especialidad del empleado
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Retorna una representación legible del objeto.
     * @return información del objeto formateado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                super.toString() +
                ",\nespecialidad='" + especialidad + '\'' +
                '}';
    }
}

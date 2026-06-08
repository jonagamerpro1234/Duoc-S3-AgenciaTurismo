package model;

/**
 * Representa una persona dentro del sistema.
 * <p>
 * Una persona posee un nombre, apellido,
 * RUT y dirección asociados.
 */
public class Persona {

    /**
     * Atributos base de la clase
     */
    private String nombre;
    private String apellido;
    private Rut numeroRut;
    private Direccion direccion;

    /**
     * Constructor principal de la clase Persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param numeroRut RUT de la persona
     * @param direccion dirección de la persona
     */
    public Persona(String nombre, String apellido, Rut numeroRut,Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRut = numeroRut;
        this.direccion = direccion;
    }

    /**
     * Constructor vacío de la clase Persona.
     * <p>
     * Permite crear una instancia sin inicializar
     * sus atributos al momento de la creación.
     */
    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Rut getNumeroRut() {
        return numeroRut;
    }

    public void setNumeroRut(Rut numeroRut) {
        this.numeroRut = numeroRut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna una representación en texto
     * de la información almacenada en la persona.
     *
     * @return datos de la persona en formato String
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut=" + numeroRut +
                ", direccion=" + direccion +
                '}';
    }
}

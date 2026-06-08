package model;

/**
 * Clase de objeto persona
 *
 * Atributos:
 * - Nombre
 * - Apellido
 * - Direccion
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
     * Constructor principal
     * @param nombre
     * @param apellido
     * @param direccion
     */
    public Persona(String nombre, String apellido, Rut numeroRut,Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRut = numeroRut;
        this.direccion = direccion;
    }

    /**
     * Crea una instancia de la clase persona, si tener que establecer parámetros
     * <p>
     * Ejemplo de uso:
     * <p>
     *  Persona p = new Persona();
     * <p>
     * Esta instancia permite usar lo metodos que proporciona la clase lo cuales se mencionan a continuación
     * <p>
     *
     *  Metodos Getters
     *  - getNombre(); -> Retorna el nombre, el tipo de dato que usa es String
     *  - getApellido(); -> Retorna el apellido, el tipo de dato que usa es String
     *  - getRut(); -> Retorna el número del RUT
     *  - getDireccion(); -> Retorna la información de la clase Direccion
     * <p>
     *  Metodos Setters
     *  - setNombre(); -> Retorna el nombre, el tipo de dato que usa es String
     *  - setApellido(); -> Retorna el apellido, el tipo de dato que usa es String
     *  - setRut(); -> Retorna el número del RUT
     *  - setDireccion(); -> Retorna la información de la clase Direccion
     *
     */
    public Persona() {}

    /**
     * @return devuelve el nombre de la persona,
     * <p>
     * por ej: Pedro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite establecer el nombre de la persona
     * Ejemplo de uso:
     * <p>
     *  Persona p = new Persona();
     * <p>
     *  p.setNombre( String -> Pedro);
     *
     * @param nombre requiere un dato de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el apellido de la persona
     * <p>
     * Ejemplo de uso:
     * <p>
     *  Persona p = new Persona();
     * <p>
     *  p.getApellido();
     *
     * @return devuelve un valor de tipo String el cual contiene el apellido de la persona
     */
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

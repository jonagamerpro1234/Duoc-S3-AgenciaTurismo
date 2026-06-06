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
    private Direccion direccion;

    /**
     * Constructor principal del Objeto persona
     * @param nombre
     * @param apellido
     * @param direccion
     */
    public Persona(String nombre, String apellido,  Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    /**
     * Crea una instancia de la clase persona, si tener que establecer parametros
     *
     * Ejemplo de uso:
     *
     *  Persona p = new Persona();
     *
     * esta instacia permite usar lo metodos que proporciona la clase lo cuales se mencionan a continuacion
     *
     *
     *  Metodos Getters
     *  - getNombre(); -> Muestra el nombre, el tipo de dato que usa es String
     *  - getApellido(); -> Muestra el apellido, el tipo de dato que usa es String
     *  - getDireccion(); -> Muestra la información de la clase Direccion;
     *
     *  Metodos Setters
     *
     */
    public Persona() {}

    /**
     * @return devuelve el nombre de la persona,
     * por ej: Pedro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite establecer el nombre de la persona
     * Ejemplo de uso:
     *
     *  Persona p = new Persona();
     *
     *  p.setNombre( String -> Pedro);
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el apellido de la persona
     *
     * Ejemplo de uso:
     *
     *  Persona p = new Persona();
     *
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

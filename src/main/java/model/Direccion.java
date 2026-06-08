package model;

/**
 * Representa la dirección asociada a una persona.
 * <p>
 * Una dirección está compuesta por comuna,
 * calle y ciudad.
 */
public class Direccion {

    private String comuna;
    private String calle;
    private String ciudad;

    /**
     * Constructor principal de la clase Dirección.
     *
     * @param comuna comuna de residencia
     * @param calle calle de residencia
     * @param ciudad ciudad de residencia
     */
    public Direccion(String comuna, String calle, String ciudad) {
        this.comuna = comuna;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Retorna una representación en texto
     * de la dirección almacenada.
     *
     * @return información de la dirección
     */
    @Override
    public String toString() {
        return "Direccion{" +
                "comuna='" + comuna + '\'' +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}

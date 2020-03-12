package puntodeventa;

/**
 *
 * @author BrandonVS
 */
public class Producto {
    private String nombre;
    private String unidad;
    private double cantidad;
    private double precio;

    /**
     * @param nombre
     * @param unidad
     * @param cantidad
     * @param precio 
     */
    public Producto(String nombre, String unidad, double cantidad, 
            double precio) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio 
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
}

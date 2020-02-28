package herencia_figura;

public class Figura {
    protected String nombre;

    /**
     * Metodo para obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

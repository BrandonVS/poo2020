package diseñopoo;

public class Cerveza {

    private double precio;
    private int unidadesVendidas;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidadesVendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidadesVendidas = unidadesVendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerPrecioT(double precio, int unidadesVendidas){
        return precio * unidadesVendidas;
    }

    public String getCerveza(){

        String cerveza = "Nombre: "+nombre+"\nTipo: "+tipo+"\nPrecio: "+precio+"\nUnidades vendidas" +
                ": "+unidadesVendidas+"\n";
        return cerveza;
    }
}

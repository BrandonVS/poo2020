package intropoo;

public class Persona {

    private String genero;
    private String cultura;
    private int edad;
    private String nombre;

    /**
     * Constructor
     * @param genero
     * @param cultura
     * @param edad
     * @param nombre
     */
    public Persona(String genero, String cultura, int edad, String nombre){
        this.genero = genero;
        this.cultura = cultura;
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Constructor 2
     * @param genero
     * @param cultura
     * @param edad
     */
    public Persona(String genero, String cultura, int edad){
        this.genero = genero;
        this.cultura = cultura;
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

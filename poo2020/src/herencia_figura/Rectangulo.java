package herencia_figura;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    private double area;

    /**
     * Metodo constructor para Rectangulo
     * @param nombre
     * @param base
     * @param altura
     */
    public Rectangulo(String nombre, double base, double altura){
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo para obtener la base
     * @return base
     */
    public double getBase() {
        return base;
    }

    /**
     * Metodo para obtener la altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Metodo para obtener el area
     * @return area
     */
    public double calcularArea(){
        area = base * altura;
        return area;
    }
}

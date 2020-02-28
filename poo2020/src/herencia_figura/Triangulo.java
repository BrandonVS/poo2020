package herencia_figura;

import practicas.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double area;

    /**
     * Metodo constructor para el Triangulo
     * @param nombre
     * @param base
     * @param altura
     */
    public Triangulo(String nombre, double base, double altura){
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
        area = (base * altura)/2;
        return area;
    }
}

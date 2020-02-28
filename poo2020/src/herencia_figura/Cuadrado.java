package herencia_figura;

import practicas.Figura;

public class Cuadrado extends Figura {
    private double lado;
    private double area;

    /**
     * Metodo constructor para Cuadrado
     * @param nombre
     * @param lado
     */
    public Cuadrado(String nombre, double lado){
        this.nombre = nombre;
        this.lado = lado;
    }

    /**
     * Metodo para obtener el lado
     * @return lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Metodo para obtener el area
     * @return area
     */
    public double calcularArea(){
        area = lado * lado;
        return area;
    }
}

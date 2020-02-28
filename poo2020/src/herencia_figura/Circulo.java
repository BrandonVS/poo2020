package herencia_figura;

public class Circulo extends Figura {
    private double radio;
    private double area;

    /**
     * Metodo constructor para Circulo
     * @param nombre
     * @param radio
     */
    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    /**
     * Metodo para obtener el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo para obtener el area
     * @return area
     */
    public double calcularArea(){
        area = Math.PI * (radio * radio);
        return area;
    }
}

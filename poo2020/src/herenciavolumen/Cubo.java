package herenciavolumen;

public class Cubo extends Figura {
    private double lado;
    private double volumen;

    /**
     * Metodo constructor para el cubo
     * @param nombre
     * @param lado
     */
    public Cubo(String nombre, double lado){
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
     * Metodo para calcular el volumen
     * @return volumen
     */
    public double calcularVolumen(){
        volumen = lado * lado * lado;
        return volumen;
    }
}

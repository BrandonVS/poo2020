package herenciavolumen;

import taller1.Estudiante;

public class Esfera extends Figura {
    private double radio;
    private double volumen;

    /**
     * Metodo constructor para la esfera
     * @param nombre
     * @param radio
     */
    public Esfera(String nombre, double radio){
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
     * Metodo para calcular el volumen
     * @return volumen
     */
    public double calcularVolumen(){
        volumen = (4/3) * (Math.PI * (Math.pow(radio, 3)));
        return volumen;
    }
}

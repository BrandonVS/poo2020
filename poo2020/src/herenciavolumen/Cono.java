package herenciavolumen;

public class Cono extends Figura {
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Metodo constructor para el cono
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cono(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }

    /**
     * Metodo para obtener el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo para obtener la altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Metodo para calcular el volumen
     * @return volumen
     */
    public double calcularVolumen(){
        volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        return volumen;
    }
}

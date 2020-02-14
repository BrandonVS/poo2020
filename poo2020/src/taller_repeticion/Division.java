package taller_repeticion;

public class Division {

    // declaración de datos
    private int numero1;
    private int numero2;
    private int resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void calcularResultado() {
        int aux = numero1;
        int aux2 = 0; // Cociente de la division
        while (aux > 0) {
            aux2++;
            aux = aux - numero2;
        }
        resultado = aux2;
    }
}

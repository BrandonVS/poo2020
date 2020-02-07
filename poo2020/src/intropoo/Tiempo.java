package intropoo;

public class Tiempo {

    // Definicion de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){

        return this.hora;
    }

    /**
     * Metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto() {

        return this.minuto;
    }

    /**\
     * Metodo para obtener el valor de la variable segundo
     * @return this.segundo
     */
     public int obtener_segundo(){

        return this.segundo;
     }
    /**
     * Metodo para obtener el tiempo con los valores anteriores
     * @return tiempo
     */
     public String obtener_tiempo(){

        String tiempo = hora+":"+minuto+":"+segundo;

        return tiempo;
     }

    /**
     * Metodo para actualizar la variable hora
     * @param hora
     */
     public void actualizar_hora(int hora){
        // Con el this se hace referencia a variables globales
        this.hora = hora;
     }

    /**
     * Metodo para actualizar la variable minuto
     * @param minuto
     */
     public void actualizar_minuto(int minuto){

        this.minuto = minuto;
     }

    /**
     * Metodo para actualizar la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo) {

        this.segundo = segundo;
    }
}


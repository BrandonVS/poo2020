package taller1;

public class Celular {

    private String marca;
    private String procesador;
    private String sistemaOperativo;
    private String modelo;
    private String almacenamiento;

    /**
     * Metodo para obtener la marca
     * @return this.marca
     */
    public String obtenerMarca() {
        return this.marca;
    }

    /**
     * Metodo para obtener el procesador
     * @return this.procesador
     */
    public String obtenerProcesador() {
        return this.procesador;
    }

    /**
     * Metodo para obtener el sistema operativo
     * @return this.sistemaOperativo
     */
    public String obtenerSistemaOperativo() {
        return this.sistemaOperativo;
    }

    /**
     * Metodo para obtener el modelo
     * @return this.modelo
     */
    public String obtenerModelo() {
        return this.modelo;
    }

    /**
     * Metodo para obtener el almacenamiento
     * @return this.almacenamiento
     */
    public String obtenerAlmacenamiento() {
        return this.almacenamiento;
    }

    /**
     * Metodo para actualizar la marca
     * @param marca
     */
    public void actualizarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar el procesador
     * @param procesador
     */
    public void actualizarProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar el sistema operativo
     * @param sistemaOperativo
     */
    public void actualizarSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Metodo para actualizar el modelo
     * @param modelo
     */
    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo para actualizar el almacenamiento
     * @param almacenamiento
     */
    public void actualizarAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     * Metodo para las instrucciones
     * @return "Este metodo es que el celular obedezca instrucciones"
     */
    public String obtenerIntrucciones(){
        return "Este metodo es que el celular obedezca instrucciones";
    }

    /**
     * Metodo para la informacion
     * @return "Este metodo es para el almacenamiento de informacion"
     */
    public String obtenerInformacion(){
        return "Este metodo es para el almacenamiento de informacion";
    }

    /**
     * Metodo para transmitir informacion
     * @return "Este metodo es para la transmicion de informacion del celular"
     */
    public String obtenerTransmitir(){
        return "Este metodo es para la transmicion de informacion del celular";
    }

    /**
     * Metodo para obtener el celular
     * @return "Marca: "+marca+"\nProcesador: "+procesador+"\nSistema operativo: "+sistemaOperativo+"\nModelo: "+modelo+
     *                 "\nAlmacenamiento: "+almacenamiento
     */
    public String obtenerCelular(){
        return "Marca: "+marca+"\nProcesador: "+procesador+"\nSistema operativo: "+sistemaOperativo+"\nModelo: "+modelo+
                "\nAlmacenamiento: "+almacenamiento;
    }
}

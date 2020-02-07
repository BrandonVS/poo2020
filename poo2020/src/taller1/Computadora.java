package taller1;

public class Computadora {

    private String sistemaOperativo;
    private String procesador;
    private String ram;
    private String modelo;
    private String marca;

    /**
     * Metodo para obtener el sistema operativo
     * @return this.sistemaOperativo
     */
    public String obtenerSistemaOperativo() {
        return this.sistemaOperativo;
    }

    /**
     * Metodo para obtener el procesador
     * @return this.procesador
     */
    public String obtenerProcesador() {
        return this.procesador;
    }

    /**
     * Metodo para obtener la ram
     * @return this.ram
     */
    public String obtenerRam() {
        return this.ram;
    }

    /**
     * Metodo para obtener el modelo
     * @return this.modelo
     */
    public String obtenerModelo() {
        return this.modelo;
    }

    /**
     * Metodo para obtener la marca
     * @return this.marca
     */
    public String obtenerMarca() {
        return this.marca;
    }

    /**
     * Metodo para actualizar el sistemas operativo
     * @param sistemaOperativo
     */
    public void actualizarSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Metodo para actualizar el procesador
     * @param procesador
     */
    public void actualizarProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar la ram
     * @param ram
     */
    public void actualizarRam(String ram) {
        this.ram = ram;
    }

    /**
     * Metodo para actualizar el modelo
     * @param modelo
     */
    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo para actualizar la marca
     * @param marca
     */
    public void actualizarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para los calculos del computador
     * @return "Este metodo es para los calculos del computador"
     */
    public String obtenerCalculo(){
        return "Este metodo es para los calculos del computador";
    }

    /**
     * Metodo para las instrucciones del computador
     * @return "ste metodo es para las instrucciones del computador"
     */
    public String obtenerInstrucciones(){
        return "Este metodo es para las instrucciones del computador";
    }

    /**
     * Metodo para la informacion del computador
     * @return "Este metodo es para la informacion del computador"
     */
    public String obtenerInformacion(){
        return "Este metodo es para la informacion del computador";
    }

    /**
     * Metodo para obtener la computadora
     * @return "Sistema operativo: "+sistemaOperativo+"\nProcesador: "+procesador+"\nRAM: "+ram+"\nModelo: "+modelo+
     *                 "\nMarca: "+marca
     */
    public String obtenerComputadora(){
        return "Sistema operativo: "+sistemaOperativo+"\nProcesador: "+procesador+"\nRAM: "+ram+"\nModelo: "+modelo+
                "\nMarca: "+marca;
    }
}
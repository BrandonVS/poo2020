package taller1;

public class Vehiculo {

    private String marca;
    private String placa;
    private String color;
    private String modelo;
    private String matricula;

    /**
     * Metodo para obtener la marca
     * @return this.marca
     */
    public String obtenerMarca() {
        return this.marca;
    }

    /**
     * Metodo para obtener la placa
     * @return this.placa
     */
    public String obtenerPlaca() {
        return this.placa;
    }

    /**
     * Metodo para obtener el color
     * @return this.color
     */
    public String obtenerColor() {
        return this.color;
    }

    /**
     * Metodo para obtener el modelo
     * @return this.modelo
     */
    public String obtenerModelo() {
        return this.modelo;
    }

    /**
     * Metodo para obtener la matricula
     * @return this.matricula
     */
    public String obtenerMatricula() {
        return this.matricula;
    }

    /**
     * Metodo para actualizar la marca
     * @param marca
     */
    public void actualizarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar la placa
     * @param placa
     */
    public void actualizarPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo para actualizar el colo
     * @param color
     */
    public void actualizarColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para actualizar el modelo
     * @param modelo
     */
    public void actualizarModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo para actualizar la matricula
     * @param matricula
     */
    public void actualizarMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo para los transportes
     * @return "Este es un metodo para los transportes del vehiculo"
     */
    public String obtenerTransporte(){
        return "Este es un metodo para los transportes del vehiculo";
    }

    /**
     * Metodo para obtener el vehiculo
     * @return "Marca: "+marca+"\nPlaca: "+placa+"\nColor: "+color+"\nModelo: "+modelo+"\nMatricula: "+matricula
     */
    public String obtenerVehiculo(){
        return "Marca: "+marca+"\nPlaca: "+placa+"\nColor: "+color+"\nModelo: "+modelo+"\nMatricula: "+matricula;
    }
}

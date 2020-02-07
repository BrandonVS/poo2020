package taller1;

public class Animal {

    private String familia;
    private String raza;
    private String especie;
    private String nombreComun;
    private String nombreCientifico;

    /**
     * Metodo para obtener la familia
     * @return this.familia
     */
    public String obtenerFamilia() {
        return this.familia;
    }

    /**
     * Metodo para obtener la raza
     * @return this.raza
     */
    public String obtenerRaza() {
        return this.raza;
    }

    /**
     * Metodo para obtener la especie
     * @return this.especie
     */
    public String obtenerEspecie() {
        return this.especie;
    }

    /**
     * Metodo para obtener el nombre comun
     * @return this.nombreComun
     */
    public String obtenerNombreComun() {
        return this.nombreComun;
    }

    /**
     * Metodo para obtener el nombre cientifico
     * @return this.nombreCientifico
     */
    public String obtenerNombreCientifico() {
        return this.nombreCientifico;
    }

    /**
     * Metodo para actualizar la familia
     * @param familia
     */
    public void actualizarFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * Metodo para actualizar la raza
     * @param raza
     */
    public void actualizarRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Metodo para actualizar la especie
     * @param especie
     */
    public void actualizarEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Metodo para actualizar el nombre comun
     * @param nombreComun
     */
    public void actualizarNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    /**
     * Metodo para actualizar el nombre cientifico
     * @param nombreCientifico
     */
    public void actualizarNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     * Metodo para el nacimiento del animal
     * @return "Este metodo es para el nacimiento del animal"
     */
    public String obtenerNacer(){
        return "Este metodo es para el nacimiento del animal";
    }

    /**
     * Metodo para el crecimiento del animal
     * @return "Este metodo es para el crecimiento del animal"
     */
    public String obtenerCrecer(){
        return "Este metodo es para el crecimiento del animal";
    }

    /**
     * Metodo para la reproduccion del animal
     * @return "Este metodo es para la reproduccion del animal"
     */
    public String obtenerReproducir(){
        return "Este metodo es para la reproduccion del animal";
    }

    /**
     * Metodo para la muerte del animal
     * @return "Este metodo es para la muerte del animal"
     */
    public String obtenerMorir(){
        return "Este metodo es para la muerte del animal";
    }

    /**
     * Metodo para obtener el animal
     * @return "Familia: "+familia+"\nRaza: "+raza+"\nEspecie: "+especie+"\nNombre comun: "+nombreComun+"\nNombre c" +
     *                 "ientifico: "+nombreCientifico
     */
    public String obtenerAnimal(){
        return "Familia: "+familia+"\nRaza: "+raza+"\nEspecie: "+especie+"\nNombre comun: "+nombreComun+"\nNombre c" +
                "ientifico: "+nombreCientifico;
    }
}
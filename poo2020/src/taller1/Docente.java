package taller1;

public class Docente {

    private String nombre;
    private int identificacion;
    private int edad;
    private String genero;
    private int numTitulos;
    private String institucion;

    /**
     * Metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Metodo par obtener la identificacion
     * @return this.indentificacion
     */
    public int obtenerIdentificacion() {
        return this.identificacion;
    }

    /**
     * Metodo para obtener la edad
     * @return this.edad
     */
    public int obtenerEdad() {
        return this.edad;
    }

    /**
     * Metodo para obtener el genero
     * @return this.genero
     */
    public String obtenerGenero() {
        return this.genero;
    }

    /**
     * Metodo para obtenerel numero de titulos
     * @return this.numTitulos
     */
    public int obtenerNumTitulos() {
        return this.numTitulos;
    }

    /**
     * Metodo para obtener la institucion
     * @return this.institucion
     */
    public String obtenerInstitucion() {
        return this.institucion;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la identificacion
     * @param identificacion
     */
    public void actualizarIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Metodo para actualizar la edad
     * @param edad
     */
    public void actualizarEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para actualizar el genero
     * @param genero
     */
    public void actualizarGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Metodo para actualizar el numero de titulos
     * @param numTitulos
     */
    public void actualizarNumTitulos(int numTitulos) {
        this.numTitulos = numTitulos;
    }

    /**
     * Metodo para actualizar la institucion
     * @param institucion
     */
    public void actualizartInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * Metodo para las enseñanzas del profesor
     * @return "Este metodo es para las enseñanzas del profesor"
     */
    public String obtenerEnseñar(){
        return "Este metodo es para las enseñanzas del profesor";
    }

    /**
     * Metodo para la planificacion del profesor
     * @return "Este metodo es para la planificacion del profesor"
     */
    public String obtenerPlanificar(){
        return "Este metodo es para la planificacion del profesor";
    }

    /**
     * Metodo para las calificaciones del profesor
     * @return "Este metodo es para las calificaciones del profesor"
     */
    public String obtenerCalificar(){
        return "Este metodo es para las calificaciones del profesor";
    }

    /**
     * Metodo para obtener el docente
     * @return "Nombre: "+nombre+"\nIdentificacion: "+identificacion+"\nEdad: "+edad+"\nGenero: "+genero+"\nTitulos: "+
     *                 numTitulos+"\nInsitucion: "+institucion
     */
    public String obtenerDocente(){
        return "Nombre: "+nombre+"\nIdentificacion: "+identificacion+"\nEdad: "+edad+"\nGenero: "+genero+"\nTitulos: "+
                numTitulos+"\nInsitucion: "+institucion;
    }
}

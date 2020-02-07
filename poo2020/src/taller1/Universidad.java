package taller1;

public class Universidad {

    private String nombre;
    private String tipo;
    private int docentes;
    private int estudiantes;
    private String ubicacion;

    /**
     * Metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Metodo para obtener el tipp
     * @return this.tipo
     */
    public String obtenerTipo() {
        return this.tipo;
    }

    /**
     * Metodo para obtener el numero de docentes
     * @return this.docentes
     */
    public int obtenerDocentes() {
        return this.docentes;
    }

    /**
     * Metodo para obtener el numero de estudiantes
     * @return this.estudiantes
     */
    public int obtenerEstudiantes() {
        return this.estudiantes;
    }

    /**
     * Metodo para obtener la ubicacion
     * @return this.ubicacion
     */
    public String obtenerUbicacion() {
        return this.ubicacion;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar el tipo
     * @param tipo
     */
    public void actualizarTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para actualizar los doncentes
     * @param docentes
     */
    public void actualizarDocentes(int docentes) {
        this.docentes = docentes;
    }

    /**
     * Metodo para actualizar los estudiantes
     * @param estudiantes
     */
    public void actualizarEstudiantes(int estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Metodo para actualizar la ubicacion
     * @param ubicacion
     */
    public void actualizarUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Metodo para obtener el numero de carreras
     * @return "Este es un metodo para obtener el numero de carreras"
     */
    public String obtenerCarreras(){
        return "Este es un metodo para obtener el numero de carreras";
    }

    /**
     * Metodo para contratar docentes
     * @return "Este es un metodo para la contratacion de docentes"
     */
    public String obtenerCDoncetes(){
        return "Este es un metodo para la contratacion de docentes";
    }

    /**
     * Metodo para la repaticion de titulos
     * @return "Este es un metodo para la reparticion de titulos"
     */
    public String obtenerTitulos(){
        return "Este es un metodo para la reparticion de titulos";
    }
    /**
     * Metodo para obtener la universidad
     * @return "Nombre: "+nombre+"\nTipo: "+tipo+"\nDocentes: "+docentes+"\nEstudiantes: "+estudiantes+"\nUbicacion: "+
     *                 ubicacion
     */
    public String obtenerUniversidad(){
        return "Nombre: "+nombre+"\nTipo: "+tipo+"\nDocentes: "+docentes+"\nEstudiantes: "+estudiantes+"\nUbicacion: "+
                ubicacion;
    }
}

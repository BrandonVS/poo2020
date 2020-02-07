package taller1;

public class Estudiante {

    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String institucion;
    private int curso;
    private double nota;

    /**
     * Metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtenerNombre() {

        return this.nombre;
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
     * Metodo para obtener la nacionalidad
     * @return this.nacionalidad
     */
    public String obtenerNacionalidad() {
        return this.nacionalidad;
    }

    /**
     * Metodo para obtener la insitucion
     * @return this.institucion
     */
    public String obtenerInstitucion() {
        return this.institucion;
    }

    /**
     * Metodo para obtener el curso
     * @return this.curso
     */
    public int obtenerCurso(){
        return this.curso;
    }

    /**
     * Metodo para obtener la nota
     * @return this.nota
     */
    public double obtenerNota() {
        return this.nota;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
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
     * Metodo para actualizar la nacionalidad
     * @param nacionalidad
     */
    public void actualizarNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Metodo para actualizar la institucion
     * @param institucion
     */
    public void actualizarInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * Metodo para actualizar el curso;
     * @param curso
     */
    public void actualizarCurso(int curso) {
        this.curso = curso;
    }

    /**
     * Metodo para actualizar la nota
     * @param nota
     */
    public void actualizarNota(double nota) {
        this.nota = nota;
    }

    /**
     * Metodo para los estudios del estudiante
     * @return "Este metodo es para los estudios del estudiante"
     */
    public String obtenerEstudiar(){
        return "Este metodo es para los estudios del estudiante";
    }

    /**
     * Metodo para la asistencia del estudiante
     * Este metodo es para la asistencia del estudiante
     */
    public String obtenerAsistir(){
        return "Este metodo es para la asistencia del estudiante";
    }

    /**
     * Metodo para la participacion del estudiante
     * @return "Este metodo es para la participacion"
     */
    public String obtenerParticipar(){
        return "Este metodo es para la participacion";
    }

    /**
     * Metodo para obtener el estudiante
     * @return "Nombre: "+nombre+"\nEdad: "+edad+"\nGenero: "+genero+"\nNacionalidad: "+nacionalidad+"\nInstitucion: "
     *                 +institucion+"\nCurso: "+curso+"\nNota: "+nota
     */
    public String obtenerEstudiante(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nGenero: "+genero+"\nNacionalidad: "+nacionalidad+"\nInstitucion: "
                +institucion+"\nCurso: "+curso+"\nNota: "+nota;
    }
}
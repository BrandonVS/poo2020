package diseño_repeticion;

public class Empleado {
    private int horas;
    private int cuota;
    private String nombre;
    private int sueldo;

    /**
     * Metodo constructor
     * @param horas horas trabajadas
     * @param cuota el valor de cada hora trabajada
     * @param nombre nombre del empleado
     */
    public Empleado(int horas, int cuota, String nombre){
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuota(cuota);
    }

    /**
     * Metodo para obtener las horas trabajadas
     * @return horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Metodo para actualizar las horas trabajadas
     * @param horas horas trabajadas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Metodo para obtener la cuota
     * @return cuota
     */
    public int getCuota() {
        return cuota;
    }

    /**
     * Metodo para acutalizar la cuota
     * @param cuota valor de cada hora
     */
    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor del sueldo
     * @return sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Metodo para calcular el valor del sueldo
     * @return sueldo
     */
    public int calcularSueldo() {
        if(horas <= 40){
            return sueldo = horas * cuota;
        }else{
            return sueldo = (40 * cuota) + (horas - 40) * (cuota * 2);
        }
    }

    /**
     * Metodo para actualizar el valor del sueldo
     * @param sueldo sueldo del empleado
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}

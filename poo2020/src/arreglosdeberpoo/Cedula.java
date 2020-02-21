package arreglosdeberpoo;

public class Cedula {
    private int [] cedula = new int[10];
    private int validez = 0;

    /**
     * Metodo para obtener la cedula
     * @return cedula
     */
    public int[] getCedula() {
        return cedula;
    }

    /**
     * Metodo para actualizar la cedula
     * @param cedula cedula
     */
    public void setCedula(int[] cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el numero de comprovacion
     * @return validez
     */
    public int getValidez(){
        for(int i = 0; i < (cedula.length - 1); i++){
            if(i % 2 == 0){
                validez += cedula[i] * 2;
                if(cedula[i] * 2 >= 10){
                    validez = validez - 9;
                }
            }else{
                validez += cedula[i];
            }
        }
        validez = (validez - (validez % 10) + 10) - validez;
        return validez;
    }
}

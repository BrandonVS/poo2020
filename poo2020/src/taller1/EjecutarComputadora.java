package taller1;

public class EjecutarComputadora {

    public static void main(String[] args) {

        Computadora computadora = new Computadora();
        computadora.actualizarSistemaOperativo("Windows 10");
        computadora.actualizarProcesador("Intel Core 9");
        computadora.actualizarRam("32 GB");
        computadora.actualizarModelo("Inspiron 151515");
        computadora.actualizarMarca("Dell");

        String mostrar_computadora = computadora.obtenerComputadora();
        System.out.println(mostrar_computadora);

        String mostrar_calculo = computadora.obtenerCalculo();
        System.out.println(mostrar_calculo);

        String mostrar_instrucciones = computadora.obtenerInstrucciones();
        System.out.println(mostrar_instrucciones);

        String mostrar_informacion = computadora.obtenerInformacion();
        System.out.println(mostrar_informacion);
    }
}

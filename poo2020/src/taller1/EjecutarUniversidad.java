package taller1;

public class EjecutarUniversidad {

    public static void main(String[] args) {

        Universidad universidad = new Universidad();
        universidad.actualizarNombre("UTPL");
        universidad.actualizarTipo("Privada");
        universidad.actualizarDocentes(1000);
        universidad.actualizarEstudiantes(30000);
        universidad.actualizarUbicacion("Loja - Ecuador");

        String mostrar_universidad = universidad.obtenerUniversidad();
        System.out.println(mostrar_universidad);

        String mostrar_carreras = universidad.obtenerCarreras();
        System.out.println(mostrar_carreras);

        String mostrar_docentes = universidad.obtenerCDoncetes();
        System.out.println(mostrar_docentes);

        String mostrar_titulos = universidad.obtenerTitulos();
        System.out.println(mostrar_titulos);
    }
}

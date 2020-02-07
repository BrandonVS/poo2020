package taller1;

public class EjecutaDocente {

    public static void main(String[] args) {

        Docente docente = new Docente();
        docente.actualizarNombre("Luis Fernando Quizhpe Espinoza");
        docente.actualizarIdentificacion(1103576584);
        docente.actualizarEdad(21);
        docente.actualizarGenero("Masculino");
        docente.actualizarNumTitulos(4);
        docente.actualizartInstitucion("Club de Ajedrez La Torre");

        String mostrar_docente = docente.obtenerDocente();
        System.out.println(mostrar_docente);

        String mostrar_enseña = docente.obtenerEnseñar();
        System.out.println(mostrar_enseña);

        String mostrar_planifica = docente.obtenerPlanificar();
        System.out.println(mostrar_planifica);

        String mostrar_califica = docente.obtenerCalificar();
        System.out.println(mostrar_califica);

    }
}

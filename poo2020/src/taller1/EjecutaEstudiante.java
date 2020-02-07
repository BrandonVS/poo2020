package taller1;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.actualizarNombre("Jorge Efren Flores Ordoñez");
        estudiante.actualizarEdad(19);
        estudiante.actualizarGenero("Masculino");
        estudiante.actualizarNacionalidad("Ecuatoriana");
        estudiante.actualizarInstitucion("Universidad Tecnica Particular de Loja");
        estudiante.actualizarCurso("Computacion");
        estudiante.actualizarNota(40);

        String mostrar_estudiante = estudiante.obtenerEstudiante();
        System.out.println(mostrar_estudiante);

        String mostrar_estudia = estudiante.obtenerEstudiar();
        System.out.println(mostrar_estudia);

        String mostrar_asiste = estudiante.obtenerAsistir();
        System.out.println(mostrar_asiste);

        String mostrar_participa = estudiante.obtenerParticipar();
        System.out.println(mostrar_participa);
    }
}

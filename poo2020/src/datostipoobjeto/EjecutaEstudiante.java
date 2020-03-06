package datostipoobjeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont, opcion, edadAcum = 0;

        Estudiante estudiante;

        boolean bandera = true;

        Estudiante estudiante1 = new Estudiante();

        String[] arreglo = new String[3];

        Estudiante[] estudiantes = new Estudiante[3];

        for (cont = 0; cont < estudiantes.length; cont++) {
            System.out.println("\tINGRESO DE NUEVO ESTUDIANTE");

            System.out.println("Ingrese el nombre:");
            estudiante1.setNombre(scanner.nextLine());

            System.out.println("Ingrese su cedula:");
            estudiante1.setCedula(scanner.nextLine());

            System.out.println("Ingrese su edad:");
            estudiante1.setEdad(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Ingrese su carrera:");
            estudiante1.setCarrera(scanner.nextLine());

            System.out.println("Ingrese su correo:");
            estudiante1.setCorreo(scanner.nextLine());

            estudiantes[cont] = estudiante1;
        }

        for (cont = 0; cont < estudiantes.length; cont++) {
            edadAcum += estudiantes[cont].getEdad();
            System.out.println(estudiantes[cont].getCedula() + "\t" + estudiantes[cont].getNombre());
        }
        System.out.println("LISTA DE ESTUDIANTES\nCedula\tNombre\nEDAD PROMEDIO DE LOS ESTUDUANTES\nCedula\tNombre\n"+(edadAcum / estudiantes.length));
    }
}

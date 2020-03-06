package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bandera = true;

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Estudiante estudiante = new Estudiante();

        do {
            System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES\n1. Ingresar estudiante\n2. Presentar estudiantes\n" +
                    "3. Salir");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre:");
                    estudiante.setNombre(scanner.nextLine());

                    System.out.println("Ingrese la cedula:");
                    estudiante.setCedula(scanner.nextLine());

                    System.out.println("Ingrese la edad:");
                    estudiante.setEdad(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Ingrese la carrera:");
                    estudiante.setCarrera(scanner.nextLine());

                    System.out.println("Ingrese el correo:");
                    estudiante.setCorreo(scanner.nextLine());

                    estudiantes.add(estudiante);
                    break;
                case 2:
                    System.out.println("NOMBRE\tCEDULA\tEDAD\tCARRERA\tCORREO");
                    for (Estudiante est : estudiantes) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(est.getNombre() + "\t" + est.getCedula() + "\t" + est.getEdad() + "\t" +
                                est.getCarrera() + "\t" + est.getCorreo());
                    }
                    break;
                case 3:
                    bandera = false;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (bandera);
    }
}

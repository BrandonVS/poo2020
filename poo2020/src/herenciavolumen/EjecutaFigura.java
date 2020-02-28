package herenciavolumen;

import herencia_figura.Cuadrado;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double radio;
        double altura;
        double lado;
        boolean bandera = true;
        int opcion;

        while(bandera){
            System.out.println("\tCALCULO DEL VOLUMEN DE UNA FIGURA\n\nSeleccione la opcion pertienente\n1. Cubo\n" +
                    "2. Cilindro\n3. Cono\n4. Esfera\n5. Salir\n");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrse el lado: ");
                    lado = scanner.nextDouble();

                    Cubo cubo = new Cubo(nombre, lado);

                    System.out.println("----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", cubo.getNombre(),
                            cubo.calcularVolumen());
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese la altura: ");
                    altura = scanner.nextDouble();

                    System.out.println("Ingrese el radio: ");
                    radio = scanner.nextDouble();

                    Cilindro cilindro = new Cilindro(nombre, radio, altura);

                    System.out.println("-----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", cilindro.getNombre(),
                            cilindro.calcularVolumen());
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrse la altura:");
                    altura = scanner.nextDouble();

                    System.out.println("Ingrese le radio: ");
                    radio = scanner.nextDouble();

                    Cono cono = new Cono(nombre, radio, altura);

                    System.out.println("-----------------------------");
                    System.out.printf("\n\tEl volumen de la figura %s es %.2f\t\n", cono.getNombre(),
                            cono.calcularVolumen());
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el radio: ");
                    radio = scanner.nextDouble();

                    Esfera esfera = new Esfera(nombre, radio);

                    System.out.println("------------------------------");
                    System.out.printf("El volumen de la figura %s es %.2f\t\n", esfera.getNombre(),
                            esfera.calcularVolumen());
                    System.out.println("------------------------------");
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}

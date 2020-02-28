package herencia_figura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {

        // Creacion del Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        String nombre;
        double base;
        double altura;
        double lado;
        double radio;
        boolean bandera = true;
        int opcion;

        // Ciclo para que el usuario calcule cuantas figuras quiera
        while (bandera) {

            // Preguntar la opcion pertinente
            System.out.println("\tCALCULO DEL AREA DE UNA FIGURA\nIngrese la opcion pertinente\n\n1. Triangulo\n2. R" +
                    "ectangulo\n3. Circulo\n4. Cuadrado\n5. Salir\n");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // Dependiendo de la opcion se sigue la ruta especificada
            switch (opcion) {
                case 1:

                    // Se piden los datos del triangulo
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la base del triangulo: ");
                    base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    altura = scanner.nextDouble();

                    // Se crea el objeto triangulo
                    Triangulo triangulo = new Triangulo(nombre, base, altura);

                    // Salida de datos
                    System.out.println("-------------------------------------------");
                    System.out.println("\n\tEl area del " + triangulo.getNombre() + " es " + triangulo.calcularArea()
                            + "\t\n");
                    System.out.println("-------------------------------------------");
                    break;
                case 2:

                    // Se piden los datos del rectangulo
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la base del rectangulo: ");
                    base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    altura = scanner.nextDouble();

                    // Se crea el objeto rectangulo
                    Rectangulo rectangulo = new Rectangulo(nombre, base, altura);

                    // Salida de datos
                    System.out.println("-------------------------------------------");
                    System.out.println("\n\tEl area del " + rectangulo.getNombre() + " es " + rectangulo.calcularArea()
                            + "\t\n");
                    System.out.println("-------------------------------------------");
                    break;
                case 3:

                    // Se pide el radio del circulo
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el radio del circulo: ");
                    radio = scanner.nextDouble();

                    // Se crea el objeto circulo
                    Circulo circulo = new Circulo(nombre, radio);

                    //Salida de datos
                    System.out.println("--------------------------------------------");
                    System.out.println("\n\tEl area del " + circulo.getNombre() + " es " + circulo.calcularArea() +
                            "\t\n");
                    System.out.println("--------------------------------------------");
                    break;
                case 4:

                    // Se pide el lado del cuadrado
                    System.out.println("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingese el lado del cuadrado: ");
                    lado = scanner.nextDouble();

                    // Se crea el objeto cuadrado
                    Cuadrado cuadrado = new Cuadrado(nombre, lado);

                    // Salida de datos
                    System.out.println("--------------------------------------------");
                    System.out.println("\n\tEl area del " + cuadrado.getNombre() + " es " + cuadrado.calcularArea() +
                            "\t\n");
                    System.out.println("--------------------------------------------");
                    break;
                case 5:

                    // Se establece la bandera como false para terminar el proceso
                    bandera = false;
                    break;
                default:

                    // En caso de ingresar una opcion erronea
                    System.out.println("--------------------------------------------");
                    System.out.println("\n\tOpcion invalida\t\n");
                    System.out.println("--------------------------------------------");
                    break;
            }
        }
    }
}

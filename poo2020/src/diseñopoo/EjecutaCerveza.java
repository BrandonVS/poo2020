package diseñopoo;

import java.util.Scanner;

public class EjecutaCerveza {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Tipo: ");
        String tipo = scan.nextLine();

        System.out.println("Precio: ");
        double precio = scan.nextDouble();

        System.out.println("Unidades vendidas: ");
        int unidadesVendidas = scan.nextInt();

        System.out.println("______________________________________________________________");
        Cerveza cerveza = new Cerveza(precio, unidadesVendidas, nombre, tipo);
        System.out.println(cerveza.getCerveza());
        System.out.println("Total ingresos: "+cerveza.obtenerPrecioT(precio, unidadesVendidas));
        System.out.println("______________________________________________________________");
    }
}

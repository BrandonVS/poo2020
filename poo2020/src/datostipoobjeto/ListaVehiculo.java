package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bandera = true;
        Vehiculo registro;
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Vehiculo vehiculo = new Vehiculo();
        do {
            System.out.println("SISTEMA DE INGRESO DE VEHICULOS\n1. Ingresar vehiculo\n2. Presentar vehiculos\n3. Sal" +
                    "ir");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el la placa:");
                    vehiculo.setPlaca(scanner.nextLine());

                    System.out.println("Ingrese la marca:");
                    vehiculo.setMarca(scanner.nextLine());

                    System.out.println("Ingrese el modelo:");
                    vehiculo.setModelo(scanner.nextLine());

                    System.out.println("Ingrese el color:");
                    vehiculo.setColor(scanner.nextLine());

                    System.out.println("Ingrese el cilindraje:");
                    vehiculo.setCilindraje(scanner.nextLine());

                    System.out.println("Ingrese el año del vehiculo:");
                    vehiculo.setFecha(scanner.nextInt());

                    registro = vehiculo;
                    vehiculos.add(registro);
                    break;
                case 2:
                    System.out.println("PLACA\tMARCA\tMODELO\tAÑO\tCLINDRAJE\tCOLOR");
                    for (Vehiculo veh: vehiculos) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(veh.getPlaca()+"\t"+veh.getMarca()+"\t"+veh.getModelo()+"\t"+veh.getFecha()+
                                "\t"+veh.getCilindraje()+"\t"+veh.getColor());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (bandera);
    }
}
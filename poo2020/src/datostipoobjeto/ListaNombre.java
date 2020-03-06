package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bandera = true;

        List<String> nom = new ArrayList<String>();
        while(bandera){
            System.out.println("\nMENU DE OPCIONES\n\n1. Agregar un nuevo nombre\n2. Presentar lista de nombres\n3. " +
                    "Salir");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Ingrese el nombre:");
                    nom.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Lista de nombres:");
                    for(int i = 0; i < nom.size(); i++){
                        System.out.println(nom.get(i));
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
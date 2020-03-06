package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        /*
        * Creacion de una lista en java
        * para almacenar valores de tipo String
        */
        List<String> univ = new ArrayList<String>();

        univ.add("UTPL");
        System.out.println("El tamaño de la lista es: "+univ.size());
        univ.add("ESPOL");
        System.out.println("El tamaño de la lista es: "+univ.size());
        univ.add("UNL");
        System.out.println("El tamaño de la lista es: "+univ.size());
        univ.remove(1);
        System.out.println("El tamaño de la lista es: "+univ.size());
        univ.set(1, "UIDE");
        univ.add(1, "UNL");
        for(int i = 0; i < univ.size(); i++){
            System.out.println("Lista en la posicion "+(i+1)+" es "+univ.get(i));
        }

        for(String univer: univ){
            System.out.println(univer);
        }
    }
}

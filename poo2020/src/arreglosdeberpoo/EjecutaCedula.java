package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cedula cedula = new Cedula();
        char [] aux1;
        int [] aux2 = new int[10];

        System.out.println("Ingrese su cedula digito por digito: ");
        String ident = scanner.nextLine();

        aux1 = ident.toCharArray();
        for(int i = 0; i < aux1.length; i++){
            aux2[i] = Character.getNumericValue(aux1[i]);
        }
        cedula.setCedula(aux2);

        if(cedula.getValidez() == aux2[9]){
            System.out.println("La cedula: "+ident+" es valida.");
        }else{
            System.out.println("La cedula: "+ident+" no es valida");
        }
    }
}

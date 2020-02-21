package matrizpoo;
import java.util.Scanner;
public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();

        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];

        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                System.out.println("Ingresar numero en la pocision "+(i+1)+" "+(j+1)+" de la matriz A:");
                int num = scanner.nextInt();

                matrizA[i][j] = num;
            }
        }
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                System.out.println("Ingresar numero en la pocision "+(i+1)+" "+(j+1)+" de la matriz B:");
                int num = scanner.nextInt();

                matrizB[i][j] = num;
            }
        }
        matriz.setMatrizA(matrizA);
        matriz.setMatrizB(matrizB);

        matriz.getReporte();
    }
}

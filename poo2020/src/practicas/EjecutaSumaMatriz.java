package practicas;
import java.util.Scanner;
public class EjecutaSumaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumaMatriz sumaMatriz = new SumaMatriz();

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
        sumaMatriz.setMatrizA(matrizA);
        sumaMatriz.setMatrizB(matrizB);

        sumaMatriz.getReporte();
    }
}

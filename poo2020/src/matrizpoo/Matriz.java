package matrizpoo;

public class Matriz {
    private int [][] matrizA = new int[3][3];
    private int [][] matrizB = new int[3][3];
    private int [][] matrizC = new int[3][3];


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }

    public void getReporte(){
        System.out.println("Matriz A:");
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                System.out.print(matrizA[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B:");
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                System.out.print(matrizB[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz C:");
        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA.length; j++){
                System.out.print(getMatrizC()[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

package EjerciciosMatrices;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matNums = {
                {1, 2, 3},
                {4, 5, 6} };

        mostrarMatriz(matNums);
    }
    public static void mostrarMatriz(int[][] matNums) {
        for (int iPosFila = 0; iPosFila < matNums.length; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < matNums[iPosFila].length; iPosColumna++) {
                System.out.printf("%d", matNums[iPosFila][iPosColumna]);
            }
            System.out.println();
        }
    }
}

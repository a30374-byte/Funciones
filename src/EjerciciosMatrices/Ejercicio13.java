package EjerciciosMatrices;
public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] matNums = { {2, 4, 6},
                {1, 2, 3} };

        System.out.printf("La suma es %d", sumaTotalMatriz(matNums));
    }

    public static int sumaTotalMatriz(int[][] matNums) {
        int iTotal = 0;

        for (int iPosFila = 0; iPosFila < 2; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < 3; iPosColumna++) {
                iTotal += matNums[iPosFila][iPosColumna];
            }
        }

        return iTotal;
    }
}

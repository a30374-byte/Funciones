package EjerciciosMatrices;

import java.util.Scanner;
import Constantes.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matNums = new int[Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12][Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12];

        for (int iPosFila = 0; iPosFila < Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12; iPosColumna++) {
                System.out.printf("Introduce el valor [%s][%s]%n", iPosFila, iPosColumna);
                matNums[iPosFila][iPosColumna] = sc.nextInt();
            }
        }

        System.out.println();

        for (int iPosFila = 0; iPosFila < Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < Constantes.MAX_DIMENSION_LENGTH_MAT_EJ12; iPosColumna++) {
                System.out.printf("%d", matNums[iPosFila][iPosColumna]);
            }
            System.out.println();
        }
    }
}

package EjerciciosMatrices;

import Constantes.Constantes;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int[][] matNums = new int[Constantes.MAX_ROW_LENGTH_MAT_EJ15][Constantes.MAX_COL_LENGTH_MAT_EJ15];

        inputMatrix(matNums);

        System.out.printf("La suma es %d", sumaTotalMatriz(matNums));
    }

    public static void inputMatrix(int[][] matNums){
        Scanner sc = new Scanner(System.in);

        for (int iPosFila = 0; iPosFila < Constantes.MAX_ROW_LENGTH_MAT_EJ15; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < Constantes.MAX_COL_LENGTH_MAT_EJ15; iPosColumna++) {
                System.out.printf("Introduce el valor para la posicion [%d][%d]%n", iPosFila, iPosColumna);
                matNums[iPosFila][iPosColumna] = sc.nextInt();
            }
        }

        System.out.println();
    }

    public static int sumaTotalFilaMatriz(int[][] matNums) {
        int iTotalFila = 0;

        for (int iPosFila = 0; iPosFila < 2; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < 3; iPosColumna++) {
                iTotalFila += matNums[iPosFila][iPosColumna];
            }
        }

        return iTotal;
    }

}

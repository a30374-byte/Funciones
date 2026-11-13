package EjerciciosMatrices;

import java.util.Scanner;
import Constantes.*;

public class Ejercicio14 {

    public static void main(String[] args) {
        int[][] matNums = new int[Constantes.MAX_ROW_LENGTH_MAT_EJ14][Constantes.MAX_COL_LENGTH_MAT_EJ14];

        inputMatrix(matNums);

        System.out.printf("Hemos encontrado %s números pares", contarParesEnMatriz(matNums));
    }

    public static void inputMatrix(int[][] matNums){
        Scanner sc = new Scanner(System.in);

        for (int iPosFila = 0; iPosFila < Constantes.MAX_ROW_LENGTH_MAT_EJ14; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < Constantes.MAX_COL_LENGTH_MAT_EJ14; iPosColumna++) {
                System.out.printf("Introduce el valor para la posicion [%d][%d]%n", iPosFila, iPosColumna);
                matNums[iPosFila][iPosColumna] = sc.nextInt();
            }
        }

        System.out.println();
    }

    public static int contarParesEnMatriz(int[][] matNums){
        int iCounter = 0;

        for (int iPosFila = 0; iPosFila < Constantes.MAX_ROW_LENGTH_MAT_EJ13; iPosFila++) {
            for (int iPosColumna = 0; iPosColumna < Constantes.MAX_COL_LENGTH_MAT_EJ13; iPosColumna++) {
                if (matNums[iPosFila][iPosColumna] % 2 == 0){
                    iCounter++;
                }
            }
        }
        return iCounter;
    }
}

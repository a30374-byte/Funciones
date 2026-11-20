package EjerciciosArrays;

import Constantes.Constantes;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNums = new int[Constantes.MAX_LENGTH_ARRAY];

        System.out.printf("Introduce 5 numeros%n");
        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            arrNums[i] = sc.nextInt();
        }

        int i = Constantes.MAX_LENGTH_ARRAY - 1;
        escribeArray(arrNums, i);
    }
    public static void escribeArray(int[] arrNums, int i) {
        if (i >= 0) {
            System.out.printf("%d ", arrNums[i]);
            escribeArray(arrNums, i - 1);
        }
    }
}

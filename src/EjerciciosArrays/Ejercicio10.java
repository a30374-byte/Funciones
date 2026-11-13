package EjerciciosArrays;

import Constantes.Constantes;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNums = new int[Constantes.MAX_LENGTH_ARRAY];

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("Introduce un numero%n");
            arrNums[i] = sc.nextInt();
        }
        for (int i = Constantes.MAX_LENGTH_ARRAY - 1; i >= 0; i--) {
            System.out.printf("%d ", arrNums[i]);
        }
    }
}

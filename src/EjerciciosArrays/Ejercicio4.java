package EjerciciosArrays;

import Constantes.*;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNums = new int[Constantes.MAX_LENGTH_ARRAY_EJ4];

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY_EJ4; i++) {
            System.out.printf("Introduce un numero %n");
            arrNums[i] = sc.nextInt();
        }

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY_EJ4; i++) {
            System.out.printf("%d%n", arrNums[i]);
        }
    }
}

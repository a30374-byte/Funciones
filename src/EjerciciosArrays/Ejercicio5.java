package EjerciciosArrays;

import Constantes.*;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNums = new int[Constantes.MAX_LENGTH_ARRAY];
        int iTotal = 0;

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("Introduce un numero %n");
            arrNums[i] = sc.nextInt();

            iTotal += arrNums[i];
        }

        System.out.printf("El total es: %d", iTotal);

    }
}

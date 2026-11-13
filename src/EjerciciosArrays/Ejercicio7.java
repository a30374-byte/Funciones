package EjerciciosArrays;

import Constantes.*;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] arrNums = new int[Constantes.MAX_LENGTH_ARRAY];

        Scanner sc = new Scanner(System.in);
        double dTotal = 0;
        double dAvg;

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("Introduce una nota %n");
            arrNums[i] = sc.nextInt();

            dTotal += arrNums[i];
        }
        dAvg = dTotal / Constantes.MAX_LENGTH_ARRAY;

        System.out.print("Las notas son: ");
        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("%d ", arrNums[i]);
        }
        System.out.printf("y la media es: %.2f%n", dAvg);


    }
}

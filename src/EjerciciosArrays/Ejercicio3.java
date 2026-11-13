package EjerciciosArrays;

import Constantes.*;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] arrNames = new String[Constantes.MAX_LENGTH_ARRAY];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("Introduce un nombre %n");
            arrNames[i] = sc.nextLine();
        }

        for (int i = 0; i < Constantes.MAX_LENGTH_ARRAY; i++) {
            System.out.printf("%s%n", arrNames[i]);
        }

    }
}

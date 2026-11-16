package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum1;
        int iNum2;

        System.out.printf("Introduce un numero %n");
        iNum1 = sc.nextInt();

        System.out.printf("Introduce un numero %n");
        iNum2 = sc.nextInt();

        System.out.printf("La suma es %d", sumar(iNum1, iNum2));
    }
    public static int sumar(int iNum1, int iNum2){
        return iNum1 + iNum2;
    }
}

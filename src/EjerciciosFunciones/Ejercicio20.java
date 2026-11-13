package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int iNum;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero entero %n");
        iNum = sc.nextInt();

        if (esPar(iNum)){
            System.out.printf("%d es par", iNum);
        }
        else {
            System.out.printf("%d es impar", iNum);
        }
    }
    public static boolean esPar(int iNum){
        return iNum % 2 == 0;
    }
}

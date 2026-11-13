package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iBase;
        int iAltura;

        System.out.printf("Introduce un numero %n");
        iBase = sc.nextInt();

        System.out.printf("Introduce un numero %n");
        iAltura = sc.nextInt();

        System.out.printf("El area del rectángulo es %d m²", areaRectangulo(iBase, iAltura));
    }
    public static int areaRectangulo(int iBase, int iAltura){
        return iBase * iAltura;
    }
}

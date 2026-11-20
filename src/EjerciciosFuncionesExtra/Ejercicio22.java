package EjerciciosFuncionesExtra;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        // Contar de X a 0 con recursividad
        Scanner sc = new Scanner(System.in);

        int iNum;
        do {
            System.out.println("Dame un número");
            iNum = sc.nextInt();
        } while (iNum <= 0);

        escribeNumero(iNum);

    }
    public static void escribeNumero(int iNum) {
        if (iNum >= 0) {
            System.out.println(iNum);
            escribeNumero(iNum - 1);
        }
    }


}

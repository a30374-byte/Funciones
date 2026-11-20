package EjerciciosFuncionesExtra;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Contar de X a 0 con recursividad, al revés
        Scanner sc = new Scanner(System.in);



        int iNum;
        do {
            System.out.println("Dame un número");
            iNum = sc.nextInt();
        } while (iNum <= 0);

        int i = 0;
        escribeNumero(iNum, i);
    }
    public static void escribeNumero(int iNum, int i) {
        if (i <= iNum) {
            System.out.println(i);
            escribeNumero(iNum, i + 1);
        }
    }
}

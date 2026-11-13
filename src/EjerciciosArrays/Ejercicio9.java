package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int iFoundAt = 0;
        int[] arrNums = {3, 8, 12, 5, 7, 14, 20, 9};

        int iNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero y miraré si está en el array");
        iNum = sc.nextInt();

        iFoundAt = findValueInArray(iFoundAt, arrNums, iNum);

        if (iFoundAt == -1){
            System.out.printf("%d no está en el array", iNum);
        }
        else {
            System.out.printf("%d está en el array en la posicion %d", iNum, iFoundAt);
        }
    }
    public static int findValueInArray(int iFoundAt, int[] arrNums, int iNum){
        boolean bFound = false;

        for (int i = 0; i < arrNums.length && !bFound; i++) {
            // System.out.printf("Ejecucion %d%n", i+1);
            if (iNum == arrNums[i]){
                iFoundAt = i+1;
                bFound = true;
            }
        }
        if (!bFound) {
            iFoundAt = -1;
        }

        return iFoundAt;
    }
}

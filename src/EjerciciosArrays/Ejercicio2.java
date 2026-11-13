package EjerciciosArrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arrNums = {10, 20, 30, 40, 50};

        for (int i = 0; i < arrNums.length; i+=2) {
            System.out.printf("%d%n", arrNums[i]);
        }
    }
}

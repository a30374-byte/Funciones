package EjerciciosArrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arrNums = {10, 20, 30, 40, 50};
        int i = 0;

        outputMatrix(i, arrNums);
    }
    public static void outputMatrix(int i, int[] arrNums) {
        if (i < arrNums.length) {
            System.out.printf("%d ", arrNums[i]);
            outputMatrix(i + 2, arrNums);
        }
    }
}

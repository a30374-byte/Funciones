package EjerciciosArrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arrNums = {4, 8, 12, 16, 20};
        int i = 0;

        outputArray(i, arrNums);
    }
    public static void outputArray(int i, int[] arrNums){
        if (i < arrNums.length){
            System.out.printf("%d ", arrNums[i]);
            outputArray(i + 1, arrNums);
        }
    }
}

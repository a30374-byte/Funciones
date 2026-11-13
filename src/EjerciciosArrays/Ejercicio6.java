package EjerciciosArrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int iCounter = 0;

        int[] arrNums = {5, 12, 8, 25, 3, 18, 40, 7};

        for (int i = 0; i < arrNums.length; i++) {
            System.out.printf("%d ", arrNums[i]);
            if (arrNums[i] > 10){
                iCounter++;
            }
        }

        System.out.printf("%nHay %d numeros mayores que 10, y %d en total", iCounter, arrNums.length);
    }
}

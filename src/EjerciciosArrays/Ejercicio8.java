package EjerciciosArrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] arrNums = {3, 8, 12, 5, 7, 14, 20, 9};

        int iCounter = 0;

        for (int i = 0; i < arrNums.length; i++) {
            if (arrNums[i] % 2 == 0){
                iCounter++;
            }
        }
        System.out.printf("Hemos encontrado %d numeros pares.", iCounter);
    }
}

package EjerciciosFuncionesAnton;

public class EjercicioFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursivo(6));
    }
    // 0 + 1 + 1 + 2 + 3 + 5 + 8

    public static int fibonacciRecursivo(int A){
        int iRet = 0;
        if (A <= 1){
            iRet = A;
        }
        else {
            iRet = fibonacciRecursivo(A - 1) + fibonacciRecursivo(A - 2);
        }
        return iRet;
    }
}

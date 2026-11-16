package EjerciciosFuncionesAnton;

public class EjercicioFactorial {
    public static void main(String[] args) {

        System.out.println(calcularFactorial(5));

        System.out.println(factorialRecursivo(5));

    }
    public static int calcularFactorial(int A){
        int iNum = A;
        int iRet = 1;
        while (iNum > 1) {
            iRet *= iNum;
            iNum--;
        }
        return iRet;
    }

    public static int factorialRecursivo(int A){
        int iRet;
        if (A<= 1) {
            iRet = 1;
        }
        else {
            iRet = A * factorialRecursivo(A - 1);
        }
        return iRet;
    }
}

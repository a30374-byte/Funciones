package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName;

        System.out.println("Introduce tu nombre");
        strName = sc.nextLine();

        saludar(strName);
    }
    public static void saludar(String strName){
        System.out.printf("Hola %s, bienvenido al programa", strName);
    }
}

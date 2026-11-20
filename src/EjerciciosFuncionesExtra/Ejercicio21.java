package EjerciciosFuncionesExtra;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Ejercicio área y perímetro de un triángulo rectángulo
        Scanner sc = new Scanner(System.in);

        double dAltura;
        double dBase;

        System.out.println("Introduce la altura y base del triángulo");
        dAltura = sc.nextDouble();
        dBase = sc.nextDouble();

        System.out.println();

        System.out.printf("El área es %.2f %n", calcularArea(dAltura, dBase));

        System.out.printf("El perímetro es %.2f", calcularPerimetro(dAltura, dBase));


    }
    public static double calcularArea(double iAltura, double iBase) {
        return (iAltura * iBase) / 2.0;
    }
    public static double calcularPerimetro(double iAltura, double iBase) {
        double dHipotenusa = Math.sqrt(Math.pow(iAltura, 2) + Math.pow(iBase, 2));

        return iAltura + iBase + dHipotenusa;
    }
}

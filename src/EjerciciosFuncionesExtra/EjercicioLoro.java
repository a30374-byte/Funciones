package EjerciciosFuncionesExtra;

import java.util.Scanner;

public class EjercicioLoro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strStop = "";
        String strLoro = "";

        strLoro = getWord(sc, strLoro);

        do {
            cantarLoro(sc, strLoro, strStop);
            strStop = sc.nextLine();
            if (checkNo(strStop)){
                strLoro = getWord(sc, strLoro);
            }
        } while (checkNo(strStop));

    }
    public static void cantarLoro(Scanner sc, String strLoro, String strStop) {
        strStop = sc.nextLine();

        if (checkNo(strStop)) {
            System.out.printf("%s", strLoro);
            cantarLoro(sc, strLoro, strStop);
        }
    }
    public static String getWord(Scanner sc, String strLoro) {
        System.out.printf("Pon una palabra%n");
        return strLoro = sc.nextLine();
    }
    public static boolean checkNo(String strNo){
        return !strNo.equals("no") && !strNo.equals("No") && !strNo.equals("nO") && !strNo.equals("NO");
    }
}

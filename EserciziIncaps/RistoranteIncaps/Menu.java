package RistoranteIncaps;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean exitFromMain = false;
        while (!exitFromMain) {
            System.out.println("Vuoi ordinare o uscire?\n1) Ordina\n2) Esci");
            Scanner scannerInt = new Scanner(System.in);
            int mainChoice = scannerInt.nextInt();

            if (mainChoice == 1) {

            } else if (mainChoice == 2) {
                System.out.println("Ciao!");
                exitFromMain = true;

            } else {
                System.out.println("Opzione non disponibile");
            }
        }
    }
}

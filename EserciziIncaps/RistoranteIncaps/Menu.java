package RistoranteIncaps;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        // * spesa totale (panino)
        double totalAmount = 0;
        Dish userDish = new Dish();
        boolean exitFromMain = false;

        while (!exitFromMain) {
            System.out.println("Vuoi ordinare o uscire?\n1) Ordina\n2) Esci");

            int mainChoice = scannerInt.nextInt();

            switch (mainChoice) {
                case 1:

                    break;
                case 2:
                    System.out.println("Alla prossima!");
                    exitFromMain = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }

        }
        scannerInt.close();
        scannerString.close();
    }

    void ChooseBread() {
        System.out.println("Scegli il pane:\n1) Classico\n2) Integrale\n3) Con sesamo");
    }
}

package ristorante;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GestioneMain {
    public static void main(String[] args) {
        ArrayList<Piatto> menu = new ArrayList<Piatto>();
        Menu todayMenu = new Menu(menu);
        todayMenu.CreateMenu();

        // * variabile controllo loop
        boolean exitFromMain = false;

        while (!exitFromMain) {
            print("Vuoi ordinare o uscire?\n[1] Entra\n[2] Esci");

            int userChoice = IntScanner();
            Ordinazione userOrder = new Ordinazione();

            switch (userChoice) {
                case 1:
                    boolean exit = false;
                    while (!exit) {
                        print("[1] Ordina\n [2] Annulla");
                        int userOrderChoice = IntScanner();
                        if (userOrderChoice == 1) {
                            print("Seleziona un piatto da acquistare: ");
                            for (int i = 0; i < menu.size(); i++) {
                                print("[" + i + "]" + " per " + menu.get(i).getDishName());
                            }
                            int i = IntScanner();
                            userOrder.addDish(menu.get(i));

                            int totale = userOrder.calcTotalPrice(); // ! si aggiorna
                            System.out.println("Hai speso " + totale);
                        } else {
                            exit = true;
                        }

                    }

                    break;
                case 2:
                    print("Hai speso: " + userOrder.calcTotalPrice()); // ! non si aggiorna

                    print("Alla prossima!");
                    exitFromMain = true;
                    break;
                default:
                    print("Opzione non disponibile, riprovare");
            }
        }
    }

    public static int IntScanner() {
        Scanner intScanner = new Scanner(System.in);
        int userInt = intScanner.nextInt();

        return userInt;
    }

    public static void print(String string) {
        System.out.println(string);
    }
}

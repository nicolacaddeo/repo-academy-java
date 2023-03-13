package try_catch_esercizio;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Scegli un'opzione:\n[1] Addizione\n[2] Sottrazione\n[3] Divisione\n[4] Esci");
            int userChoice;

            userChoice = intScanner();
            // *se l'utente non inserisce un numero il metodo ritona 0 e non si entra
            if (userChoice != 0 && userChoice != 4) {
                System.out.print("Inserisci il primo numero: ");
                int firstNumber = intScanner();
                System.out.print("Inserisci il secondo numero: ");
                int secondNumber = intScanner();
                int[] results;
                results = new int[4];

                Calcolatrice calc = new Calcolatrice(firstNumber, secondNumber, results);
                switch (userChoice) {
                    case 1:
                        System.out.println(calc.Addizione());
                        break;
                    case 2:
                        calc.Sottrazione();
                        break;
                    case 3:
                        calc.Divisione();
                        break;
                    default:
                        System.out.println("Opzione non disponibile riprovare");
                }
            } else if (userChoice == 4) {
                System.out.println("Alla prossima!");
                exit = true;
            }

        }
    }

    public static int intScanner() {
        Scanner intScanner = new Scanner(System.in);
        int userChoice;
        try {
            userChoice = intScanner.nextInt();
            return userChoice;

        } catch (Exception e) {
            System.out.println("Non hai inserito un numero");
            return 0;
        }

    }
}

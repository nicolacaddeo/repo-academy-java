package registra_veicolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Vuoi registrare un veicolo o uscire?\n[1] Registra\n[2] Esci");
            int mainChoice = IntScanner();
            switch (mainChoice) {
                case 1:
                    Auto car1 = new Auto("Audi", "A3", 2011, 3, "Gasolio", 7);
                    Auto car2 = new Auto("Audi", "A4", 2015, 5, "Gasolio", 6);
                    break;
                case 2:
                    System.out.println("Ciao!");
                    exit = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile riprovare");
            }
        }
    }

    public static int IntScanner() {
        Scanner intScanner = new Scanner(System.in);
        int userIntInput = intScanner.nextInt();
        return userIntInput;
    }
}

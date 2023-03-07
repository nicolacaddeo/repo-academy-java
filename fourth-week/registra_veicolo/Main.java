package registra_veicolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        boolean exitFromMenu = false;
        while (!exit) {
            System.out.println("Vuoi registrare un veicolo o uscire?\n[1] Registra\n[2] Esci");
            int mainChoice = IntScanner();
            switch (mainChoice) {
                case 1:
                    while (!exitFromMenu) {
                        System.out.println("Che tipo di veicolo vuoi registrare?\n[1] Auto\n[2] Moto\n[3] Esci");
                        int registerChoice = IntScanner();
                        if (registerChoice == 1) {
                            Auto car = RegisterCar();
                            PrintCar(car);
                        } else if (registerChoice == 2) {

                        } else if ((registerChoice == 3)) {
                            exitFromMenu = true;
                        }
                    }

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

    public static String stringScanner() {

        Scanner stringScanner = new Scanner(System.in);
        String userStringInput = stringScanner.nextLine();
        return userStringInput;
    }

    public static Auto RegisterCar() {
        System.out.print("Inserisci la marca: ");
        String marca = stringScanner();

        System.out.print("Inserisci il modello: ");
        String modello = stringScanner();

        System.out.print("Inserisci l'anno di fabbricazione: ");
        int annoFabbricazione = IntScanner();

        System.out.print("Inserisci il numero di porte: ");
        int numeroPorte = IntScanner();

        System.out.print("Inserisci il tipo di carburante (diesel/benzina): ");
        String tipoCarburante = stringScanner();

        Auto car = new Auto(marca, modello, annoFabbricazione, numeroPorte, tipoCarburante);
        return car;
    }

    public static void PrintCar(Auto auto) {
        System.out.println("Ecco il veicolo registrato:");

        System.out.println("Marca: " + auto.getMarca());

        System.out.println("Modello: " + auto.getModello());

        System.out.println("Anno di fabbricazione: " + auto.getAnnoFabbricazione());

        System.out.println("Numero di porte: " + auto.getNumeroPorte());

        System.out.println("Tipo di Carburante: " + auto.getTipoCarburante());

        System.out.println("Consumo medio calcolato: " + auto.getConsumoMedio() + "L/100Km");
    }
}
// Auto car1 = new Auto("Audi", "A3", 2011, 3, "diesel");
// System.out.println("Consumo car1 --> " + car1.getConsumoMedio());

// Auto car2 = new Auto("Audi", "A4", 2015, 5, "benzina");
// System.out.println("Consumo car2 --> " + car2.getConsumoMedio());

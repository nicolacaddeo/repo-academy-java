import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        println("Benvenuto nella gestione aerei di Java");

        Airline airline = new Airline();

        boolean exitFromMain = false;
        while (!exitFromMain) {
            println("[1] Entra\n[2] Esci");
            int userMainChoice = IntScanner();
            boolean exit = false;

            switch (userMainChoice) {
                case 1:
                    while (!exit) {
                        println("Scegli un'opzione:\n[1] Aggiungi aereo\n[2] Rimuovi aereo\n[3] Calcolca capacitá totale\n[4] Cercare in base ai posti\n[5] Visualizza lista\n[6] Esci");
                        int userChoice = IntScanner();
                        switch (userChoice) {
                            case 1: // * aggiungi ---
                                println("Vuoi aggiungere:\n[1] Aereo passeggeri\n[2] Aereo Cargo");
                                int typeOfPlane = IntScanner();
                                if (typeOfPlane == 1) {
                                    PassengerPlane planeToAdd = userAddPassenger();
                                    airline.addPassPlain(planeToAdd);

                                } else if (typeOfPlane == 2) {
                                    CargoPlane planeToAdd = userAddCargo();
                                    airline.addCargoPlain(planeToAdd);

                                } else {
                                    println("Opzione non disponibile, riprovare");
                                }
                                break;
                            case 2: // * rimuovi ---
                                println("Che tipo vuoi rimuovere?\n[1] Passeggeri\n[2] Cargo");
                                int removeChoice = IntScanner();
                                println("Scegli l'aereo da rimuovere");
                                if (removeChoice == 1) {
                                    airline.viewPassPlanes();
                                    int planeToRemove = IntScanner();
                                    airline.removePassPlain(planeToRemove);

                                } else if (removeChoice == 2) {
                                    airline.viewCargoPlanes();
                                    int planeToRemove = IntScanner();
                                    airline.removeCargoPlain(planeToRemove);
                                }
                                break;
                            case 3: // * calcolo capacitá totale
                                int totalCapacity = airline.getTotalCapacity();
                                println("La capacitá totale é: " + totalCapacity);
                                break;
                            case 4: // * cerca per numero di posti
                                println("--- Ricerca in base a numero posti ---");
                                print("Inserisci il numero di posti per la ricerca: ");
                                int seats = IntScanner();
                                airline.searchBySeats(seats);
                                break;
                            case 5: // * visualizza lista di tutti i veivoli
                                airline.viewPassPlanes();
                                airline.viewCargoPlanes();
                                break;
                            // ! MANCA IL METODO PER CERCARE IN BASE ALLA CAPACITA MASSIMA
                            case 6:
                                println("Alla prossima!");
                                exit = true;
                                break;
                            default:
                                println("Opzione non disponibile, riprovare");
                        }
                    }
                    break;
                case 2:
                    exitFromMain = true;
                    break;
                default:
                    println("Opzione non disponibile, riprovare");
            }

        }

    }

    static void println(String string) {
        System.out.println(string);
    }

    static void print(String string) {
        System.out.print(string);
    }

    public static String stringScanner() {

        Scanner stringScanner = new Scanner(System.in);
        String userStringInput = stringScanner.nextLine();
        return userStringInput;
    }

    public static int IntScanner() {
        Scanner intScanner = new Scanner(System.in);
        int userIntInput = intScanner.nextInt();
        return userIntInput;
    }

    public static PassengerPlane userAddPassenger() {
        print("Inserisci il nome del veivolo: ");
        String plainName = stringScanner();

        print("Inserisci posti a sedere: ");
        int numsSeats = IntScanner();

        print("Inserisci capacitá di carico: ");
        int loadCapacity = IntScanner();

        print("Inserisci il numero dei servizi: ");
        int numsServices = IntScanner();

        PassengerPlane plane = new PassengerPlane(plainName, numsSeats, loadCapacity, numsServices);
        return plane;

    }

    public static CargoPlane userAddCargo() {
        print("Inserisci il nome del veivolo: ");
        String plainName = stringScanner();

        print("Inserisci posti a sedere: ");
        int numsSeats = IntScanner();

        print("Inserisci capacitá di carico: ");
        int loadCapacity = IntScanner();

        print("Inserisci la capacitá di carico massima: ");
        int maxLoad = IntScanner();

        CargoPlane plane = new CargoPlane(plainName, numsSeats, loadCapacity, maxLoad);
        return plane;
    }

}

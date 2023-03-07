package registra_veicolo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Auto> createdCars = new ArrayList<Auto>();
    static ArrayList<Moto> createdCycle = new ArrayList<Moto>();

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
                            Moto motorcycle = RegisterMotorcycle();
                            PrintCycle(motorcycle);
                        } else if ((registerChoice == 3)) {
                            System.out.println("Auto registrate: " + createdCars.size());
                            System.out.println("Moto registrate: " + createdCycle.size());
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
        createdCars.add(car);
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

    public static Moto RegisterMotorcycle() {
        System.out.print("Inserisci la marca: ");
        String marca = stringScanner();

        System.out.print("Inserisci il modello: ");
        String modello = stringScanner();

        System.out.print("Inserisci l'anno di fabbricazione: ");
        int annoFabbricazione = IntScanner();

        System.out.print("Inserisci la cilindrata: ");
        int cilindrata = IntScanner();

        System.out.print("Inserisci la tipologia: ");
        String tipologia = stringScanner();

        Moto motorcycle = new Moto(marca, modello, annoFabbricazione, cilindrata, tipologia);
        createdCycle.add(motorcycle);
        return motorcycle;
    }

    public static void PrintCycle(Moto moto) {
        System.out.println("Ecco il veicolo registrato:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modello: " + moto.getModello());
        System.out.println("Anno di fabbricazione: " + moto.getAnnoFabbricazione());
        System.out.println("Cilindrata: " + moto.getCilindrata());
        System.out.println("Tipologia: " + moto.getTipologia());
        System.out.println("Potenza calcolata: " + moto.getPotenza() + "Kw");
    }
}

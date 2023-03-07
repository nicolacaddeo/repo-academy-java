package registra_animali;

import java.util.Scanner;
import java.util.ArrayList;

public class MainAnimali {
    static Scanner intScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    static ArrayList<Felino> nomiFelini = new ArrayList<Felino>();
    static ArrayList<Canide> nomiCanidi = new ArrayList<Canide>();
    static ArrayList<Anfibio> nomiAnfibi = new ArrayList<Anfibio>();
    static ArrayList<Roditore> nomiRoditori = new ArrayList<Roditore>();

    public static void main(String[] args) {
        System.out.println("Benvenuto dal veterinario");

        boolean exit = false;
        while (!exit) {
            System.out.println("Vuoi entrare o uscire:\n[1] Entra\n[2] Esci");
            int mainChoice = intScanner.nextInt();
            int totalAnimals = nomiFelini.size() + nomiAnfibi.size() + nomiCanidi.size() + nomiRoditori.size();
            switch (mainChoice) {
                case 1:
                    mainMenu();
                    break;
                case 2:
                    System.out.println("Hai registrato in totale " + totalAnimals + " animali");

                    System.out.println("Hai registrato " + nomiFelini.size() + " animali di tipo felino:");
                    loopFelini(nomiFelini);

                    System.out.println("Hai registrato " + nomiCanidi.size() + " animali di tipo canide:");
                    loopCanidi(nomiCanidi);

                    System.out.println("Hai registrato " + nomiAnfibi.size() + " animali di tipo anfibio:");
                    loopAnfibi(nomiAnfibi);

                    System.out.println("Hai registrato " + nomiRoditori.size() + " animali di tipo roditore:");
                    loopRoditori(nomiRoditori);
                    exit = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile riprovare");
            }
        }
    }

    public static void mainMenu() {
        String animalName;
        int animalWeight;

        boolean exitFromMenu = false;
        while (!exitFromMenu) {
            System.out.println(
                    "Che tipo di animale hai portato?:\n[1]Felino\n[2]Canide\n[3]Anfibio\n[4]Roditore\n[5]Annulla");
            int typeInput = intScanner.nextInt();

            switch (typeInput) {
                case 1:
                    animalName = getName();
                    animalWeight = getWeight();
                    Felino felino = new Felino(animalName, animalWeight, nomiFelini);
                    felino.versoAnimale();
                    Felino.addName(felino);
                    break;
                case 2:
                    animalName = getName();
                    animalWeight = getWeight();
                    Canide canide = new Canide(animalName, animalWeight, nomiCanidi);
                    canide.versoAnimale();
                    Canide.addName(canide);
                    break;
                case 3:
                    animalName = getName();
                    animalWeight = getWeight();
                    Anfibio anfibio = new Anfibio(animalName, animalWeight, nomiAnfibi);
                    Anfibio.addName(anfibio);
                    break;
                case 4:
                    animalName = getName();
                    animalWeight = getWeight();
                    Roditore roditore = new Roditore(animalName, animalWeight, nomiRoditori);
                    Roditore.addName(roditore);
                    break;
                case 5:
                    exitFromMenu = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile riprovare");
            }
        }
    }

    public static String getName() {
        System.out.println("Inserisci il nome dell'animale");
        String name = stringScanner.nextLine();

        return name;
    }

    public static int getWeight() {
        System.out.println("Inserisci il peso dell'animale");
        int weight = intScanner.nextInt();

        return weight;
    }

    // metodi per printare gli elenchi degli animali registrati
    public static void loopFelini(ArrayList<Felino> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName());
        }
    }

    public static void loopCanidi(ArrayList<Canide> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName());
        }
    }

    public static void loopAnfibi(ArrayList<Anfibio> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName());
        }
    }

    public static void loopRoditori(ArrayList<Roditore> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName());
        }
    }
}

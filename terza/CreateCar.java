package terza;

import java.util.Scanner;
import java.util.Random;

public class CreateCar {
    public static void main(String[] args) {
        boolean createCar = true;
        while (createCar) {
            Scanner scannerForMenu = new Scanner(System.in);
            System.out.println("Vuoi creare una macchina o uscire?\n[1] Crea macchina\n[2] Esci");
            int userChoice = scannerForMenu.nextInt();

            switch (userChoice) {
                case 1:
                    // MOTORE
                    Motore motore1 = new Motore();
                    // chiedo la cilindrata e la assegno
                    int capacity = motore1.setCapacity();
                    motore1.cilindrata = capacity;
                    // chiedo i pistoni e li assegno
                    int pistons = motore1.setPistons();
                    motore1.pistoni = pistons;

                    // ----------------------------------------------------------------
                    // FRENI
                    Freni freni1 = new Freni();
                    // chiedo la potenza frenante
                    int userPotenzaFrenante = freni1.setPotenzaFrenante();
                    freni1.potenzaFrenante = userPotenzaFrenante;
                    // chiedo il numero pastiglie
                    int userPastiglie = freni1.setPastiglie();
                    freni1.pastiglie = userPastiglie;
                    // -----------------------------------------------------------------
                    // randomizzo la targa
                    String plate = createPlate();
                    System.out.println("Targa --> " + plate);

                    // creo la macchina con i dati inseriti + la targa
                    System.out.println(".... creo la macchina ....");
                    Macchina userCar = new Macchina(plate, motore1.cilindrata, motore1.pistoni, freni1.potenzaFrenante,
                            freni1.pastiglie);
                    // stampo i dati della macchina creata
                    System.out.println("Macchina creata con successo!");
                    System.out.println("----------------------------------------------------");
                    System.out.println("Cilindrata: " + userCar.cilindrata + "\nPistoni: " + userCar.pistoni
                            + "\nPotenza Frenante: " + userCar.potenzaFrenante + "\nPastiglie: " + userCar.pastiglie);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Alla prossima");
                    createCar = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }
        }
    }

    // metodo per randomizzare la targa
    static String createPlate() {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 5;

        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }

}

class Motore {
    int cilindrata;
    int pistoni;

    // faccio scegliere la cilindrata all'utente
    int setCapacity() {
        boolean askCapacity = true;
        int userCapacity = 0;
        while (askCapacity) {
            Scanner scannerCapacity = new Scanner(System.in);
            System.out.println("Scegli una cilindrata:\n[1] 1200\n[2] 1600\n[3] 2000");
            int userChoiceCapacity = scannerCapacity.nextInt();

            if (userChoiceCapacity == 1) {
                userCapacity = 1200;
                askCapacity = false;
            } else if (userChoiceCapacity == 2) {
                userCapacity = 1600;
                askCapacity = false;
            } else if (userChoiceCapacity == 3) {
                userCapacity = 2000;
                askCapacity = false;
            } else {
                System.out.println("Opzione non disponibile");
            }

        }
        return userCapacity;
    }

    int setPistons() {
        Scanner scannerPistons = new Scanner(System.in);
        System.out.println("Inserisci numero di pistoni");
        int userPistons = scannerPistons.nextInt();
        return userPistons;
    }
}

class Freni {
    int potenzaFrenante;
    int pastiglie;

    int setPotenzaFrenante() {
        boolean ask = true;
        int potenza = 0;
        while (ask) {
            Scanner scannerPotenza = new Scanner(System.in);
            System.out.println("Scegli una potenza frenante:\n[1] 10\n[2] 20\n[3] 30");
            int userPotenza = scannerPotenza.nextInt();

            if (userPotenza == 1) {
                potenza = 10;
                ask = false;
            } else if (userPotenza == 2) {
                potenza = 20;
                ask = false;
            } else if (userPotenza == 3) {
                potenza = 30;
                ask = false;
            } else {
                System.out.println("Opzione non disponibile");
            }
        }
        return potenza;

    }

    int setPastiglie() {
        Scanner scannerPastiglie = new Scanner(System.in);
        System.out.println("Inserisci numero di pastiglie");
        int numeroPastiglie = scannerPastiglie.nextInt();
        return numeroPastiglie;
    }
}

class Macchina {
    String targa;
    int cilindrata;
    int pistoni;
    int potenzaFrenante;
    int pastiglie;

    Macchina(String targa, int cilindrata, int pistoni, int potenzaFrenante, int pastiglie) {
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.pistoni = pistoni;
        this.potenzaFrenante = potenzaFrenante;
        this.pastiglie = pastiglie;
    }
}

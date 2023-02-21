import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrRecapEx {
    public static void main(String[] args) {
        Integer[] numbers = { 10, 20, 30, 40 };
        String[] words = { "Dog", "Cat", "Pig" };
        boolean enter = true;
        do {
            Scanner mainMenuScanner = new Scanner(System.in);
            System.out.println("Vuoi entrare o uscire: \n(1) Entra\n(2) Esci");
            int userChoiceMenu = mainMenuScanner.nextInt();
            boolean action = true;

            if (userChoiceMenu == 1) { // MENU PRINCIPALE
                while (action) {
                    Scanner inputScanner = new Scanner(System.in);
                    System.out.println("Vuoi visualizzare numeri o stringhe?\n(1) Numeri\n(2) Stringhe\n(3) Uscire");
                    int userChoice = inputScanner.nextInt();

                    switch (userChoice) { // l'utente decide se visualizzare numeri o stringhe
                        case 1:
                            System.out.println("Ecco i numeri: ");
                            for (int i = 0; i < numbers.length; i++) {
                                System.out.println(numbers[i]);
                            }
                            break;
                        case 2:
                            System.out.println("Ecco le stringhe: ");
                            for (int i = 0; i < words.length; i++) {
                                System.out.println(words[i]);
                            }
                            break;
                        case 3:
                            action = false; // ritorno al menu principale
                            continue;
                        default:
                            System.out.println("Opzione non disponibile");

                    }

                    Scanner input1Scanner = new Scanner(System.in);
                    System.out
                            .println("Vuoi modificare i numeri o le stringhe?: \n(1) Numeri\n(2) Stringhe\n(3) Uscire");
                    int userChange = input1Scanner.nextInt();

                    switch (userChange) { // l'utente decide se modificare numeri o stringhe
                        case 1:
                            System.out.println("Hai scelto modifica numeri");
                            Scanner inputNumber = new Scanner(System.in);

                            System.out.println("Inserisci il numero da aggiungere");
                            int numToAdd = inputNumber.nextInt();

                            ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(numbers));
                            numbersList.add(numToAdd); // aggiungo il numero e torno al menu principale
                            numbers = numbersList.toArray(numbers);
                            break;
                        case 2:
                            System.out.println("Hai scelto modifica stringhe");
                            // scanner per richiedere il numero da aggiungere
                            Scanner inputString = new Scanner(System.in);

                            System.out.println("Inserisci la stringa aggiungere");
                            String stringToAdd = inputString.nextLine();

                            ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(words));
                            stringList.add(stringToAdd); // aggiungo la stringa e torno al menu principale
                            words = stringList.toArray(words);
                            break;
                        case 3:
                            action = false;
                            break;
                        default:
                            System.out.println("Opzione di modifica non disponibile");
                    }
                }
            } else if (userChoiceMenu == 2) {
                System.out.println("Ciao!");
                enter = false; // esco dal programma
            } else {
                System.out.println("Opzione non disponibile");
            }
        } while (enter);

    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class MenuFibonacci {
    static ArrayList<Integer> numsGenerated = new ArrayList<Integer>();

    public static void MainMenu() {
        boolean keep = true;
        while (keep) {
            Scanner choiceScanner = new Scanner(System.in);
            System.out.println("Vuoi\n[1] Stampare la serie\n[2] Verificare un numero\n[3] Uscire");
            int userChoice = choiceScanner.nextInt();

            switch (userChoice) {
                case 1:
                    PrintSeries();
                    break;
                case 2:
                    SearchNum();
                    break;
                case 3:
                    System.out.println("Uscita...");
                    keep = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }

        }
    }

    static void PrintSeries() {
        int num1 = 0;
        int num2 = 1;
        int num3;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Quante volte vuoi stampare la serie?");
        int userInput = inputScanner.nextInt();
        // stampo 0 e 1 che sono sempre i primi due numeri della serie
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < userInput; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

    static void SearchNum() {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Inserisci il numero che vuoi ricercare");
        int numToCheck = numScanner.nextInt();
        int index = 0;
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (index < 30) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            numsGenerated.add(n3);
            index++;
        }
        // controllo se il numero fa parte della serie
        if (numsGenerated.contains(numToCheck)) {
            System.out.println("Il numero " + numToCheck + " fa parte della serie");
        } else {
            System.out.println("Il numero " + numToCheck + " non fa parte della serie");
        }
    }
}

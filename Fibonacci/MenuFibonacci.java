import java.util.Scanner;

public class MenuFibonacci {

    public static void MainMenu() {
        boolean exit = false;
        while (!exit) {
            int userChoice = InputScanner("Vuoi\n[1] Stampare la serie\n[2] Verificare un numero\n[3] Uscire");
            int userOperation;

            switch (userChoice) {
                case 1:
                    userOperation = InputScanner("Quante volte vuoi stampare la serie?");
                    FibonacciOp.PrintSeries(userOperation);
                    break;
                case 2:
                    userOperation = InputScanner("Inserisci il numero che vuoi ricercare");
                    FibonacciOp.SearchNum(userOperation);
                    break;
                case 3:
                    System.out.println("Uscita...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }

        }
    }

    static int InputScanner(String message) {
        System.out.println(message);
        Scanner intScanner = new Scanner(System.in);
        int userInput = intScanner.nextInt();

        return userInput;
    }

}

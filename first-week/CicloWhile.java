import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            Scanner operation = new Scanner(System.in);
            System.out.println("Scegli un numero da 1 a 10(1) oppure annulla(2)");
            int userChoice = operation.nextInt();

            if (userChoice == 2) {
                System.out.println("Ciao!");
                continua = false;

            } else {
                Scanner num = new Scanner(System.in);
                System.out.println("Inserisci un numero da 1 a 10");
                int userNumber = num.nextInt();
                System.out.println("Hai scelto il numero " + userNumber);

                // controllo pari o dispari
                if (userNumber % 2 == 0) {
                    int division = (userNumber / 2);
                    System.out.println("Il numero è pari");
                    System.out.println("Il risultato della divisione per 2 è " + division);

                } else {
                    System.out.println("Il numero è dispari");
                    Scanner num2 = new Scanner(System.in);
                    // richiesta del dividendo
                    System.out.println("Inserisci il modulo");
                    int dividendo = num2.nextInt();

                    double module = (userNumber % dividendo);
                    System.out.println("Il resto della divisione è " + module);
                }

                // richiesta all'utente per chiedere se vuole inserire un altro numero
                Scanner keep = new Scanner(System.in);
                System.out.println("Vuoi continuare o uscire? (Y o N)");
                String userChoice1 = keep.nextLine();
                // controllo
                if (userChoice1.equals("N")) {
                    System.out.println("Ciao!");
                    continua = false; // fine del ciclo
                }

            }

        }
    }

}

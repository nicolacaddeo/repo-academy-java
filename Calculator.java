import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(
                "Benvenuto nella calcolatrice, le operazioni disponibili sono: Somma(1), Sottrazione(2), Moltiplicazione(3), Modulo(4)");

        // creo lo scanner per richiedere l'operazione desiderata
        Scanner operation = new Scanner(System.in);
        int userOperation = operation.nextInt();

        // controllo sul tipo di operazione
        if (userOperation > 4 || userOperation < 1) {
            System.out.println("L\'opzione non è disponibile");

        } else {
            // Creo gli scanner per richiedere i numeri
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            Scanner num2 = new Scanner(System.in);
            int number2 = num2.nextInt();

            if (userOperation == 1) {
                System.out.println("Il risultato della somma è " + (number1 + number2));

            } else if (userOperation == 2) {
                System.out.println("Il risultato della sottrazione è " + (number1 - number2));

            } else if (userOperation == 3) {
                System.out.println("Il risultato della moltiplicazione è " + (number1 * number2));

            } else if (userOperation == 4) {
                System.out.println("Il resto della divisione è " + (number1 % number2));
            }

            operation.close();
            num1.close();
            num2.close();
        }
    }
}

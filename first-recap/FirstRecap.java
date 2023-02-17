import java.util.Scanner;

public class FirstRecap {
    public static void main(String[] args) {
        System.out.println(
                "Benvenuto, le operazioni disponibili sono:\n (1)Somma\n (2)Sottrazione\n (3)Somma di radici\n (4)Sottrazione di radici");

        // creo lo scanner per richiedere l'operazione desiderata
        Scanner operation = new Scanner(System.in);
        int userOperation = operation.nextInt();

        // controllo sul tipo di operazione
        if (userOperation > 4 || userOperation < 1) {
            System.out.println("L\'opzione non è disponibile");

        } else {
            // Creo gli scanner per richiedere i numeri
            Scanner num1 = new Scanner(System.in);
            System.out.println("Inserisci il primo numero");
            double number1 = num1.nextDouble();

            Scanner num2 = new Scanner(System.in);
            System.out.println("Inserisci il secondo numero");
            double number2 = num2.nextDouble();

            // eseguo le operazioni
            if (userOperation == 1) {
                double sum = (number1 + number2);
                System.out.println("Il risultato della somma è " + (sum));
                Controllo(sum);

            } else if (userOperation == 2) {
                double subtraction = number1 - number2;
                System.out.println("Il risultato della sottrazione è " + (subtraction));
                Controllo(subtraction);

            } else if (userOperation == 3) {
                // radice quadrata dei due numeri scelti dall'utente
                double sqrt1 = Math.sqrt(number1);
                double sqrt2 = Math.sqrt(number2);
                // somma radici
                double sqrtSum = sqrt1 + sqrt2;
                System.out.println("La somma delle radici quadrate è " + (sqrtSum));
                Controllo(sqrtSum);

            } else if (userOperation == 4) {
                double minNumber = Math.min(number1, number2);
                double maxNumber = Math.max(number1, number2);
                double sqrtSubtraction = Math.sqrt(minNumber) - maxNumber;
                System.out.println("Il risultato della sottrazione delle radici è " + sqrtSubtraction);
                Controllo(sqrtSubtraction);
            }

            operation.close();
            num1.close();
            num2.close();
        }

    }

    static void Controllo(double num) {
        // controllo sul segno
        if (num > 0) {
            System.out.println("Il numero è positivo");
        } else {
            double abs = Math.abs(num);
            System.out.println("Il numero è negativo");
            System.out.println("Il valore assoluto è: " + abs);
        }
        // controllo sull'intero
        if (num == Math.floor(num)) {
            System.out.println("Il numero è intero");
            isEven(num);
        } else {
            System.out.println("Il numero non è intero");
            // stampa del valore troncato
            System.out.println("Valore intero: " + (int) num);
            System.out.println("Valore troncato: " + (num - (int) num));
        }
    }

    static void isEven(double num) {
        if (num % 2 == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
    }
}

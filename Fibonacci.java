import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3;

        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Inserisci un numero di volte");
        int userInput = scannerInput.nextInt();
        System.out.println(" " + num2);

        for (int i = 1; i < userInput; i++) { // il ciclo stampa solo i numeri dispari
            num3 = num1 + num2;
            int even = num3 % 2;
            if (even != 0) {
                System.out.println(" " + num3);

            }
            num1 = num2;
            num2 = num3; //commento
        }

        scannerInput.close();
    }
}
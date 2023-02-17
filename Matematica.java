import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        // chiedo il numero per fare la radice quadrata
        Scanner input1 = new Scanner(System.in);
        System.out.println("Inserisci il numero del quale fare la radice quadrata");
        double userInput1 = input1.nextInt();

        double radice = Math.sqrt(userInput1);

        // stampo a schermo la radice
        System.out.println("La radice quadrata di " + userInput1 + " è " + radice);

        // prendo 2 numerin random e indico quale è il massimo
        int randomNum1 = (int) (Math.random() * 100);
        int randomNum2 = (int) (Math.random() * 100);

        // determino il numero maggiore
        int bigNumber = Math.max(randomNum1, randomNum2);
        System.out
                .println("I numeri generati sono " + randomNum1 + " e " + randomNum2 + " e il maggiore è " + bigNumber);

        // chiedo 2 numeri sui quali fare alcune operazioni
        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int firstNumber = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Inserisci il secondo numero");
        int secondNumber = input3.nextInt();

        // eseguo le operazioni
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        // stampo i risultati delle operazioni
        System.out.println("La somma da " + sum);
        System.out.println("La sottrazione da " + subtraction);
        System.out.println("La moltiplicazione da " + multiplication);

        input1.close();
        input2.close();
        input3.close();
    }

}

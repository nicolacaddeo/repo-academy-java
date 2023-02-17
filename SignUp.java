import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {

        String userName = "nicola";
        int age = 18;
        String password = "1234";

        Scanner myName = new Scanner(System.in);
        String userNameInput = myName.nextLine();

        // controllo l'username
        if (userNameInput.equals(userName)) {
            System.out.println("Inserisci l\'eta");
            Scanner myAge = new Scanner(System.in);
            int userAge = myAge.nextInt();

            // controllo l'eta
            if (userAge > 18) {
                System.out.println("Inserisci la password");
                Scanner myPassword = new Scanner(System.in);
                String userInputPassword = myPassword.nextLine();

                // controllo la password
                if (userInputPassword.equals(password)) {
                    System.out.println("Login eseguito");
                } else {
                    System.out.println("Password errata");
                }

            } else {
                System.out.println("Non sei maggiorenne");
            }

        } else {
            System.out.println("Username errato");
        }

    }
}

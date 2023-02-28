
import java.util.Scanner;
import java.util.ArrayList;

public class MethodsFirstEx1 {
    static ArrayList<String> userNames = new ArrayList<String>();
    static ArrayList<String> passwords = new ArrayList<String>();
    // array nel quale gli utenti autenticati aggiungono elementi
    static ArrayList<String> comments = new ArrayList<String>();

    public static void main(String[] args) {
        boolean action = true;

        while (action) {
            Scanner mainMenuScanner = new Scanner(System.in);
            // MENU PRINCIPALE
            System.out.println("Vuoi registrarti o loggarti?\n[1] SignUp\n[2] Log In");
            int userAction = mainMenuScanner.nextInt();

            switch (userAction) {
                case 1:
                    SignUp();
                    break;

                case 2:
                    LogIn();
                    break;
                default:
                    System.out.println("Alla prossima!");
                    action = false;
            }
        }
    }

    static void SignUp() {
        boolean registering = true;

        // ciclo while per la registrazione di piu' utenti
        while (registering) {
            // l'utente decide l'username
            String userName = "";
            while (userName.length() == 0) {
                Scanner scannerUsername = new Scanner(System.in);
                System.out.println("Inserisci l'username");
                userName = scannerUsername.nextLine();
                if (userName.length() == 0) {
                    System.out.println("Devi inserire l'username");
                }
            }

            // l'utente decide la password
            String password = "";
            while (password.length() == 0) {
                Scanner scannerPassword = new Scanner(System.in);
                System.out.println("Inserisci la password");
                password = scannerPassword.nextLine();
                if (password.length() == 0) {
                    System.out.println("Devi inserire la password");
                }
            }
            userNames.add(userName);
            passwords.add(password);

            // stampo i dati inseriti
            System.out.println("Username inserito --> " + userName);
            System.out.println("Password inserita --> " + password);

            Scanner scannerAnotherUser = new Scanner(System.in);
            System.out.println("Vuoi registrare un altro profilo?\n[1] SI\n[2] NO");
            int anotherAccount = scannerAnotherUser.nextInt();
            if (anotherAccount == 2) {
                registering = false; // esco dal ciclo e ritorno al menu principale
            } else if (anotherAccount == 1) {
                System.out.println("---Registrazione nuovo account---");
                continue;
            }
        }

    }

    static void LogIn() {
        String enteredName = "";
        boolean askUsername = true;
        do {
            Scanner scannerLogIn = new Scanner(System.in);
            System.out.println("Area di autenticazione");
            System.out.println("Username:");
            enteredName = scannerLogIn.nextLine();
            boolean isUserRegistered = userNames.contains(enteredName);
            if (isUserRegistered) { // controllo se l'utente esiste
                askUsername = false;
            }
        } while (askUsername);

        String enteredPassword = "";
        int indexOfUser = 0;

        Scanner scannerLogInPass = new Scanner(System.in);
        System.out.println("Password: ");
        enteredPassword = scannerLogInPass.nextLine();
        // dato il nome recupero l'indice di
        indexOfUser = userNames.indexOf(enteredName);

        if (enteredPassword.equals(passwords.get(indexOfUser))) {
            System.out.println("Accesso effettuato");
            addComment(); // se l'utente e' loggato aggiunge un commento
        }
    }

    static void addComment() {
        Scanner scannerElement = new Scanner(System.in);
        System.out.println("Cosa vuoi inserire nell'array?");
        String elementToAdd = scannerElement.nextLine();
        comments.add(elementToAdd);
        System.out.println("Hai commentato con --> " + elementToAdd);
    }
}
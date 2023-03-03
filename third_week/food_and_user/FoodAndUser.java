package food_and_user;

import java.util.Scanner;
import java.util.ArrayList;

public class FoodAndUser {
    static ArrayList<String> userNames = new ArrayList<String>();
    static ArrayList<String> passwords = new ArrayList<String>();
    static boolean isLogged = false;

    public static void main(String[] args) {
        System.out.println("Benvenuto al Java Ristorante");
        // primo loop che gestisce SignUp/LogIn
        boolean exitLogin = false;

        while (!exitLogin) {
            System.out.println("Scegli un'opzione:\n[1] Registrati\n[2] Accedi\n[3] Esci");
            Scanner loginScanner = new Scanner(System.in);
            int loginChoice = loginScanner.nextInt();
            switch (loginChoice) {
                case 1:
                    // AREA DI REGISTRAZIONE
                    SignUp();
                    break;
                case 2:
                    // AREA DI ACCESSO
                    LogIn();
                    // * se l'utente é loggato puó continuare al menú del ristorante
                    boolean keepOrdering = true;
                    while (keepOrdering) {
                        if (isLogged) {
                            // popolo il menú + istanza di ristorante
                            ArrayList<Pietanza> listaPietanze = new ArrayList<Pietanza>();

                            String[] ingredienti1 = { "patate", "salsiccia" };
                            listaPietanze.add(new Pietanza("Pizza patate e salsiccia", 8.0, ingredienti1));
                            String[] ingredienti2 = { "pomodoro", "mozzarella" };
                            listaPietanze.add(new Pietanza("Pizza rossa", 8.0, ingredienti2));

                            Ristorante ristorante = new Ristorante(listaPietanze);

                            System.out.println("Scegli un'opzione:\n[1] Continua al ristorante\n[2] Esci");
                            Scanner scannerApp = new Scanner(System.in);
                            int userChoice = scannerApp.nextInt();
                            switch (userChoice) {
                                case 1:
                                    System.out.println("Scegli un'opzione:\n[1]Ordina\n[2]Visualizza\n[3]Esci");
                                    Scanner scannerForMenu = new Scanner(System.in);
                                    int userMenuChoice = scannerForMenu.nextInt();
                                    switch (userMenuChoice) {
                                        case 1: // * ORDINA
                                            System.out.println(ristorante.toString());
                                            System.out.println("\nOrdina un piatto inserendo un numero: ");
                                            Scanner intScanner = new Scanner(System.in);
                                            int input = intScanner.nextInt();
                                            ristorante.ordina(input);
                                            break;
                                        case 2: // * VISUALIZZA
                                            System.out.println(ristorante.toString());
                                            System.out.println("\nVisualizza un piatto inserendo un numero: ");
                                            Scanner scannerForDish = new Scanner(System.in);
                                            input = scannerForDish.nextInt();
                                            ristorante.visualizza(input);
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Opzione non disponibile");
                                    }
                                    break;
                                case 2:
                                    // *! ritorno al menú gestione utente
                                    keepOrdering = false;

                                    break;
                                default:
                                    System.out.println("Opzione non disponibile");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Alla prossima!");
                    exitLogin = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }
        }
    }

    static void SignUp() {
        // chiedo l'username all'utente
        System.out.print("Inserisci il nome utente: ");
        Scanner nameScanner = new Scanner(System.in);
        String userName = nameScanner.nextLine();
        // creazione della password
        System.out.print("Crea una password: ");
        Scanner pwScanner = new Scanner(System.in);
        String password = pwScanner.nextLine();
        // DATI SULL'ARRAYLIST
        userNames.add(userName);
        passwords.add(password);
        // istanza di User
        User customer = new User(userName, password);
    }

    static void LogIn() {
        // chiedo usarname fino a quando non trova un utente esistente
        String enteredName = "";
        boolean askUsername = true;
        do {
            Scanner scannerLogIn = new Scanner(System.in);
            System.out.print("Inserisci il nome utente: ");
            enteredName = scannerLogIn.nextLine();
            boolean isUserRegistered = userNames.contains(enteredName);
            if (isUserRegistered) { // controllo se l'utente esiste
                askUsername = false;
            } else {
                System.out.print("Utente non trovato, riprovare");
            }
        } while (askUsername);

        // se l'utente esiste gli chiedo la password
        String enteredPassword = "";
        int indexOfUser = 0;
        boolean isCorrectPassword = false;
        do {
            Scanner scannerLogInPass = new Scanner(System.in);
            System.out.println("Inserisci la password: ");
            enteredPassword = scannerLogInPass.nextLine();
            // dato il nome recupero l'indice dell'utente
            indexOfUser = userNames.indexOf(enteredName);
            // controllo se la password dell'utente con indice X e' corretta
            if (enteredPassword.equals(passwords.get(indexOfUser))) {
                System.out.println("LogIn effettuato con successo");
                // *! varibile per entrare all'interno del menu delle ordinazioni
                isLogged = true;
                // * ASSEGNO UN BUDGET RANDOM ALL'UTENTE
                int customerBudget = User.getRandomBudget();
                System.out.println("Il tuo budget é " + customerBudget + " euro");
                isCorrectPassword = true; // *! esco dal ciclo
            } else {
                System.out.println("Password errata");
            }
        } while (!isCorrectPassword);
    }
}

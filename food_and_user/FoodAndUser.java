package food_and_user;

import java.util.Scanner;
import java.util.ArrayList;

public class FoodAndUser {
    static ArrayList<String> userNames = new ArrayList<String>();
    static ArrayList<String> passwords = new ArrayList<String>();

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
                    /*
                     * AREA DI REGISTRAZIONE
                     */

                    // chiedo l'username all'utente
                    System.out.println("Inserisci il nome utente");
                    Scanner nameScanner = new Scanner(System.in);
                    String userName = nameScanner.nextLine();
                    // creazione della password
                    System.out.println("Crea una password");
                    Scanner pwScanner = new Scanner(System.in);
                    String password = pwScanner.nextLine();
                    // DATI SULL'ARRAYLIST
                    userNames.add(userName);
                    passwords.add(password);
                    // istanza di User
                    User customer = new User(userName, password);
                    // FINE REGISTRAZIONE ---------------------------------------

                    break;
                case 2:
                    /*
                     * AREA DI LOGIN
                     */

                    // chiedo usarname fino a quando non trova un utente esistente
                    String enteredName = "";
                    boolean askUsername = true;
                    do {
                        Scanner scannerLogIn = new Scanner(System.in);
                        System.out.println("Inserisci il nome utente:");
                        enteredName = scannerLogIn.nextLine();
                        boolean isUserRegistered = userNames.contains(enteredName);
                        if (isUserRegistered) { // controllo se l'utente esiste
                            askUsername = false;
                        } else {
                            System.out.println("Utente non trovato, riprovare");
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

                            // ASSEGNO UN BUDGET RANDOM ALL'UTENTE
                            int customerBudget = User.getRandomBudget();
                            System.out.println("Il tuo budget é " + customerBudget + " euro");
                            isCorrectPassword = true; // esco dal ciclo
                        } else {
                            System.out.println("Password errata");
                        }
                    } while (!isCorrectPassword);
                    // FINE LogIn ---------------------------------------

                    break;
                case 3:
                    System.out.println("Alla prossima!");
                    exitLogin = true;
                    break;
            }
        }
    }
}

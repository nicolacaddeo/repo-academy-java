import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSIgnUp {
    public static void main(String[] args) {
        // array per contere i vari dati
        ArrayList<String> userNames = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();

        boolean signUp = true;

        do {
            Scanner enterScanner = new Scanner(System.in);
            System.out.println("Vuoi entrare o uscire?\n[1] Entra\n[2] Modifica\n[3] Esci");
            int userAction = enterScanner.nextInt();

            switch (userAction) {
                case 1: // L'UTENTE DECIDE DI REGISTRARSI
                    int userToRegister = 3;

                    for (int i = 0; i < userToRegister; i++) {
                        // inserimento nome
                        String userName = "";
                        while (userName.length() == 0) {
                            Scanner scannerName = new Scanner(System.in);
                            System.out.println("Inserisci il nome");
                            userName = scannerName.nextLine();
                        }
                        userNames.add(userName);

                        // inserimento password
                        String password = "";
                        while (password.length() == 0) {
                            Scanner scannerPassword = new Scanner(System.in);
                            System.out.println("Inserisci password");
                            password = scannerPassword.nextLine();
                        }
                        passwords.add(password);

                        // inserimento eta
                        Integer age = 0;
                        while (age == 0) {
                            Scanner scannerAge = new Scanner(System.in);
                            System.out.println("Inserisci l\'eta");
                            age = scannerAge.nextInt();
                        }
                        ages.add(age);
                        System.out.println("Utente numero: " + (i + 1) + " registrato");
                    }
                    // stampo i dati di tutti gli utenti
                    System.out.println("Gli utenti registrati sono:");
                    for (int i = 0; i < userToRegister; i++) {
                        System.out.println("Utente numero: " + (i + 1) + ":");
                        System.out.println("Nome: " + userNames.get(i));
                        System.out.println("Eta: " + ages.get(i));
                        System.out.println("-------------------------");
                    }

                    break;

                case 2: // L'UTENTE DECIDE DI MODIFICARE I DATI
                    // chiedo usarname e password per la modifica
                    Scanner scannerLogIn = new Scanner(System.in);
                    System.out.println("Username:");
                    String enteredName = scannerLogIn.nextLine();

                    Scanner scannerLogInPass = new Scanner(System.in);
                    System.out.println("Password: ");
                    String enteredPassword = scannerLogInPass.nextLine();
                    int indexOfUser = userNames.indexOf(enteredName); // dato il nome recupero l'indice di quell'utente

                    // controllo se la password dell'utente con indice X e' corretta
                    if (enteredPassword.equals(passwords.get(indexOfUser))) {
                        System.out.println("Accesso effettuato");
                        // inserimento del nuovo nome
                        String newName = "";
                        while (newName.length() == 0) {
                            Scanner scannerNewName = new Scanner(System.in);
                            System.out.println("Inserisci il nome");
                            newName = scannerNewName.nextLine();
                        }
                        userNames.set(indexOfUser, newName);

                        // inserimento della nuova password
                        String newPassword = "";
                        while (newPassword.length() == 0) {
                            Scanner scannerNewPassword = new Scanner(System.in);
                            System.out.println("Inserisci password");
                            newPassword = scannerNewPassword.nextLine();
                        }
                        passwords.set(indexOfUser, newPassword);

                        // inserimento nuova eta
                        Integer newAge = 0;
                        while (newAge == 0) {
                            Scanner scannerNewAge = new Scanner(System.in);
                            System.out.println("Inserisci l\'eta");
                            newAge = scannerNewAge.nextInt();
                        }
                        ages.set(indexOfUser, newAge);

                        // stampo i dati post modifica dell'utente
                        System.out.println("Ecco i nuovi dati:");
                        System.out.println("Nome: " + userNames.get(indexOfUser));
                        System.out.println("Eta: " + ages.get(indexOfUser));

                    } else {
                        System.out.println("Password errata");
                    }
                    break;

                case 3: // L'UTENTE DECIDE DI USCIRE DAL PROGRAMMA
                    System.out.println("Ciao!");
                    signUp = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile");

            }
        } while (signUp);
    }
}

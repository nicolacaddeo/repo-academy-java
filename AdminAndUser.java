import java.util.Scanner;
import java.util.ArrayList;

public class AdminAndUser {
    static ArrayList<String> users = new ArrayList<String>();
    static ArrayList<String> admins = new ArrayList<String>();
    static ArrayList<String> boss = new ArrayList<String>();
    static String adminPassword = "root"; // se conosciuta --> ADMIN
    static String secretPin = "12345"; // se conosciuta --> CAPO

    public static void main(String[] args) {
        boolean signUp = true;
        while (signUp) {
            Scanner scannerMenu = new Scanner(System.in);
            System.out.println("Vuoi registrarti o uscire?\n [1] Registrati\n [2] Esci");
            int userChoiche = scannerMenu.nextInt();
            switch (userChoiche) {
                case 1:
                    String userName = "";

                    // il ciclo chiede un username fino a quando l'utente non lo inserisce
                    while (userName.length() == 0) {
                        Scanner scannerForUsername = new Scanner(System.in);
                        System.out.println("Inserisci l'username:");
                        userName = scannerForUsername.nextLine();
                        if (userName.length() > 0) {
                            System.out.println("Hai inserito l'username --> " + userName);
                        } else {
                            System.out.println("Si prega di inserire un username");
                        }
                    }

                    // creo lo scanner per richiedere la pw e verificare se l'utente è ADMIN
                    Scanner scannerForPassword = new Scanner(System.in);
                    System.out.println("Se vuoi registrarti come admin, inserisci la password");
                    String inputPassword = scannerForPassword.nextLine();

                    // scanner per richiedere il pin segreto e determinare se l'utente è il CAPO
                    Scanner scannerSecretPin = new Scanner(System.in);
                    System.out.println("Se vuoi registrarti come capo, inserisci il pin segreto");
                    String userSecretPin = scannerSecretPin.nextLine();

                    if (inputPassword.length() > 0 && userSecretPin.length() == 0) {
                        CheckSignUp.addUser(userName, inputPassword);

                    } else if (inputPassword.length() > 0 && userSecretPin.length() > 0) {
                        CheckSignUp.addUser(userName, inputPassword, userSecretPin);

                    } else {
                        CheckSignUp.addUser(userName);
                    }

                    break;

                case 2:
                    // prima di uscire dal ciclo stampo gli utenti della sessione
                    System.out.println("Utenti senza permessi della sezione:");
                    // stampo i vari USER della sessione scorrendo l'array "users"

                    // TODO aggiungere controllo se nessun utente/admin si registra

                    for (int i = 0; i < users.size(); i++) {
                        System.out.println("Utente " + (i + 1) + " " + users.get(i));
                    }
                    System.out.println("---------------------------------");
                    // stampo i vari ADMIN della sessione scorrendo l'array "admins"
                    for (int i = 0; i < admins.size(); i++) {
                        System.out.println("Admin " + (i + 1) + " " + admins.get(i));
                    }
                    System.out.println("---------------------------------");
                    // stampo il CAPO
                    // String bossName = boss.get(0);
                    System.out.println("Il capo è " + boss.get(0));
                    System.out.println("Alla prossima!");
                    signUp = false; // esco dal ciclo
                    break;
                default:
                    System.out.println("Opzione non disponibile riprovare");
            }
        }
    }

    class CheckSignUp {
        static void addUser(String name) {
            users.add(name);
            System.out.println("Ti sei registrato come utente normale");
        }

        static void addUser(String name, String pw) {
            if (pw.equals(adminPassword)) {
                admins.add(name);
                System.out.println("Ti sei registrato come admin");
            } else {
                System.out.println("Non hai i permessi di un admin");
            }

        }

        static void addUser(String name, String pw, String pin) {
            if (pw.equals(adminPassword) && (pin.equals(secretPin))) {
                boss.add(name); // aggiungo il capo
                System.out.println("Ti sei registrato come capo");
            } else {
                System.out.println("Non sei il capo");
            }

        }
    }
}

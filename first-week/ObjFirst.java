import java.util.Scanner;
import java.util.ArrayList;

public class ObjFirst {
    static ArrayList<String> users = new ArrayList<String>();

    public static void main(String[] args) {
        boolean menu = true;

        while (menu) {
            Scanner scannerRequest = new Scanner(System.in);
            System.out.println("Vuoi registrarti o uscire?:\n [1] Entra\n [2] Esci");
            int userChoice = scannerRequest.nextInt();
            User user = new User();

            switch (userChoice) {
                case 1:
                    Scanner userNameScanner = new Scanner(System.in);
                    System.out.println("Inserisci il nome utente");
                    String inputName = userNameScanner.nextLine();

                    Scanner passwordScanner = new Scanner(System.in);
                    System.out.println("Inserisci la password");
                    String inputPassword = passwordScanner.nextLine();
                    users.add(inputName);

                    user.userName = inputName;
                    user.password = inputPassword;
                    break;
                case 2:
                    System.out.println(users);
                    System.out.println(user.userName);
                    // esco dal ciclo
                    menu = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile, riprovare");
            }
        }
    }

}

class User {
    String userName = "";
    String password = "";
}
package third_week;

import java.util.Scanner;

public class Object2 {
    public static void main(String[] args) {

        System.out.println("Che tipo di utente vuoi creare?\n[1] Chef\n[2] Capo Chef\n[3] Magazziniere");
        Scanner inputScanner = new Scanner(System.in);
        int userChoice = inputScanner.nextInt();

        // richiesta dell'username
        System.out.println("Inserisci il tuo nome");
        Scanner nameScanner = new Scanner(System.in);
        String userName = nameScanner.nextLine();

        switch (userChoice) {
            case 1:
                User user = new User("Chef");
                user.createUser(userName);
                System.out.println("Ruolo registrato: " + user.job);
                break;
            case 2:
                int years = getYears();

                User user1 = new User("Capo Chef");
                user1.createUser(userName, years);
                System.out.println("Ruolo registrato: " + user1.job);
                break;
            case 3:
                int years2 = getYears();
                Scanner scannerBox = new Scanner(System.in);
                System.out.println("Inserisci le casse spostate");
                int boxes = scannerBox.nextInt();

                User user2 = new User("Magazziniere");
                user2.createUser(userName, years2, boxes);
                System.out.println("Ruolo registrato: " + user2.job);
                break;
        }

    }

    static int getYears() {
        Scanner scannerYears = new Scanner(System.in);
        System.out.println("Inserisci gli anni di carriera");
        int yearsOfJob = scannerYears.nextInt();

        return yearsOfJob;
    }
}

class User {
    String job;

    User(String job) {
        this.job = job;
    }

    void createUser(String name) {
        System.out.println("Benvenuto " + name);
    }

    void createUser(String name, int years) {
        System.out.println("Benvenuto " + name);
        System.out.println("Anni di carriera: " + years);
    }

    void createUser(String name, int years, int box) {
        System.out.println("Benvenuto " + name);
        System.out.println("Anni di carriera: " + years);
        System.out.println("Casse spostate: " + box);
    }
}

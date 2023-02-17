import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        String userName = null;
        int age = 0;
        String date = null;
        String password = "";
        boolean signUp = true;
        // System.out.println("Benvenuto nella modifica");

        if (password == "") {
            do {
                Scanner Obj = new Scanner(System.in); // nome
                System.out.println("Inserisci nome e cognome");
                userName = Obj.nextLine();

                Scanner Obj2 = new Scanner(System.in); // eta
                System.out.println("Inserisci l'eta");
                age = Obj2.nextInt();

                Scanner Obj3 = new Scanner(System.in); // data di nascita
                System.out.println("Inserisci la data di nascita");
                date = Obj3.nextLine();

                if ((userName != null) && (age != 0) && (date != null)) {
                    // richiesta password
                    Scanner Obj4 = new Scanner(System.in);
                    System.out.println("Inserisci una password per modificare i dati in futuro");
                    password = Obj4.nextLine();
                    System.out.println("Account salvato con successo");
                    signUp = false;

                } else {
                    System.out.println("Si prega di inserire tutti i dati richiesti");
                }

            } while (signUp);

            // richiesta modifica dei dati dell'account
            Scanner modifyScanner = new Scanner(System.in);
            System.out.println("Area di modifica, vuoi modificare?\n (1) Si\n (2) No");
            int userChoice = modifyScanner.nextInt();

            switch (userChoice) {
                case 1:
                    // richiesta password
                    Scanner pwRequest = new Scanner(System.in);
                    System.out.println("Inserisci la password per modificare i dati");
                    String inputPw = pwRequest.nextLine();

                    // controllo password
                    if (inputPw.equals(password)) {
                        // nuovo username
                        Scanner newNameScanner = new Scanner(System.in);
                        System.out.println("Inserisci nuovo nome e cognome");
                        userName = newNameScanner.nextLine();

                        // nuova eta
                        Scanner newAgeScanner = new Scanner(System.in);
                        System.out.println("Inserisci nuova eta");
                        age = newAgeScanner.nextInt();

                        // nuova data di nascita
                        Scanner newDateScanner = new Scanner(System.in);
                        System.out.println("Inserisci nuova data di nascita");
                        date = newDateScanner.nextLine();

                        // stampa dei nuovi dati
                        System.out.println("Il nuovo username è " + userName);
                        System.out.println("La nuova eta è " + age);
                        System.out.println("La nuova data di nascita è " + date);

                    } else {
                        System.out.println("Password errata");
                    }
                    break;

                case 2:
                    System.out.println("Nessuna modifica attuata");
                    break;
            }
        }

    }
}

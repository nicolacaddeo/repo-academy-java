import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;

public class Fibonacci {
    static ArrayList<Integer> numsGenerated = new ArrayList<Integer>();

    public static void main(String[] args) {
        // Connessione database --------------------------------------------
        String DB_URL = "jdbc:mysql://localhost:3306/world";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "root";
        String DB_DRIVER = "com.mysql.jdbc.Driver";

        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (conn != null) {
                System.out.println("Connessione eseguita con successo");

            } else {
                System.out.println("Connessione fallita");
            }
            String query = "SELECT * FROM city LIMIT 5";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String stringa = String.format("ID: %d; Name: %s; CountryCode: %s; District: %s; Population: %d;",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                System.out.println(stringa);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // ------------------------------------------------------------------

        boolean keep = true;
        while (keep) {
            Scanner choiceScanner = new Scanner(System.in);
            System.out.println("Vuoi\n[1] Stampare la serie\n[2] Verificare un numero\n[3] Uscire");
            int userChoice = choiceScanner.nextInt();

            switch (userChoice) {
                case 1:
                    int num1 = 0;
                    int num2 = 1;
                    int num3;

                    Scanner inputScanner = new Scanner(System.in);
                    System.out.println("Quante volte vuoi stampare la serie?");
                    int userInput = inputScanner.nextInt();
                    // stampo 0 e 1 che sono sempre i primi due numeri della serie
                    System.out.println(num1);
                    System.out.println(num2);

                    for (int i = 0; i < userInput; i++) {
                        num3 = num1 + num2;
                        System.out.println(num3);
                        num1 = num2;
                        num2 = num3;
                    }
                    // inputScanner.close();
                    break;
                case 2:
                    Scanner numScanner = new Scanner(System.in);
                    System.out.println("Inserisci il numero che vuoi ricercare");
                    int numToCheck = numScanner.nextInt();
                    int index = 0;
                    int n1 = 0;
                    int n2 = 1;
                    int n3;

                    while (index < 30) {
                        n3 = n1 + n2;
                        n1 = n2;
                        n2 = n3;
                        numsGenerated.add(n3);
                        index++;
                    }
                    // controllo se il numero fa parte della serie
                    if (numsGenerated.contains(numToCheck)) {
                        System.out.println("Il numero " + numToCheck + " fa parte della serie");
                    } else {
                        System.out.println("Il numero " + numToCheck + " non fa parte della serie");
                    }
                    break;
                case 3:
                    System.out.println("Uscita...");
                    keep = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }

        }

    }
}
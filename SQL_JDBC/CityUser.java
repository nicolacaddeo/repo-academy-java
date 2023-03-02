
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;

public class CityUser {
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

            boolean exit = false;
            while (!exit) {
                System.out.println("Che tipo di ricerda vuoi fare:\n[1] Base\n[2] Avanzata\n[3] Esci");
                Scanner searchScanner = new Scanner(System.in);
                int userSearch = searchScanner.nextInt();

                switch (userSearch) {
                    case 1: // *! ricerca base, l'utente ricerca solo per CountryCode
                        System.out.println("Benvenuto nella ricerca base");
                        System.out.println("Inserisci il codice della nazione del quale mostrare le cittá");
                        Scanner codeScanner = new Scanner(System.in);
                        String countryCode = codeScanner.nextLine();

                        String query = "SELECT city.Name FROM city WHERE city.CountryCode = ?";
                        PreparedStatement stmt = conn.prepareStatement(query);
                        stmt.setString(1, countryCode);
                        ResultSet rs = stmt.executeQuery();
                        while (rs.next()) {
                            System.out.println("____________________________");
                            String stringa = String.format("Name: %s; ",
                                    rs.getString(1));

                            System.out.println(stringa);
                        }
                        break;
                    case 2: // *! ricerca avanzata, l'utente ricerca per CountryCode, ordine, popolazione
                        System.out.println("Benvenuto nella ricerca avanzata");
                        System.out.print("Inserisci il codice della nazione del quale mostrare le cittá: ");

                        // * richiedo il country code
                        Scanner codeAdvScanner = new Scanner(System.in);
                        String countryCodeAdv = codeAdvScanner.nextLine(); // *! COUNTRY CODE

                        // * richiedo di specificare l'ordine con il quale mostrare (ASC | DESC)
                        System.out.println("Come vuoi ordinare le cittá? 'ASC' o 'DESC':\n[1]ASC\n[2]DESC");
                        Scanner orderScanner = new Scanner(System.in);
                        int orderType = orderScanner.nextInt(); // *! ORDER

                        // * richiedo un numero minimo di popolazione
                        System.out.print("Inserisci una popolazione per la quale filtrare la ricerca: ");
                        Scanner populationScanner = new Scanner(System.in);
                        int population = populationScanner.nextInt(); // *! POPULATION
                        String advQuery = "";

                        // * chiedo se si vuole visualizzare il nome della nazione
                        System.out.println("Vuoi visualizzare il nome della nazione?:\n[1] Si\n[2] No");
                        Scanner countryScanner = new Scanner(System.in);
                        int viewNation = countryScanner.nextInt();

                        if (orderType == 1) {
                            advQuery = "SELECT city.Name, city.Population FROM city WHERE city.CountryCode = ? AND city.Population >= ? ORDER BY city.Name ASC ";

                        } else if (orderType == 2) {
                            advQuery = "SELECT city.Name, city.Population FROM city WHERE city.CountryCode = ? AND city.Population >= ? ORDER BY city.Name DESC ";
                        }

                        PreparedStatement advStmt = conn.prepareStatement(advQuery);
                        advStmt.setString(1, countryCodeAdv);
                        advStmt.setInt(2, population);

                        ResultSet advRs = advStmt.executeQuery();

                        while (advRs.next()) {
                            System.out.println("____________________________");
                            String stringa = String.format("Name: %s; Population: %s;",
                                    advRs.getString(1),
                                    advRs.getInt(2));
                            System.out.println(stringa);
                        }
                        break;
                    case 3:
                        System.out.println("Alla prossima");
                        exit = true;
                        break;
                    default:
                        System.out.println("Opzione non disponibile");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/*
 * recuperare e mostrare le città con il codice della nazione che indica
 * l'utente.
 * Inoltre l'utente può decidere:
 * l'ordine con cui ordinare le città in maniera decrescente o meno;
 * se filtrare le città per un minimo di popolazione;
 * se mostrare il nome della nazione a cui fa riferimento il code;
 */
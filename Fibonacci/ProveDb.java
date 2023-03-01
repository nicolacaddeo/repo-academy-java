import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class ProveDb {
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
            String query = String.format(
                    "SELECT country.Name, countrylanguage.Language, countrylanguage.Percentage " +
                            "FROM country, countrylanguage " +
                            "WHERE country.Code = countrylanguage.CountryCode ");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String stringa = String.format("Name: %s; Lingua: %s; Percentuale: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                System.out.println(stringa);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // ------------------------------------------------------------------
    }
}

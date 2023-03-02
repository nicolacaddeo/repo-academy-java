import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class ProveDb1 {
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
            String query = "SELECT country.Name, CASE WHEN country.SurfaceArea > ? THEN 'Superficie maggiore di 100000' ELSE 'Superficie minore di 100000' END AS 'ControlloSuperficie', CASE WHEN ifnull(country.IndepYear, false) = 'false' THEN 'Nessun anno di indipendeza' ELSE country.IndepYear END AS 'ControlloIndipendeza' FROM country";
            // Statement stm = conn.createStatement();
            // ResultSet rs = stm.executeQuery(query);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, 100000);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String stringa = String.format("Name: %s; ControlloSuperficie: %s; ControlloInd: %s ",
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

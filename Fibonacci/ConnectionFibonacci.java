import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;

public class ConnectionFibonacci {
    // TODO: Singleton

    String DB_URL = "";
    String DB_USERNAME = "";
    String DB_PASSWORD = "";
    // * statement statico con query
    // * esecuzione query con result
    // * funzione per collegare al MainFibonacci

    public ConnectionFibonacci(String url, String username, String password) {
        // * @param DB_URL, DB_USERNAME, DB_PASSWORD
        DB_URL = url;
        DB_USERNAME = username;
        DB_PASSWORD = password;
    }

    public Connection CreateConnection() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            System.out.println(conn == null ? "Connessione fallita" : "Connessione eseguita con successo");

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

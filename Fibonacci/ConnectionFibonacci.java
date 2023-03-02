import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;

public class ConnectionFibonacci {
    // TODO: Singleton

    private String DB_URL = "";
    private String DB_USERNAME = "";
    private String DB_PASSWORD = "";

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

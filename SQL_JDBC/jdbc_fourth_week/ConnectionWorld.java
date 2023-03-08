package jdbc_fourth_week;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.ResultSetMetaData;

public class ConnectionWorld {
    private String DB_URL = "";
    private String DB_USERNAME = "";
    private String DB_PASSWORD = "";

    public ConnectionWorld(String url, String username, String password) {
        // * @param DB_URL, DB_USERNAME, DB_PASSWORD
        DB_URL = url;
        DB_USERNAME = username;
        DB_PASSWORD = password;
    }

    public Connection CreateWorldConnection() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String query = "SELECT * FROM citta_ita";
            // Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            // ResultSet.CLOSE_CURSORS_AT_COMMIT);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            // * MetaData -------
            ResultSetMetaData rsMetaData = rs.getMetaData();
            // * recupero il numero delle colonne
            int columsNum = rsMetaData.getColumnCount();

            // * sposto il cursore per andare all'ultima riga
            // rs.last();

            // * determino la posizione dell'ultima riga
            // int recordsNumber = rs.getRow();

            while (rs.next()) {
                for (int i = 1; i <= columsNum; i++) {
                    String columnValue = rs.getString(i);
                    System.out.println(rsMetaData.getColumnName(i) + ": " + columnValue);
                }
                System.out.println("");
            }
            // System.out.println("Numero di records: " + recordsNumber);
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void GetRowNumber(String query, ResultSet rs) {
        // rs.last();
        // return rs.getRow();

    }
}

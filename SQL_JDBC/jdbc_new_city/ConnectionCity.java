package jdbc_new_city;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class ConnectionCity {
    private String DB_URL = "";
    private String DB_USERNAME = "";
    private String DB_PASSWORD = "";
    private ArrayList<String> names = new ArrayList<String>();

    private ArrayList<String> districts = new ArrayList<String>();
    private ArrayList<Integer> populations = new ArrayList<Integer>();

    ConnectionCity(String url, String username, String password) {
        // * @param DB_URL, DB_USERNAME, DB_PASSWORD
        DB_URL = url;
        DB_USERNAME = username;
        DB_PASSWORD = password;
    }

    Connection CreateCityConnection() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println(conn == null ? "Connessione fallitaaa" : "Connessione eseguita con successoooo");

            // * ID | Name | CountryCode | District | Population
            String query = "SELECT * FROM world.city";
            PreparedStatement stmt = conn.prepareStatement(query, ResultSet.FETCH_FORWARD, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            boolean exit = false;
            while (!exit) {
                print("Inserire una cittá o uscire?\n[1] Registra\n[2] Esci");
                int userChoice = IntScanner();
                boolean isCityRegistered = false;

                switch (userChoice) {
                    case 1:
                        print("Inserisci il nome della citta:");
                        String cityName = stringScanner();
                        print("Inserisci la regione della citta:");
                        String cityDistrict = stringScanner();

                        // ! ciclo per verificare se la citta é gia registrata
                        while (rs.next()) {
                            if (cityName.equalsIgnoreCase(rs.getString(2))
                                    && cityDistrict.equalsIgnoreCase(rs.getString(4))) {
                                isCityRegistered = true;
                            }
                        }

                        if (isCityRegistered == false) {
                            print("Inserisci la popolazione:");
                            int population = IntScanner();

                            rs.moveToInsertRow();
                            rs.updateString(2, cityName);
                            rs.updateString(3, "ITA");
                            rs.updateString(4, cityDistrict);
                            rs.updateInt(5, population);
                            rs.insertRow();
                            print("Cittá inserita correttamente");
                        } else {
                            print("La cittá é gia registrata nel database");
                        }

                        break;
                    case 2:
                        print("Ciao!");
                        exit = true;
                        break;
                    default:
                        print("Opzione non disponibile");
                }
            }

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String stringScanner() {

        Scanner stringScanner = new Scanner(System.in);
        String userStringInput = stringScanner.nextLine();
        return userStringInput;
    }

    public static int IntScanner() {
        Scanner intScanner = new Scanner(System.in);
        int userIntInput = intScanner.nextInt();
        return userIntInput;
    }

    public void print(String string) {
        System.out.println(string);
    }
}

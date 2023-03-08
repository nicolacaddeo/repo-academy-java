package jdbc_new_city;

public class Main {
    public static void main(String[] args) {
        ConnectionCity conn = new ConnectionCity("jdbc:mysql://localhost:3306/world", "root", "root");
        conn.CreateCityConnection();
    }
}

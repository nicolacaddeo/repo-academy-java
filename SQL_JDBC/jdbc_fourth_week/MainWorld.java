package jdbc_fourth_week;

public class MainWorld {
    public static void main(String[] args) {
        ConnectionWorld conn = new ConnectionWorld("jdbc:mysql://localhost:3306/world", "root", "root");
        conn.CreateWorldConnection();
        MenuWorld.MainMenu();
    }
}

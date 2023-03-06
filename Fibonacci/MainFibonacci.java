public class MainFibonacci {

    public static void main(String[] args) {
        // * nuova connessione al DB (costruttore)
        ConnectionFibonacci connection = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root",
                "root");

        // * try and chatch della connessione
        connection.CreateConnection();

        MenuFibonacci.MainMenu();

    }
}

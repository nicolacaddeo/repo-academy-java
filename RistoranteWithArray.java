import java.util.Scanner;

public class RistoranteWithArray {
    // dichiaro i vari array con le info dei piatti:

    String[] dishNames = { "Carbonara", "Tagliata rucola e grana" };
    String[] dishIngredients = { "Guanciale, uova, pecorino", "Carne di manzo, rucola, scaglie di grana" };
    int[] dishPrices = { 15, 25 };
    int[] dishesAvailable = { 10, 1 };

    // creo l'array per l'eventuale aggiunta di un piatto
    String[] newDish;
    String[] newDishIngr;
    int[] newDishPrice;
    int[] newDishAvaiability;

    int totalPrice = 0;
    int budget = 0;
    int totalClients = 0;

    // varibili di controllo dei cicli
    static boolean order = true;

    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        do {
            Scanner scannerFirstMenu = new Scanner(System.in);
            System.out.println("Vuoi Acquistare o uscire?:\n (1) Entra\n (2) Esci");
            int userAction = scannerFirstMenu.nextInt();

            // entrata o uscita dall' app in base alla scelta dell'utente
            switch (userAction) {
                case 1:
                    Enter();
                    break;
                case 2:
                    System.out.println("Alla prossima!");
                    order = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile si prega di riprovare");
            }

        } while (order);

    }

    public static void Enter() {
        Scanner scannerChoiceMenu = new Scanner(System.in);
        System.out.println("Scegli un'opzione:\n (1) Compra\n (2) Vedi \n (3) Aggiungi \n (4) Esci");
        int userChoice = scannerChoiceMenu.nextInt();

        switch (userChoice) {

        }
    }
}

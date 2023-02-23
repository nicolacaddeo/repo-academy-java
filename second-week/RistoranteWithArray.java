import java.util.Scanner;

public class RistoranteWithArray {
    // dichiaro i vari array con le info dei piatti:

    static String[] dishNames = { "Carbonara", "Tagliata rucola e grana" };
    static String[] dishIngredients = { "Guanciale, uova, pecorino", "Carne di manzo, rucola, scaglie di grana" };
    static int[] dishPrices = { 15, 25 };
    static int[] dishesAvailable = { 10, 1 };

    // creo l'array per l'eventuale aggiunta di un piatto
    static String[] newDish;
    static String[] newDishIngr;
    static int[] newDishPrice;
    static int[] newDishAvaiability;

    static String password = "root";
    static int totalPrice = 0; // varibile che rappresenta il totale speso
    static int budget = 0; // budget del cliente
    static int totalClients = 0; // totale clienti della sessione

    // varibili di controllo dei cicli
    static boolean order = true; // variabile di controllo del ciclo del menu principale (Entra o Esci)
    static boolean fourChoiceMenu = true; // variabile di controlle del ciclo del menu a 4 scelte

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
        while (fourChoiceMenu) {

            Scanner scannerChoiceMenu = new Scanner(System.in);
            System.out.println("Scegli un'opzione:\n (1) Compra\n (2) Vedi \n (3) Aggiungi \n (4) Esci");
            int userChoice = scannerChoiceMenu.nextInt();

            switch (userChoice) {
                case 1:
                    Buy(); // l'utente decide di acquistare un piatto
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    fourChoiceMenu = false; // esco dal ciclo e ritorno al menu principale
                    break;
                default:
                    System.out.println("Opzione non disponibile si prega di riprovare");

            }
        }
    }

    public static void Buy() {
        totalClients++; // aggiungo il cliente
        budget = 30 + (int) (Math.random() * 100); // randomizzo un budget
        System.out.println("Benvenuto! Il tuo budget è di " + budget + " euro");
        System.out.println("I piatti disponibili oggi sono:");

        for (int i = 0; i < dishNames.length; i++) {
            System.out.println(dishNames[i] + "\nIngredienti: " + dishIngredients[i] + "\nPrezzo: " + dishPrices[i]);
            System.out.println("--------------------------");

            Scanner scannerForDish = new Scanner(System.in);
            System.out.println("Quale piatto vuoi comprare? \n(1) Carbonara\n(2) Tagliata");
            int userDish = scannerForDish.nextInt();
        }
    }
}

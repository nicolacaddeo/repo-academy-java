import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.nio.charset.Charset;

public class RistoranteAdvanced {
    static ArrayList<String> dishes = new ArrayList<String>();
    static ArrayList<String> ingredients = new ArrayList<String>();
    static ArrayList<Integer> dishPrices = new ArrayList<Integer>();
    static int randomBudget = 0;
    // variabile per tenere conto del totale speso
    static int totalAmount = 0;

    public static void main(String[] args) {
        // booleano per controllare il ciclo principale
        boolean orderingDish = true;
        // variabile per tenere il conto dei clienti totali
        int totalClients = 0;
        createMenu(); // inizializzo il menu

        while (orderingDish) { // MENU PRINCIPALE
            Scanner scannerFirstMenu = new Scanner(System.in);
            System.out.println("Vuoi Acquistare o uscire?:\n [1] Entra\n [2] Esci");
            int userAction = scannerFirstMenu.nextInt();
            switch (userAction) {
                case 1: // l'utente decide di entare
                    System.out.println("Benvenuto nel nostro ristorante");
                    totalClients++; // aggiungo un nuovo cliente ogni volta che ne entra uno

                    // CHIEDO USERNAME ALL'UTENTE
                    Scanner scannerUserName = new Scanner(System.in);
                    System.out.println("Inserisci il nome utente");
                    String userName = scannerUserName.nextLine();
                    System.out.println("Benvenuto " + userName);

                    // RANDOMIZZO UN BUDGET
                    int min = 10; // valore minimo del budget
                    int max = 50; // valore massimo del budget

                    // Genero un budget tra i 10 e 50 euro
                    randomBudget = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    System.out.println("Il tuo budget --> " + randomBudget + " euro");
                    System.out.println("I piatti disponibili oggi sono:");
                    for (int i = 0; i < dishes.size(); i++) {
                        System.out.println(dishes.get(i));
                    }
                    boolean fourChoiceMenu = true;
                    while (fourChoiceMenu) {
                        Scanner scannerMainMenu = new Scanner(System.in);
                        System.out.println("Scegli un'opzione:\n[1] Ordina\n[2] Visualizza\n[3] Modifica\n[4] Esci");
                        int userChoice = scannerMainMenu.nextInt();

                        switch (userChoice) {
                            case 1: // ORDINA
                                Buy();
                                break;
                            case 2: // VISUALIZZA
                                View();
                                break;
                            case 3: // MODIFICA
                                Edit();
                                break;
                            case 4: // ESCI
                                System.out.println("Totale clienti sessione: " + totalClients);
                                System.out.println("Totale speso: " + totalAmount + " euro");
                                fourChoiceMenu = false;
                                break;
                            default:
                                System.out.println("Opzione non disponibile, riprovare");
                        }
                    }

                    break;
                case 2:
                    System.out.println("Alla prossima!");
                    // l'utente esce dal programma
                    orderingDish = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile riprovare");
            }
        }
    }

    static void Buy() {
        System.out.println("Che piatto vuoi comprare?");
        Scanner scannerForDish = new Scanner(System.in);
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(i + " per " + dishes.get(i));
        }
        // variabile che rappresenta l'indice dell'elemento nell'ArrayList
        int dishForUser = scannerForDish.nextInt();
        int priceToPay = dishPrices.get(dishForUser);
        if (randomBudget > priceToPay) {
            totalAmount += priceToPay;
            System.out.println("Hai acquistato correttamente " + dishes.get(dishForUser));
        } else {
            System.out.println("Budget insufficente");
        }
    }

    static void View() {
        System.out.println("I piatti disponibili oggi sono:");
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(dishes.get(i));
        }
    }

    static void Edit() {
        System.out.println("Benvenuto nell'area di modifica");
        Scanner scannerEditMenu = new Scanner(System.in);
        System.out.println("Scegli un'opzione:\n[1] Aggiungi\n[2] Modifica\n[3] Elimina");
        int editUserChoice = scannerEditMenu.nextInt();
        switch (editUserChoice) {
            case 1: // AGGIUNTA PIATTO
                System.out.println("Area di aggiunta piatto");
                Scanner scannerAdd = new Scanner(System.in);

                // chiedo il nome del piatto da aggiungere
                System.out.println("Inserisci il piatto che vuoi aggiungere");
                String dishToAdd = scannerAdd.nextLine();
                dishes.add(dishToAdd);

                // chiedo gli ingredienti del nuovo piatto
                Scanner scannerIngredient = new Scanner(System.in);
                System.out.println("Inserisci gli ingredienti del nuovo piatto, separati da una virgola");
                String newIngredients = scannerIngredient.nextLine();
                ingredients.add(newIngredients);

                // chiedo il prezzo del nuovo piatto
                Scanner scannerPrice = new Scanner(System.in);
                System.out.println("Inserisci il prezzo del nuovo piatto");
                int newPrice = scannerPrice.nextInt();

                System.out.println(dishes);
                System.out.println(newIngredients);
                System.out.println(newPrice);
                break;
            case 2: // MODIFICA PIATTO
                System.out.println("Area di modifica piatto");
                Scanner scannerEdit = new Scanner(System.in);

                System.out.println("Seleziona il piatto da modificare");
                for (int i = 0; i < dishes.size(); i++) {
                    System.out.println(i + " per " + dishes.get(i));
                }

                // variabile che rappresenta l'indice dell'elemento nell'ArrayList
                int dishToEdit = scannerEdit.nextInt();
                System.out.println("Hai selezionato la modifica per il piatto: " + dishes.get(dishToEdit));
                Scanner scannerForEdit = new Scanner(System.in);
                System.out.println("Inserisci il nome del nuovo piatto");
                String newDishName = scannerForEdit.nextLine();

                dishes.set(dishToEdit, newDishName);
                System.out.println(dishes);
                break;
            case 3: // ELIMINA PIATTO
                System.out.println("Area di elimina piatto");
                Scanner scannerDelete = new Scanner(System.in);
                System.out.println("Seleziona il piatto da eliminare");
                for (int i = 0; i < dishes.size(); i++) {
                    System.out.println(i + " per " + dishes.get(i));
                }

                // variabile che rappresenta l'indice dell'elemento nell'ArrayList
                int dishToDelete = scannerDelete.nextInt();
                System.out.println("Hai eliminato il seguente piatto --> " + dishes.get(dishToDelete));
                dishes.remove(dishToDelete);
                System.out.println(dishes);
                break;
            default:
                System.out.println("Opzione non disponibile riprovare");
        }
    }

    static void createMenu() {
        // aggiungo nome piatti
        dishes.add("Carbonara");
        dishes.add("Tagliata");
        // aggiungo ingredienti
        ingredients.add("Guanciale, uova, pecorino, parmigiano");
        ingredients.add("Carne di manzo, rucola, scaglie di grana");
        // aggiungo prezzi
        dishPrices.add(15);
        dishPrices.add(30);
    }
}

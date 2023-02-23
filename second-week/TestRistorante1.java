import java.util.Scanner;

public class TestRistorante1 {
    public static void main(String[] args) {
        // ---------------- PASTA ---------------- //
        String pasta = "Carbonara";
        String pastaIngr = "Guanciale, uova, pecorino, parmigiano";
        int pastaDisp = 10;
        int pastaPrice = 15;
        // -------------------------------------- //

        // ---------------- CARNE ---------------- //
        String meat = "Tagliata";
        String meatIngr = "Carne di manzo, rucola, scaglie di grana";
        int meatDisp = 1;
        int meatPrice = 25;
        // -------------------------------------- //

        // ---------------- NUOVO PIATTO ---------------- //
        String newDish = "";
        String newDishIngr = "";
        int newDishDisp = 1;
        int newDishPrice = 0;
        // --------------------------------------------- //

        String password = "root";
        int totalPrice = 0;
        int budget = 0;
        int totalClients = 0;

        boolean order = true; // varibiale di controllo del primo loop

        do {
            Scanner scannerFirstMenu = new Scanner(System.in);
            System.out.println("Vuoi Acquistare o uscire?:\n (1) Entra\n (2) Esci");
            int userAction = scannerFirstMenu.nextInt();

            switch (userAction) { // switch che controlla l'entrata o l'uscita dall'app
                case 1:
                    totalClients++; // aggiungo il cliente
                    budget = 30 + (int) (Math.random() * 100); // randomizzo un budget
                    System.out.println("Benvenuto! Il tuo budget è di " + budget + " euro");

                    boolean userMenu = true; // controllo del loop menu a 4 scelte

                    while (userMenu) {
                        Scanner scannerMainMenu = new Scanner(System.in);
                        System.out.println("Scegli un'opzione:\n (1) Compra\n (2) Vedi \n (3) Aggiungi \n (4) Esci");
                        int userChoice = scannerMainMenu.nextInt();

                        switch (userChoice) {
                            case 1: // l'utente decide di comprare
                                System.out.println("I piatti disponibili oggi sono:");
                                System.out.println(pasta + "\nPrezzo: " + pastaPrice + "\nIngredienti: " + pastaIngr);
                                System.out.println(meat + "\nPrezzo: " + meatPrice + "\nIngredienti: " + meatIngr);
                                Scanner scannerDish = new Scanner(System.in);
                                System.out.println("Inserisci il piatto che vuoi acquistare");
                                String userDish = scannerDish.nextLine(); // piatto scelto dall'utente

                                if (userDish.equals(pasta)) {

                                    if ((budget >= pastaPrice) && (pastaDisp > 0)) {
                                        pastaDisp--;
                                        totalPrice += pastaPrice;
                                        System.out.println("Hai comprato il piatto: " + pasta);
                                    } else {
                                        System.out.println("Piatto non acquistabile");
                                    }

                                } else if (userDish.equals(meat)) {

                                    if ((budget >= meatPrice) && (meatDisp > 0)) {
                                        meatDisp--;
                                        totalPrice += meatPrice;
                                        System.out.println("Hai comprato il piatto: " + meat);

                                    } else {
                                        System.out.println("Piatto non acquistabile");
                                    }

                                } else {
                                    System.out.println("Questo piatto non è disponibile");
                                }
                                break;
                            case 2: // l'utente decide l'opzione "VEDI"
                                System.out.println("I piatti disponibili oggi sono:");
                                System.out.println(pasta + "\nPrezzo: " + pastaPrice + "\nIngredienti: " + pastaIngr
                                        + "\nDisponibilità: " + pastaDisp);
                                System.out.println(meat + "\nPrezzo: " + meatPrice + "\nIngredienti: " + meatIngr
                                        + "\nDisponibilità: " + meatDisp);
                                break;

                            case 3: // l'utente sceglie l'opzione "AGGIUNGI" -- L'OPZIONE NON FUNZIONA
                                Scanner scannerPw = new Scanner(System.in);
                                System.out.println("Inserisci la password");
                                String userPassword = scannerPw.nextLine(); // richiesta password
                                if (userPassword.equals(password)) {
                                    System.out.println("Password corretta");
                                } else {
                                    System.out.println("Password errata");
                                }
                                break;
                            case 4:
                                System.out.println("Totale clienti sessione: " + totalClients);
                                System.out.println("Totale speso: " + totalPrice + " euro");
                                userMenu = false;
                                break;
                        }
                    }
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
}

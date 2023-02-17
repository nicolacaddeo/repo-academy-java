import java.util.Scanner;

public class Esercizio1giovedi {
    public static void main(String[] args) {
        boolean order = true;
        // info pasta
        String pasta = "Uova, guanciale, parmigiano, pecorino";
        double prezzoPasta = 10.00;
        int pastaDisp = 20;

        // info carne
        String carne = "Carne di manzo, rucola e grana";
        double prezzoCarne = 15.00;
        int carneDisp = 15;

        // info dolce
        String dolce = "Farina, uova, zucchero, cioccolato";
        double prezzoDolce = 8.00;
        int dolceDisp = 6;

        do {
            Scanner scannerMenu = new Scanner(System.in);
            System.out.println("Seleziona un piatto: (1) Pasta\n (2) Carne\n (3) Dolce\n (4) Annulla");
            int userAction = scannerMenu.nextInt();

            // controllo sull'input
            if (userAction < 1 || userAction > 4) {
                System.out.println("Opzione non disponibile");

            } else {
                switch (userAction) {
                    case 1:
                        System.out.println("Hai selezionato pasta");
                        System.out.println("Ingredienti: " + pasta);
                        System.out.println("Prezzo: " + prezzoPasta);
                        System.out.println("Disponibilita: " + pastaDisp);

                        Scanner pastaConfirm = new Scanner(System.in);
                        System.out.println("Confermi di ordinare il piatto " + "pasta" + "? \n (1) Si \n (2) No");
                        int userConfirm = pastaConfirm.nextInt();

                        if (userConfirm == 1) {
                            System.out.println("Hai ordinato pasta");
                            System.out.println("Nuova disponibilita: " + (pastaDisp - 1));
                        }
                        break;

                    case 2:
                        System.out.println("Hai selezionato carne");
                        System.out.println("Ingredienti: " + carne);
                        System.out.println("Prezzo: " + prezzoCarne);
                        System.out.println("Disponibilita: " + carneDisp);

                        Scanner carneConfirm = new Scanner(System.in);
                        System.out.println("Confermi di ordinare il piatto " + "carne" + "? \n (1) Si \n (2) No");
                        userConfirm = carneConfirm.nextInt();

                        if (userConfirm == 1) {
                            System.out.println("Hai ordinato carne");
                            System.out.println("Nuova disponibilita: " + (carneDisp - 1));
                        }
                        break;

                    case 3:
                        System.out.println("Hai selezionato dolce");
                        System.out.println("Ingredienti: " + dolce);
                        System.out.println("Prezzo: " + prezzoDolce);
                        System.out.println("Disponibilita: " + dolceDisp);

                        Scanner dolceConfirm = new Scanner(System.in);
                        System.out.println("Confermi di ordinare il piatto " + "dolce" + "? \n (1) Si \n (2) No");
                        userConfirm = dolceConfirm.nextInt();

                        if (userConfirm == 1) {
                            System.out.println("Hai ordinato dolce");
                            System.out.println("Nuova disponibilita: " + (dolceDisp - 1));
                        }
                        break;

                    case 4:
                        System.out.println("Ciao!");
                        order = false;
                        break;
                }
            }
        } while (order);
    }
}

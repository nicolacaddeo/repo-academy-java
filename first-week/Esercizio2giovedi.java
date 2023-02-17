import java.util.Scanner;

public class Esercizio2giovedi {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        boolean count = true;

        while (count) {
            Scanner scannerChoice = new Scanner(System.in);
            System.out.println("Vuoi contare o uscire?\n (1) Contare\n (2) Uscire");
            int userAction = scannerChoice.nextInt();

            if (userAction == 1) {
                Scanner scannerHowMany = new Scanner(System.in);
                System.out.println("Quante volte vuoi contare?\n10\n20\n30");
                userAction = scannerHowMany.nextInt();

                switch (userAction) {
                    case 10:
                        for (int i = 0; i < x; i++) {
                            System.out.println(i + 1);
                        }
                        break;
                    case 20:
                        for (int i = 0; i < y; i++) {
                            System.out.println(i + 1);
                        }
                        break;

                    case 30:
                        for (int i = 0; i < z; i++) {
                            System.out.println(i + 1);
                        }
                        break;
                    default:
                        System.out.println("Opzione non disponibile");
                }

            } else if (userAction == 2) {
                System.out.println("Ciao!");
                count = false;

            } else {
                System.out.println("Opzione non disponibile");
            }
        }
    }
}

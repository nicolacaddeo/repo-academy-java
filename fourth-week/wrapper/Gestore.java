package wrapper;

import java.util.Scanner;
import java.util.ArrayList;

public class Gestore {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();

        boolean exit = false;
        while (!exit) {
            System.out.println("[1] Entra\n[2] Esci");
            int userChoice = intScanner.nextInt();
            String[] datas;

            datas = new String[2];
            switch (userChoice) {
                case 1:

                    System.out.print("Inserisci una stringa: ");
                    String userString = stringScanner.nextLine();
                    strings.add(userString);

                    System.out.print("Inserisci un numero: ");
                    Integer userNumber = intScanner.nextInt();
                    numbers.add(userNumber);

                    Oggetto object = new Oggetto(userNumber, userString);

                    datas[0] = userString;
                    datas[1] = userNumber.toString();

                    // * stampo l'array
                    System.out.println("Array:");
                    for (int i = 0; i < datas.length; i++) {
                        System.out.println(datas[i]);
                    }

                    System.out.println("--------------------");

                    // * stampo gli arrayList
                    System.out.println("ArrayList:");
                    for (Integer numero : numbers) {
                        System.out.println(numero);
                    }
                    for (String stringa : strings) {
                        System.out.println(stringa);
                    }
                    break;
                case 2:
                    System.out.println("Alla prossima");
                    exit = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }
        }
    }

}

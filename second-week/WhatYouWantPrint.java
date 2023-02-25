import java.util.Scanner;

public class WhatYouWantPrint {
    public static void main(String[] args) {
        boolean keep = true;
        while (keep) {
            Scanner scannerForUser = new Scanner(System.in);
            System.out
                    .println("Che tipo di dato vuoi stampare?\n[1] int\n[2] double\n[3] bool\n[4] String\n[5] Uscire");
            int userChoice = scannerForUser.nextInt();
            switch (userChoice) {
                case 1:
                    Scanner scannerForInt = new Scanner(System.in);
                    System.out.println("Inserisci l'intero da stampare");
                    int intToPrint = scannerForInt.nextInt();
                    System.out.println(printAnInt(intToPrint));
                    break;
                case 2:
                    Scanner scannerForDouble = new Scanner(System.in);
                    System.out.println("Inserisci il double da stampare");
                    double doubleToPrint = scannerForDouble.nextDouble();
                    System.out.println(printADouble(doubleToPrint));

                    break;
                case 3:
                    Scanner scannerForBool = new Scanner(System.in);
                    System.out.println("Inserisci il booleano da stampare");
                    boolean boolToPrint = scannerForBool.nextBoolean();
                    System.out.println(printABool(boolToPrint));
                    break;
                case 4:
                    Scanner scannerForString = new Scanner(System.in);
                    System.out.println("Inserisci la stringa da stampare");
                    String stringToPrint = scannerForString.nextLine();
                    System.out.println(printAString(stringToPrint));
                    break;
                case 5:
                    keep = false;
                    break;

            }
        }

    }

    static int printAnInt(int x) {
        return x;
    }

    static double printADouble(double x) {
        return x;
    }

    static boolean printABool(boolean bool) {
        return bool;
    }

    static String printAString(String abc) {
        return abc;
    }
}

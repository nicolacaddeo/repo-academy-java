import java.util.Scanner;

public class ArrEx1 {
    public static void main(String[] args) {

        Scanner nameScan = new Scanner(System.in);
        System.out.println("Inserisci nome:");
        String name = nameScan.nextLine();

        Scanner surnameScan = new Scanner(System.in);
        System.out.println("Inserisci cognome:");
        String surName = nameScan.nextLine();

        Scanner emailScan = new Scanner(System.in);
        System.out.println("Inserisci email:");
        String email = nameScan.nextLine();

        Scanner ageScan = new Scanner(System.in);
        System.out.println("Inserisci eta:");
        String age = nameScan.nextLine();

        String[] data = { name, surName, email, age };

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            System.out.print(" ");
        }

        nameScan.close();
        surnameScan.close();
        emailScan.close();
        ageScan.close();
    }
}

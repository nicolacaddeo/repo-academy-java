import java.util.Scanner;

public class ArrEx2 {
    public static void main(String[] args) {
        String[] userData;
        userData = new String[4];

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

        // String[] userData = { name, surName, email, age };

        userData[0] = name;
        userData[1] = surName;
        userData[2] = email;
        userData[3] = age;

        for (int i = 0; i < userData.length; i++) {
            System.out.print(userData[i]);
            System.out.print(" ");
        }

        nameScan.close();
        surnameScan.close();
        emailScan.close();
        ageScan.close();
    }
}

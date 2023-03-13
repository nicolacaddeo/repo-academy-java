package try_catch;

import java.util.Scanner;

public class MainTry {
    public static void main(String[] args) {
        boolean exit = false;

        try {
            int[] nums = { 1, 2, 3, 4 };
            System.out.println(nums[12]);

        } catch (Exception e) {
            System.out.println("Qualcosa non é andato");
        } finally {
            System.out.println("Finito");
        }

        checkAge(15);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Accesso non consentito - Devi essere maggiorenne");
        } else {
            System.out.println("Accesso consentito");
        }
    }
}

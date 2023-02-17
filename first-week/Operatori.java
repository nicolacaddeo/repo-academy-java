import java.util.Scanner;

public class Operatori {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int dividendo;

        // richiedo il dividendo
        System.out.println("Inserisci il numero da dividere");
        dividendo = number.nextInt();
        System.out.println("Hai inserito il numero " + dividendo);

        // controllo se il numero e' pari
        boolean isEven = (dividendo % 2 == 0);
        System.out.println(isEven);

        Scanner number2 = new Scanner(System.in);
        int divisore;

        // richiedo il divisore
        System.out.println("Inserisci il dividendo");
        divisore = number.nextInt();
        System.out.println("Hai inserito il numero " + dividendo);

        // stampo il risultato
        System.out.println(dividendo + " modulo " + divisore + " = " + (dividendo % divisore));

        number.close();
        number2.close();
    }
}

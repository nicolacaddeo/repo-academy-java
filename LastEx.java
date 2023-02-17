import java.util.Scanner;

public class LastEx {
    public static void main(String[] args) {
        System.out.println("Benvenuto!");

        // Scanner per chiedere i 3 dati

        // 1.numero
        Scanner myNum = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int userNumber = myNum.nextInt();

        // 2.stringa
        Scanner myStr = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String userString = myStr.nextLine();

        // 3. booleano
        Scanner myBool = new Scanner(System.in);
        System.out.println("Inserisci 0 o 1");
        int userBoolToConvert = myBool.nextInt();
        boolean userBool = false;

        // converto l'input in booleano
        if (userBoolToConvert == 0) {
            userBool = false;

        } else if (userBoolToConvert == 1) {
            userBool = true;

        } else {
            System.out.println("Valore non valido");
        }

        // recap dei dati inseriti

        System.out.println("Il numero inserito è: " + userNumber);
        System.out.println("La stringa inserita è: " + userString);
        System.out.println("Il booleano inserito è: " + userBool);

        // ----------------------------------------------------------------------------------

        // scelta della funzione
        Scanner myFunction = new Scanner(System.in);
        System.out.println("Scegli un\'opzione: Matematiche(1), Stringa(2), Casting(3)");
        int userFunction = myFunction.nextInt();

        System.out.println("Hai scelto l\'opzione numero " + userFunction);

        // ----------------------------------------------------------------------------------

        switch (userFunction) {
            // funzioni matematiche
            case 1:
                System.out.println(
                        "Benvenuto nelle funzioni matematiche, le operazioni disponibili sono: Somma(1), Sottrazione(2), Moltiplicazione(3), Modulo(4), le operazioni saranno eseguite tra il tuo numero e il numero 10");

                // creo lo scanner per richiedere l'operazione desiderata
                Scanner operation = new Scanner(System.in);
                int userOperation = operation.nextInt();

                // controllo sul tipo di operazione
                if (userOperation > 4 || userOperation < 1) {
                    System.out.println("L\'opzione non è disponibile");

                } else {

                    final int number2 = 10;

                    if (userOperation == 1) {
                        System.out.println("Il risultato della somma è " + (userNumber + number2));

                    } else if (userOperation == 2) {
                        System.out.println("Il risultato della sottrazione è " + (userNumber - number2));

                    } else if (userOperation == 3) {
                        System.out.println("Il risultato della moltiplicazione è " + (userNumber * number2));

                    } else if (userOperation == 4) {
                        System.out.println("Il resto della divisione è " + (userNumber % number2));
                    }

                    operation.close();
                }
                break;

            // funzioni stringa
            case 2:
                System.out.println("Benvenuto nelle funzioni stringa");
                Scanner myObj = new Scanner(System.in);
                System.out.println("Inserisci una stringa da concatenare");
                String strToConcat = myObj.nextLine();

                // unisco le 2 stringhe
                String result = userString + " " + strToConcat;

                // stampo le stringhe concatenate
                System.out.println("Ecco le 2 stringhe: " + result);
                break;

            // funzioni casting
            case 3:
                System.out.println("Benvenuto nelle funzioni di casting");
                double double_conversion = userNumber;
                float float_conversion = (float) userNumber;

                // stampo i valori castati
                System.out.println("double: " + double_conversion);
                System.out.println("float: " + float_conversion);
                break;
        }
    }
}

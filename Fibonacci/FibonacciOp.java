import java.util.ArrayList;

public class FibonacciOp {
    public static void PrintSeries(int input) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        // stampo 0 e 1 che sono sempre i primi due numeri della serie
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < input; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void SearchNum(int input) {
        ArrayList<Integer> numsGenerated = new ArrayList<Integer>();
        int index = 0;
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (index < 30) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            numsGenerated.add(n3);
            index++;
        }
        // controllo se il numero fa parte della serie
        if (numsGenerated.contains(input)) {
            System.out.println("Il numero " + input + " fa parte della serie");
        } else {
            System.out.println("Il numero " + input + " non fa parte della serie");
        }
    }
}

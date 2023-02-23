public class StaticAndNonStatic {
    public static void main(String[] args) {

        class math {
            public int sum(int x, int y) {
                int sum = x + y;
                return sum;
            }

            public static void Print100() {
                System.out.println(100);
            }
        }
        math somma = new math(); // creo istanza somma

        // metodo NON statico quindi richiamo il metodo con il nome dell'istanza
        int miaVariabile = somma.sum(2, 5);
        System.out.println(miaVariabile);

        // metodo statico quindi richiamo con il nome della classe
        math.Print100();
    }

}

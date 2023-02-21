public class ContinueEx {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i == 4) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);

            }
            if (i % 2 != 0) {
                System.out.println("Numero addizionato " + (i) + " --> " + (i + 1));
            }
        }
    }
}

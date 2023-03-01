package third_week;

public class Cars {
    public void MaxSpeed(int x) {
        System.out.println("La velocitá massima é di " + x + "Km/h");
    }

    public void MaxSpeed(int x, int y) {
        System.out.println("La velocitá massima é di " + x + "Km/h");
        System.out.println("La cilindrata é " + y);
    }

    public static void main(String[] args) {
        Cars myCar1 = new Cars();
        Cars myCar2 = new Cars();

        myCar1.MaxSpeed(220);
        System.out.println("----------------");
        myCar2.MaxSpeed(1000, 120);
    }
}

package shapes;

public class Main {
    public static void main(String[] args) {

        try {
            Circle cerchio1 = new Circle(getRandomNumber());
            Circle cerchio2 = new Circle(getRandomNumber());

            Triangle triangolo1 = new Triangle(getRandomNumber(), getRandomNumber(), getRandomNumber());
            Triangle triangolo2 = new Triangle(getRandomNumber(), getRandomNumber(), getRandomNumber());

            ShapeManager shapeManager = new ShapeManager();

            shapeManager.addShape(cerchio1);
            shapeManager.addShape(cerchio2);
            shapeManager.addShape(triangolo1);
            shapeManager.addShape(triangolo2);

            // * Test dei metodi
            shapeManager.getShapes();
            shapeManager.getTotalArea();
            shapeManager.getTotalPerimeter();

        } catch (Exception e) {
            System.out.println("Errore: " + e);
        }
    }

    public static int getRandomNumber() {
        int min = 10; // Minimum value of range
        int max = 20; // Maximum value of range

        // Generate random int value from min to max
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }
}

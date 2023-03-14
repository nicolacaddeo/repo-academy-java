package shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        boolean exit = false;

        while (!exit) {
            int userChoice = getInput(
                    "Seleziona un'opzione:\n[1] Aggiungi forma\n[2] Calcola area totale\n[3] Calcola perimetro totale\n[4] Esci");
            switch (userChoice) {
                case 1:
                    int shapeChoice = getInput("[1] Cerchio\n[2] Triangolo");
                    if (shapeChoice == 1) {
                        shapeManager.addShape(new Circle(getRandomNumber()));
                        System.out.println("Cerchio aggiunto correttamente");

                    } else if (shapeChoice == 2) {
                        shapeManager.addShape(new Triangle(getRandomNumber(), getRandomNumber(), getRandomNumber()));
                        System.out.println("Triangolo aggiunto correttamente");

                    } else {
                        System.out.println("Opzione non disponibile");
                    }
                    break;
                case 2:
                    shapeManager.getTotalArea();
                    break;
                case 3:
                    shapeManager.getTotalPerimeter();
                    break;
                case 4:
                    System.out.println("Ciao!");
                    exit = true;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }
        }
    }

    public static int getInput(String string) {
        Scanner intScanner = new Scanner(System.in);
        System.out.println(string);
        int userChoice = intScanner.nextInt();

        return userChoice;
    }

    public static int getRandomNumber() {
        int min = 10; // Minimum value of range
        int max = 20; // Maximum value of range

        // Generate random int value from min to max
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;
    }
}

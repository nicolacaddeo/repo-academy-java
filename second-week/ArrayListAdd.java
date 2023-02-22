
// pomeriggio 21/02
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Ferrari");
        cars.set(0, "Opel");
        System.out.println(cars);
        System.out.println("Size: " + cars.size());
        System.out.println(cars.get(0));
    }
}

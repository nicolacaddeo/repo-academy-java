package ristorante;

import java.util.ArrayList;

public class Ordinazione extends ArrayList<Piatto> {

    private ArrayList<Piatto> dishes;
    protected int totalPrice;
    static int finalPrice;

    public static int getFinalPrice() {
        return finalPrice;
    }

    Ordinazione() {
        dishes = new ArrayList<Piatto>();
    }

    public void addDish(Piatto dish) {
        dishes.add(dish);
    }

    public void printDishes() {
        System.out.println("Hai ordinato:");
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(dishes.get(i).getDishName());
        }
    }

    public int calcTotalPrice() {
        for (int i = 0; i < dishes.size(); i++) {
            totalPrice += dishes.get(i).getPrice();

            finalPrice += totalPrice;
        }

        return totalPrice;
    }

    // TODO metodo per il calcolo del conto
}

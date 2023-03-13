package ristorante;

import java.util.ArrayList;
import java.util.Arrays;

public class Piatto {
    private String dishName;
    private String[] ingredients;
    private String chef;
    private int price;

    // * COSTRUTTORE ----
    Piatto(String dishName, String[] ingredients, String chefName, int price) {
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.chef = chefName;
        this.price = price;
    }

    // * Getters/Setters ----
    public String[] getIngredients() {
        return ingredients;
    }

    public String getDishName() {
        return dishName;
    }

    public String getChef() {
        return chef;
    }

    public int getPrice() {
        return price;
    }
}

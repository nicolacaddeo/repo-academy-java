package RistoranteIncaps;

import java.util.ArrayList;

public class Dish {
    private String bread;
    public int price;
    public ArrayList<String> Ingredients = new ArrayList<String>();

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        Ingredients = ingredients;
    }

}

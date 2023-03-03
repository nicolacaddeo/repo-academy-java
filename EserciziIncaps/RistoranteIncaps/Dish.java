package RistoranteIncaps;

import java.util.ArrayList;

public class Dish {
    private String breadType;
    public double breadPrice;
    public String meat;
    public double meatPrice;
    public String sauce;
    public double saucePrice;
    public String otherIngr;
    public double otherIngrPrice;

    // * tipo del pane
    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // * carne
    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    // * salsa
    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    // * contorno/ingrediente aggiuntivo
    public String getOtherIngr() {
        return otherIngr;
    }

    public void setOtherIngr(String otherIngr) {
        this.otherIngr = otherIngr;
    }

}

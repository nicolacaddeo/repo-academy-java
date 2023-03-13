package ristorante;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Piatto> menu = new ArrayList<Piatto>();
    private String[] carbonaraIngr = { "Parmigiano", "Pecorino", "Guanciale", "Uova" };
    private String[] tagliataIngr = { "Carne di manzo", "Rucola", "Grana" };

    public String[] getCarbonaraIngr() {
        return carbonaraIngr;
    }

    public String[] getTagliataIngr() {
        return tagliataIngr;
    }

    public void CreateMenu() {

        menu.add(new Piatto("Carbonara", carbonaraIngr, "Carlo Cracco", 20));
        menu.add(new Piatto("Tagliata", tagliataIngr, "Mia nonna", 30));
    }

    Menu(ArrayList<Piatto> piatti) {
        this.menu = piatti;
    }

}

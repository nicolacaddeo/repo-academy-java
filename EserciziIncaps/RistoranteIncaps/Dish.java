package RistoranteIncaps;

public class Dish {
    private String ingr1;
    public int ingr1Price = 3;
    private String ingr2;
    public int ingr2Price = 5;

    public String getIngr1() {
        return ingr1;
    }

    public void setIngr1(String newIngr1) {
        this.ingr1 = newIngr1;
    }

    public String getIngr2() {
        return ingr2;
    }

    public void setIngr2(String newIngr2) {
        this.ingr2 = newIngr2;
    }

    public String ingr3;
    public String ingr4;
    public int pubIngrPrice = 2;

    // * prezzo base
    public int basePrice = 5;

}

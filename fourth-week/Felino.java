import java.util.ArrayList;

public class Felino extends Animal {
    static private ArrayList<Felino> nomiFelini = new ArrayList<Felino>();

    private String name;

    public String getName() {
        return name;
    }

    private int weight;

    Felino(String name, int weight, ArrayList<Felino> nomiFelini) {
        this.name = name;
        this.weight = weight;
        this.nomiFelini = nomiFelini;
    }

    public static void addName(Felino name) {
        nomiFelini.add(name);
    }

    public void versoAnimale() {
        System.out.println("Miaoo");
    }
}

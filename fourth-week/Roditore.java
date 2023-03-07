import java.util.ArrayList;

public class Roditore extends Animal {
    static private ArrayList<Roditore> nomiRoditori = new ArrayList<Roditore>();

    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    Roditore(String name, int weight, ArrayList<Roditore> nomiRoditori) {
        this.name = name;
        this.weight = weight;
        this.nomiRoditori = nomiRoditori;
    }

    public static void addName(Roditore name) {
        nomiRoditori.add(name);
    }

    public void versoAnimale() {
        System.out.println("squit squit");
    }
}

package registra_animali;

import java.util.ArrayList;

public class Anfibio extends Animal {
    static private ArrayList<Anfibio> nomiAnfibi = new ArrayList<Anfibio>();

    public String getName() {
        return name;
    }

    private String name;
    private int weight;

    Anfibio(String name, int weight, ArrayList<Anfibio> nomiAnfibi) {
        this.name = name;
        this.weight = weight;
        this.nomiAnfibi = nomiAnfibi;
    }

    public static void addName(Anfibio name) {
        nomiAnfibi.add(name);
    }

    public void versoAnimale() {
        System.out.println("cra cra");
    }
}

import java.util.ArrayList;

public class Canide extends Animal {
    static private ArrayList<Canide> nomiCanidi = new ArrayList<Canide>();

    private String name;

    public String getName() {
        return name;
    }

    private int weight;

    Canide(String name, int weight, ArrayList<Canide> nomiCanidi) {
        this.name = name;
        this.weight = weight;
        this.nomiCanidi = nomiCanidi;
    }

    public static void addName(Canide name) {
        nomiCanidi.add(name);
    }

    public void versoAnimale() {
        System.out.println("Bau");
    }
}

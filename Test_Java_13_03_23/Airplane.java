public class Airplane {
    private String name;
    private int seats;
    private int loadCapacity;

    // * Costruttore
    public Airplane(String name, int seats, int loadCapacity) {
        this.name = name;
        this.seats = seats;
        this.loadCapacity = loadCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
public class CargoPlane extends Airplane {
    private int maxLoadCapacity;

    // * Costruttore
    public CargoPlane(String name, int seats, int loadCapacity, int capacity) {
        super(name, seats, loadCapacity);
        this.maxLoadCapacity = capacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

}

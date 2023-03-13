public class PassengerPlane extends Airplane {
    private int numberOfServices;

    // * Costruttore
    public PassengerPlane(String name, int seats, int loadCapacity, int services) {
        super(name, seats, loadCapacity);
        this.numberOfServices = services;
    }

    public int getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

}

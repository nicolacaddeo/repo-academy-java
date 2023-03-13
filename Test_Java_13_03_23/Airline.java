import java.util.ArrayList;

public class Airline {
    private ArrayList<PassengerPlane> passengerPlains = new ArrayList<PassengerPlane>();
    private ArrayList<CargoPlane> cargoPlains = new ArrayList<CargoPlane>();
    private ArrayList<Airplane> planes = new ArrayList<Airplane>();

    // * Costruttore
    public Airline() {
        this.passengerPlains = new ArrayList<PassengerPlane>();
        this.cargoPlains = new ArrayList<CargoPlane>();
        this.planes = new ArrayList<Airplane>();
    }

    // * metodi di aggiunta e rimozione aerei
    public void addPassPlain(PassengerPlane airplane) {
        this.passengerPlains.add(airplane);
        this.planes.add(airplane);
    }

    public void removePassPlain(int index) {
        this.passengerPlains.remove(this.passengerPlains.get(index));
    }

    public void addCargoPlain(CargoPlane airplane) {
        this.cargoPlains.add(airplane);
        this.planes.add(airplane);
    }

    public void removeCargoPlain(int index) {
        this.cargoPlains.remove(this.cargoPlains.get(index));
    }

    public void sizeOfArr() {
        System.out.println("Lunghezza: " + this.passengerPlains.size());
    }

    public void viewPassPlanes() {
        System.out.println("Aerei passeggeri:");

        for (int i = 0; i < this.passengerPlains.size(); i++) {
            System.out.println("[" + i + "]" + passengerPlains.get(i).getName());
            System.out.println("---------------------------");
        }

    }

    public void viewCargoPlanes() {
        System.out.println("Aerei cargo:");

        for (int i = 0; i < this.cargoPlains.size(); i++) {
            System.out.println("[" + i + "]" + cargoPlains.get(i).getName());
            System.out.println("---------------------------");
        }
    }

    public int getTotalCapacity() {
        int totalCapacity = 0;

        for (int i = 0; i < this.passengerPlains.size(); i++) {
            totalCapacity += this.passengerPlains.get(i).getLoadCapacity();
        }

        for (int i = 0; i < this.cargoPlains.size(); i++) {
            totalCapacity += this.cargoPlains.get(i).getLoadCapacity();
        }

        return totalCapacity;
    }

    public void searchBySeats(int seats) {
        System.out.println("Ecco i veivoli con " + seats + " posti:");
        for (int i = 0; i < this.planes.size(); i++) {
            if (this.planes.get(i).getSeats() == seats) {
                System.out.println("Nome: " + planes.get(i).getName());
            }

        }
    }
}

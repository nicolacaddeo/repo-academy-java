public class TestClass {
    public static void main(String[] args) {
        try {
            Airline airline = new Airline();

            PassengerPlane aereo1 = new PassengerPlane("Boing 747", 400, 20, 5);
            PassengerPlane aereo2 = new PassengerPlane("Boing 758", 4, 30, 7);
            airline.addPassPlain(aereo1);
            airline.addPassPlain(aereo2);

            CargoPlane aereo3 = new CargoPlane("Boing 784", 4, 70, 80);
            CargoPlane aereo4 = new CargoPlane("Boing 758", 10, 70, 90);
            airline.addCargoPlain(aereo3);
            airline.addCargoPlain(aereo4);

            // calcolo capacitá totale aerei
            int totalCapacity = airline.getTotalCapacity();
            System.out.println("----------------------------");
            System.out.println("Capacita totale aerei: " + totalCapacity);
            System.out.println("----------------------------");

            // cerco in base al numero dei posti (4)
            // output previsto: Boing 758, Boing 784
            airline.searchBySeats(4);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("Test completato");
        }
    }
}

package ereditarieta;

class Car extends Vehicle {
    private String modelName = "Fiat";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        // * override
        Bike myBike = new Bike();
        myBike.honk();
        myBike.Saluta();
    }
}

class Bike extends Vehicle {
    public void honk() {
        System.out.println("drin drin");
    }

    public static void Saluta() {
        System.out.print("Metodo statico override");
    }
}

abstract class Vehicles {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicles {

    void start() {
        System.out.println("Car start with key");
    }
}

class Bike extends Vehicles {

    void start() {
        System.out.println("Bike stats with self-start");
    }
}

class Vehicle {
    public static void main(String [] args) {

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();

    }
}
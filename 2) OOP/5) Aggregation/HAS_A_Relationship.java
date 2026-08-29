class Engine {

    void start(){
        System.out.println("Engine Start");
    }
}

class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine  = engine;
    }

    void startCar() {

        engine.start();
        System.out.println("Car Starts");
    }
}

public class HAS_A_Relationship {
    public static void main(String [] args) {

        Engine e1 = new Engine();

        Car c1 = new Car(e1);

        c1.startCar();
    }
}

// Output //

// Engine Start
// Car Starts
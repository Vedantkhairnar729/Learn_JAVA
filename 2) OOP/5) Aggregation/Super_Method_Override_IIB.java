// Super Method Override + IIB

// Create a parent class Vehicle with a method:

// start()

// Override it in Car.

// Inside the Car instance initializer block:

// 1. Print "Car IIB"
// 2. Call the parent start() method using super.

// Then call the overridden method from the constructor.

class Vehicle {

    void start(){
        System.out.println("Vehicle Start");
    }
}

class Car extends Vehicle {

    // Instance Initializer Block
    {
        System.out.println("Car IIB");

        // Call parent method
        super.start();
    }

    // Overridden method
    @Override
    void start(){

        System.out.println("Car Start");

    }

    Car(){

        System.out.println("Car Constuctor");
        start();
    }

}

public class Super_Method_Override_IIB {
    public static void main(String [] args) {

        Car c1 = new Car();

    }
}
// Super with Parent Class Variable

// Create a Vehicle class with a variable speed = 80 and a Car class with a variable speed = 120.
// Use super to display the parent class's speed from the Car class.

class Vehicle {

    int speed = 80;

}

class Car extends Vehicle {

    int speed = 120;

    void desk() {

        System.out.println("Speed: " + super.speed);
        System.out.println("Speed: " + speed);
    }
}

public class Super_with_Parent_Class_Variable {
    public static void main(String [] args) {

        Car c1 = new Car();

        c1.desk();
    }
}
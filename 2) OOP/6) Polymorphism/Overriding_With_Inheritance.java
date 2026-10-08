class Vehicle {

    void start (){
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {

    @Override 

    void start() {
        System.out.println("Car Starts with key");
    }
}

public class Overriding_With_Inheritance {
    public static void main(String [] args) {
 
        Car c1 = new Car();

        c1.start(); 
         
    }
}
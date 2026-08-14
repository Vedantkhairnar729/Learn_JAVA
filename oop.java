class Car{
    String brand;
    int speed;

    void drive (){
        System.out.println(brand + " is driving at " + speed + "km/h");
    }
}



class oop{
    public static void main (String [] args){
        
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.speed = 250;

        car1.drive();

    }
}

    // A constructor is a special type of method that is used to initialize an object.
    // A constructor is automatically called when an object is created.
    // A constructor must have the same name as the class.
    // A constructor does not have a return type, not even void.
    // There are two common types of constructors:
    // Default Constructor – A constructor that does not have any parameters.
    // Parameterized Constructor – A constructor that accepts one or more parameters.  
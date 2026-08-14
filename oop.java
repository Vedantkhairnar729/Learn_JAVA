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


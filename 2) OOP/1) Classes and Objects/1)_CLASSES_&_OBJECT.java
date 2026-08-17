17. CLASSES & OBJECTS
Definition — Class: A class is a blueprint used to create objects.
Definition — Object: An object is an actual instance of a class.

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(
            brand + " is driving at " + speed + " km/h"
        );
    }
}

Create object:
Car car1 = new Car();

Set values:
car1.brand = "BMW";
car1.speed = 120;

Call method:
car1.drive();


QUICK LOGIC CHEAT SHEET
=============================================================================

Even              → num % 2 == 0
Odd               → num % 2 != 0
Divisible by n    → num % n == 0
Last digit        → num % 10
Remove last digit → num / 10
Counter           → count++
Sum               → sum = sum + value
Product           → result = result * value
String comparison → str.equals("value")
Array size        → arr.length
String size       → str.length()


----------------------------------
Example 1 — Basic object:
class Car {
    String brand;
}

Car car1 = new Car();
car1.brand = "BMW";

Example 2 — Object with two variables:
class Student {
    String name;
    int age;
}

Student s1 = new Student();
s1.name = "Vedant";
s1.age = 20;

Example 3 — Method in class:
class Car {
    void drive() {
        System.out.println("Car is driving");
    }
}

Car c1 = new Car();
c1.drive();

Example 4 — Variables + method:
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " at " + speed + " km/h");
    }
}

Car c1 = new Car();
c1.brand = "BMW";
c1.speed = 120;
c1.drive();

Example 5 — Multiple objects:
Car car1 = new Car();
Car car2 = new Car();

car1.brand = "BMW";
car2.brand = "Toyota";

car1.drive();
car2.drive();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Fruit_1{
    int price;
    String name;

    Fruit_1(){
        System.out.println("Constructor invoked ");
        System.out.println(name +" 1"+ price);
    }



    Fruit_1(String n, int p){
        name = n;
        price = p;
    }
    void display(){
        System.out.println(name+ " 2"+price);
    }
}



class newop{
    public static void main(String [] args){
        Fruit_1 F1 = new Fruit_1();
        Fruit_1 F2 = new Fruit_1();
        Fruit_1 F3 = new Fruit_1( "Apple",150 );

        F3.display();


    }
}
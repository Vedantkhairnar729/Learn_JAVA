
// inheritance
// IS-A
// ↓
// Dog IS-A Animal


//Aggregation 
// HAS-A
// ↓
// Student HAS-A Address

// 01 — Aggregation Basics
// Aggregation means one class contains a reference to another class's object.


class Address {

    String city;

    Address(String city) {

        this.city = city;

    }
}

class Student {

    String name;
    Address address; // like -----------------------------------------------------------

    Student(String name, Address address) {
        this.name = name;
        this.address = address; //--------------------------------------
    }

    void desk_1(){
        System.out.println("Name: " + name);
        System.out.println("City: " + address.city); //---------------------------------------------
    }
}

public class Aggregation_Basic {
    public static void main(String [] args) {
        
        Address a1 = new Address("Pune");
        Student s1 = new Student("Ani", a1); //--------------------------------------------------

        s1.desk_1();

    
    }
}

// Output//

// Name: Ani
// City: Pune
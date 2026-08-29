class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    String name;
    Address loco;  // This constructor expects an Address object/reference.
                   // is not creating a new Address.It is only declaring a reference.

    Student(String name, Address loco) {
        this.name = name;
        this.loco = loco; // Store the Address reference received by the constructor into the Student object's loco variable.
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Address: " + loco.city); //So you go through the Address reference:
    }
}

public class Aggregation_With_Constructor {
    public static void main(String [] args) {

        Address a1 = new Address("Pune"); // a1 can refer to a Student object.
        Student s1 = new Student("Vedant", a1); // s1 can refer to a Student object.

        s1.display();
        
    }
}

// Output //

//Name: Vedant
//Address: Pune


// Create Address Object
//         ↓
//        a1
//         ↓
// Pass a1 to Student
//         ↓
// Student stores Address reference
//         ↓
//        s1
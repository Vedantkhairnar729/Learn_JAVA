class Address {
    String city;

    Address(String city) {

        this.city = city;

    }
}

class Student {

    String name;
    Address location;

    Student(String name, Address location) {

        this.name = name;
        this.location = location;

    }
    
    void desk() {

        System.out.println(name + " - " + location.city);
    }
}

public class Aggregation_With_Multiple_Objects {
    public static void main(String [] args) {

        Address a1 = new Address("Pune");
        Address a2 = new Address("Goa");

        Student s1 = new Student("Avi",a1);
        Student s2 = new Student("Ani",a2);

        s1.desk();
        s2.desk();
    }
}

// Output //

Avi - Pune
Ani - Goa
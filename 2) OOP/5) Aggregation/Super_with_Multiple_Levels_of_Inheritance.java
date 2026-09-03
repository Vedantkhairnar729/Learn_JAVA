// Super with Multiple Levels of Inheritance

// Create the following hierarchy:

// Person
//    |
// Employee
//    |
// Manager

// Each class should contain a variable named role. In Manager, use super appropriately to access the parent class variable.

class Person {
    
    String role = "Person"; 

    void desk() {

        System.out.println("Role: " + role);

    }
}

class Employee extends Person {

    String role = "Employee";

    void desk() {

        System.out.println("Role: " + role);

    }

}
class Manager extends Employee {

    String role = "Manager";

    void desk() {

        System.out.println("Role: " + role);
        System.out.println("Role: " + super.role);

    }

}

public class Super_with_Multiple_Levels_of_Inheritance {
    public static void main(String [] args) {

        Manager m1 = new Manager();

        m1.desk();
    }
}

// Address add;
// add is an object reference variable inside Student.

class Address {

    String city;
}

class Student {

    String name = "Pune";

    Address add = new Address();    //----------------------------------------------------------

    void display() {

        System.out.println("Name: " + name);
        System.out.println("City: " + add.city);
    }
}

public class Object_as_Instance_Variable {
    public static void main(String [] args) {

        Student s1 = new Student();

        s1.display();
    }

}
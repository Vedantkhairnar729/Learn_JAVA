// Super with Constructor

// Create a Person class with a parameterized constructor accepting name and age. Create a Student class with an 
// additional variable course. Use super() to initialize the parent class variables.


class Person {
    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void desk_0() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {

        super(name, age);

        this.course = course;
    }
    
    void desk() {
        desk_0();

        System.out.println("Course: " + course);
    }

}

public class Super_with_Constructor {
    public static void main(String [] args) {

        Student s1 = new Student("Ani", 22, "CSE");

        s1.desk();
    }
}
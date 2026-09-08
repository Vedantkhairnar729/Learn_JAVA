// Basic Instance Initializer Block

// Create a Student class containing:
// - name
// - age

// Use an instance initializer block to print:

// "Student object is being created"

// Create three objects and observe how many times the initializer block executes.

class Student {
    String name;
    int age;

    {
        System.out.println("Student object is being created");
    }
}

public class Basic_Instance_Initializer_Block {
    public static void main(String [] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

    }
}
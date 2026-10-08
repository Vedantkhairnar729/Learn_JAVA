class Student {
    
    void desk(String name) {
        System.out.println("Student Name: " + name);
    }

    void desk(String name, int age) {
        System.out.println("New Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Overloading_With_Different_Parameters {
    public static void main(String [] args) {
        Student s1 = new Student();

        s1.desk("Ani");
        s1.desk("Avi",22);
    }
}

/*

Key point::

Changing only the return type is not method overloading.

int add(int a, int b)
double add(int a, int b)   // ❌ Not allowed
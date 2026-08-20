class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Parameterized_Constructor{
    public static void main(String[] args) {

        Student s1 = new Student("Vedant", 20);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
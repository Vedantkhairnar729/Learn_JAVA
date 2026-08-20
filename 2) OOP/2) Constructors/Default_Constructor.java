class Student {

    String name;
    int age;

    Student() {
        name = "Vedant";
        age = 20;
    }
}
public class Default_Constructor{
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Multiple_Constructors{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Vedant");
        Student s3 = new Student("Rahul", 21);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
    }
}
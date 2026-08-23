class person{
    String name;

    person(String name){
        this.name = name;
    }
}
class Student extends person{
    int age;

    Student(String name, int age ){
        super(name);
        this.age = age;
    }

    void desk(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class super_constructor{
    public static void main(String [] args){
        Student s1 = new Student("Ani",22);

        s1.desk();
    }
}
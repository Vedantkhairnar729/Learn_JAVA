class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Constructor_With_this{
    public static void main(String[] args) {

        Employee e1 = new Employee("Vedant", 50000);

        e1.display();
    }
}
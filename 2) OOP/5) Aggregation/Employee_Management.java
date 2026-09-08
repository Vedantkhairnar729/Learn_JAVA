// Real-Life Problem - Employee Management

// Create the following hierarchy:

// Employee
//    |
// Developer

// Employee class should contain:
// - name
// - salary
// - Constructor
// - Instance initializer block
// - displayEmployee()

// Developer class should contain:
// - language
// - Constructor
// - Instance initializer block
// - displayDeveloper()

// Requirements:
// - Use super() to initialize name and salary.
// - Use an IIB in both classes.
// - Display the complete developer information.
// - Observe the execution order of both IIBs and constructors.

class Employee {
    String name;
    double salary;

    {
        System.out.println("Employee IIB");
    }

    Employee(String name, double salary) {
        
        System.out.println("Employee Constructor");

        this.name = name;
        this.salary = salary;

    }

    void displayEmployee() {

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

}

class Developer extends Employee {

    String language;

    {
        System.out.println("Developer IIB");
    }

    Developer(String name, double salary, String language) {

        super(name, salary);

        System.out.println("Developer Constructor");

        this.language = language;

    }

    void displayDeveloper() {

        displayEmployee();
    
        System.out.println("Developer Language: " + language);

    }

}

public class Employee_Management {
    public static void main(String [] args) {

        Developer d1 = new Developer("Avi", 150000, "JAVA");

        System.out.println("\n--- Developer Details ---");


        d1.displayDeveloper();

    }
}